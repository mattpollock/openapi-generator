/*
 * Dummy
 *
 * To test name, parameter mapping options
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// PropertyNameMapping
    /// </summary>
    [DataContract(Name = "PropertyNameMapping")]
    public partial class PropertyNameMapping : IEquatable<PropertyNameMapping>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PropertyNameMapping" /> class.
        /// </summary>
        /// <param name="httpDebugOperation">httpDebugOperation.</param>
        /// <param name="underscoreType">underscoreType.</param>
        /// <param name="type">type.</param>
        /// <param name="typeWithUnderscore">typeWithUnderscore.</param>
        public PropertyNameMapping(string httpDebugOperation = default, string underscoreType = default, string type = default, string typeWithUnderscore = default)
        {
            this.HttpDebugOperation = httpDebugOperation;
            this.UnderscoreType = underscoreType;
            this.Type = type;
            this.TypeWithUnderscore = typeWithUnderscore;
        }

        /// <summary>
        /// Gets or Sets HttpDebugOperation
        /// </summary>
        [DataMember(Name = "http_debug_operation", EmitDefaultValue = false)]
        public string HttpDebugOperation { get; set; }

        /// <summary>
        /// Gets or Sets UnderscoreType
        /// </summary>
        [DataMember(Name = "_type", EmitDefaultValue = false)]
        public string UnderscoreType { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets TypeWithUnderscore
        /// </summary>
        [DataMember(Name = "type_", EmitDefaultValue = false)]
        public string TypeWithUnderscore { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PropertyNameMapping {\n");
            sb.Append("  HttpDebugOperation: ").Append(HttpDebugOperation).Append("\n");
            sb.Append("  UnderscoreType: ").Append(UnderscoreType).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  TypeWithUnderscore: ").Append(TypeWithUnderscore).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PropertyNameMapping);
        }

        /// <summary>
        /// Returns true if PropertyNameMapping instances are equal
        /// </summary>
        /// <param name="input">Instance of PropertyNameMapping to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PropertyNameMapping input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.HttpDebugOperation == input.HttpDebugOperation ||
                    (this.HttpDebugOperation != null &&
                    this.HttpDebugOperation.Equals(input.HttpDebugOperation))
                ) && 
                (
                    this.UnderscoreType == input.UnderscoreType ||
                    (this.UnderscoreType != null &&
                    this.UnderscoreType.Equals(input.UnderscoreType))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.TypeWithUnderscore == input.TypeWithUnderscore ||
                    (this.TypeWithUnderscore != null &&
                    this.TypeWithUnderscore.Equals(input.TypeWithUnderscore))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.HttpDebugOperation != null)
                {
                    hashCode = (hashCode * 59) + this.HttpDebugOperation.GetHashCode();
                }
                if (this.UnderscoreType != null)
                {
                    hashCode = (hashCode * 59) + this.UnderscoreType.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.TypeWithUnderscore != null)
                {
                    hashCode = (hashCode * 59) + this.TypeWithUnderscore.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
