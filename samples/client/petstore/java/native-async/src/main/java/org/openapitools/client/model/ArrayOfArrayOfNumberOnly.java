/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.ApiClient;
/**
 * ArrayOfArrayOfNumberOnly
 */
@JsonPropertyOrder({
  ArrayOfArrayOfNumberOnly.JSON_PROPERTY_ARRAY_ARRAY_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class ArrayOfArrayOfNumberOnly {
  public static final String JSON_PROPERTY_ARRAY_ARRAY_NUMBER = "ArrayArrayNumber";
  @javax.annotation.Nullable
  private List<List<BigDecimal>> arrayArrayNumber = new ArrayList<>();

  public ArrayOfArrayOfNumberOnly() { 
  }

  public ArrayOfArrayOfNumberOnly arrayArrayNumber(@javax.annotation.Nullable List<List<BigDecimal>> arrayArrayNumber) {
    this.arrayArrayNumber = arrayArrayNumber;
    return this;
  }

  public ArrayOfArrayOfNumberOnly addArrayArrayNumberItem(List<BigDecimal> arrayArrayNumberItem) {
    if (this.arrayArrayNumber == null) {
      this.arrayArrayNumber = new ArrayList<>();
    }
    this.arrayArrayNumber.add(arrayArrayNumberItem);
    return this;
  }

  /**
   * Get arrayArrayNumber
   * @return arrayArrayNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_ARRAY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<BigDecimal>> getArrayArrayNumber() {
    return arrayArrayNumber;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_ARRAY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayArrayNumber(@javax.annotation.Nullable List<List<BigDecimal>> arrayArrayNumber) {
    this.arrayArrayNumber = arrayArrayNumber;
  }


  /**
   * Return true if this ArrayOfArrayOfNumberOnly object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayOfArrayOfNumberOnly arrayOfArrayOfNumberOnly = (ArrayOfArrayOfNumberOnly) o;
    return Objects.equals(this.arrayArrayNumber, arrayOfArrayOfNumberOnly.arrayArrayNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayArrayNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayOfArrayOfNumberOnly {\n");
    sb.append("    arrayArrayNumber: ").append(toIndentedString(arrayArrayNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `ArrayArrayNumber` to the URL query string
    if (getArrayArrayNumber() != null) {
      for (int i = 0; i < getArrayArrayNumber().size(); i++) {
        if (getArrayArrayNumber().get(i) != null) {
          joiner.add(String.format("%sArrayArrayNumber%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getArrayArrayNumber().get(i)))));
        }
      }
    }

    return joiner.toString();
  }
}

