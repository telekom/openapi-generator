// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Role report Hash
    /// </summary>
    public partial class RolesReportsHash : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RolesReportsHash" /> class.
        /// </summary>
        /// <param name="role">role</param>
        /// <param name="roleUuid">roleUuid</param>
        [JsonConstructor]
        public RolesReportsHash(Option<RolesReportsHashRole?> role = default, Option<Guid?> roleUuid = default)
        {
            RoleOption = role;
            RoleUuidOption = roleUuid;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Used to track the state of Role
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<RolesReportsHashRole?> RoleOption { get; private set; }

        /// <summary>
        /// Gets or Sets Role
        /// </summary>
        [JsonPropertyName("role")]
        public RolesReportsHashRole? Role { get { return this.RoleOption; } set { this.RoleOption = new(value); } }

        /// <summary>
        /// Used to track the state of RoleUuid
        /// </summary>
        [JsonIgnore]
        [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
        public Option<Guid?> RoleUuidOption { get; private set; }

        /// <summary>
        /// Gets or Sets RoleUuid
        /// </summary>
        [JsonPropertyName("role_uuid")]
        public Guid? RoleUuid { get { return this.RoleUuidOption; } set { this.RoleUuidOption = new(value); } }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RolesReportsHash {\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  RoleUuid: ").Append(RoleUuid).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="RolesReportsHash" />
    /// </summary>
    public class RolesReportsHashJsonConverter : JsonConverter<RolesReportsHash>
    {
        /// <summary>
        /// Deserializes json to <see cref="RolesReportsHash" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override RolesReportsHash Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Option<RolesReportsHashRole?> role = default;
            Option<Guid?> roleUuid = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "role":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                role = new Option<RolesReportsHashRole?>(JsonSerializer.Deserialize<RolesReportsHashRole>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        case "role_uuid":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                roleUuid = new Option<Guid?>(utf8JsonReader.GetGuid());
                            break;
                        default:
                            break;
                    }
                }
            }

            if (role.IsSet && role.Value == null)
                throw new ArgumentNullException(nameof(role), "Property is not nullable for class RolesReportsHash.");

            if (roleUuid.IsSet && roleUuid.Value == null)
                throw new ArgumentNullException(nameof(roleUuid), "Property is not nullable for class RolesReportsHash.");

            return new RolesReportsHash(role, roleUuid);
        }

        /// <summary>
        /// Serializes a <see cref="RolesReportsHash" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="rolesReportsHash"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, RolesReportsHash rolesReportsHash, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            WriteProperties(writer, rolesReportsHash, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="RolesReportsHash" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="rolesReportsHash"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(Utf8JsonWriter writer, RolesReportsHash rolesReportsHash, JsonSerializerOptions jsonSerializerOptions)
        {
            if (rolesReportsHash.RoleOption.IsSet && rolesReportsHash.Role == null)
                throw new ArgumentNullException(nameof(rolesReportsHash.Role), "Property is required for class RolesReportsHash.");

            if (rolesReportsHash.RoleOption.IsSet)
            {
                writer.WritePropertyName("role");
                JsonSerializer.Serialize(writer, rolesReportsHash.Role, jsonSerializerOptions);
            }
            if (rolesReportsHash.RoleUuidOption.IsSet)
                writer.WriteString("role_uuid", rolesReportsHash.RoleUuidOption.Value!.Value);
        }
    }
}
