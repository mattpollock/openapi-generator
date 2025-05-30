/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.templating.mustache;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.Writer;

/**
 * This naively prepends indention to all lines of a fragment.
 * <p>
 * Generator authors may add helpers for explicitly adding prefixed spaces which fragments won't be aware of.
 * <p>
 * Register:
 * <pre>
 * additionalProperties.put("indent4", new IndentedLambda(4));
 * additionalProperties.put("indent8", new IndentedLambda(8));
 * </pre>
 * <p>
 * Use:
 * <pre>{@code
 *     {{#indent4}}{{>template}}{{/indent4}}
 *         {{#indent8}}{{>other_template}}{{/indent8}}
 * }</pre>
 */
public class IndentedLambda implements Mustache.Lambda {
    private final int prefixSpaceCount;
    private final String prefix;
    private final int spaceCode;
    private final boolean indentFirstLine;
    private final boolean skipEmptyLines;

    /**
     * Constructs a new instance of {@link IndentedLambda}, with an indent count of 4 spaces
     */
    public IndentedLambda() {
        this(4, " ", null, false, false);
    }

    /**
     * Constructs a new instance of {@link IndentedLambda}, with customized indent count and intention character
     *
     * @param prefixSpaceCount   The number of indented characters to apply as a prefix to a fragment.
     * @param indentionCharacter String representation of the character used in the indent (e.g. " ", "\t", ".").
     * @param indentFirstLine    Whether to indent the first line or not. Usually this is handled by the template already.
     */
    public IndentedLambda(int prefixSpaceCount, String indentionCharacter, boolean indentFirstLine, boolean skipEmptyLines) {
        this(prefixSpaceCount, Character.codePointAt(indentionCharacter, 0), null, indentFirstLine, skipEmptyLines);
    }

    /**
     * Constructs a new instance of {@link IndentedLambda}, with customized indent count and intention character
     *
     * @param prefixSpaceCount   The number of indented characters to apply as a prefix to a fragment.
     * @param indentionCharacter String representation of the character used in the indent (e.g. " ", "\t", ".").
     * @param prefix             An optional prefix to prepend before the line (useful for multi-line comments).
     * @param indentFirstLine    Whether to indent the first line or not. Usually this is handled by the template already.
     */
    public IndentedLambda(int prefixSpaceCount, String indentionCharacter, String prefix, boolean indentFirstLine, boolean skipEmptyLines) {
        this(prefixSpaceCount, Character.codePointAt(indentionCharacter, 0), prefix, indentFirstLine, skipEmptyLines);
    }

    /**
     * Constructs a new instance of {@link IndentedLambda}
     *
     * @param prefixSpaceCount   The number of indented characters to apply as a prefix to a fragment.
     * @param indentionCodePoint Code point of the single character used for indentation.
     * @param prefix             An optional prefix to prepend before the line (useful for multi-line comments).
     * @param indentFirstLine    Whether to indent the first line or not. Usually this is handled by the template already.
     */
    private IndentedLambda(int prefixSpaceCount, int indentionCodePoint, String prefix, boolean indentFirstLine, boolean skipEmptyLines) {
        if (prefixSpaceCount <= 0) {
            throw new IllegalArgumentException("prefixSpaceCount must be greater than 0");
        }

        if (!Character.isValidCodePoint(indentionCodePoint)) {
            throw new IllegalArgumentException("indentionCodePoint is an invalid code point ");
        }

        this.prefixSpaceCount = prefixSpaceCount;
        this.spaceCode = indentionCodePoint;
        this.prefix = prefix;
        this.indentFirstLine = indentFirstLine;
        this.skipEmptyLines = skipEmptyLines;
    }

    @Override
    public void execute(Template.Fragment fragment, Writer writer) throws IOException {
        String text = fragment.execute();
        if (text == null || text.length() == 0) {
            return;
        }

        String prefixedIndention = StringUtils.repeat(new String(Character.toChars(spaceCode)), prefixSpaceCount);
        StringBuilder sb = new StringBuilder();
        // use \n instead of System.lineSeparator (e.g. \r\n in Windows) as templates use \n
        String[] lines = text.split("\n", -1);
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            // Mustache will apply correct indentation to the first line of a template (to match declaration location).
            // So, we want to skip the first line.
            if (this.indentFirstLine || i > 0) {
                if (!this.skipEmptyLines || line.trim().length() > 0) {
                    sb.append(prefixedIndention);
                }
                if (prefix != null) sb.append(prefix);
            }

            sb.append(line);

            // We've split on \n. We don't want to add an additional trailing line.
            if (i < lines.length - 1) {
                sb.append("\n");
            }
        }
        writer.write(sb.toString());
    }
}
