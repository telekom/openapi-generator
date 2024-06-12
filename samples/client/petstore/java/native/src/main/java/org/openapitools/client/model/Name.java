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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.ApiClient;
/**
 * Model for testing model name same as property name
 */
@JsonPropertyOrder({
  Name.JSON_PROPERTY_NAME,
  Name.JSON_PROPERTY_SNAKE_CASE,
  Name.JSON_PROPERTY_PROPERTY,
  Name.JSON_PROPERTY_123NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class Name {
  public static final String JSON_PROPERTY_NAME = "name";
  private Integer name;

  public static final String JSON_PROPERTY_SNAKE_CASE = "snake_case";
  private Integer snakeCase;

  public static final String JSON_PROPERTY_PROPERTY = "property";
  private String property;

  public static final String JSON_PROPERTY_123NUMBER = "123Number";
  private Integer _123number;

  public Name() { 
  }

  @JsonCreator
  public Name(
    @JsonProperty(JSON_PROPERTY_SNAKE_CASE) Integer snakeCase, 
    @JsonProperty(JSON_PROPERTY_123NUMBER) Integer _123number
  ) {
  this();
    this.snakeCase = snakeCase;
    this._123number = _123number;
  }

  public Name name(Integer name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(Integer name) {
    this.name = name;
  }


   /**
   * Get snakeCase
   * @return snakeCase
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAKE_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSnakeCase() {
    return snakeCase;
  }




  public Name property(String property) {
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProperty() {
    return property;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperty(String property) {
    this.property = property;
  }


   /**
   * Get _123number
   * @return _123number
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_123NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer get123number() {
    return _123number;
  }




  /**
   * Return true if this Name object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123number, name._123number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123number: ").append(toIndentedString(_123number)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `snake_case` to the URL query string
    if (getSnakeCase() != null) {
      joiner.add(String.format("%ssnake_case%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSnakeCase()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `property` to the URL query string
    if (getProperty() != null) {
      joiner.add(String.format("%sproperty%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProperty()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `123Number` to the URL query string
    if (get123number() != null) {
      joiner.add(String.format("%s123Number%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(get123number()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }

    public static class Builder {

    private Name instance;

    public Builder() {
      this(new Name());
    }

    protected Builder(Name instance) {
      this.instance = instance;
    }

    public Name.Builder name(Integer name) {
      this.instance.name = name;
      return this;
    }
    public Name.Builder snakeCase(Integer snakeCase) {
      this.instance.snakeCase = snakeCase;
      return this;
    }
    public Name.Builder property(String property) {
      this.instance.property = property;
      return this;
    }
    public Name.Builder _123number(Integer _123number) {
      this.instance._123number = _123number;
      return this;
    }


    /**
    * returns a built Name instance.
    *
    * The builder is not reusable.
    */
    public Name build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static Name.Builder builder() {
    return new Name.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Name.Builder toBuilder() {
    return new Name.Builder()
      .name(getName())
      .snakeCase(getSnakeCase())
      .property(getProperty())
      ._123number(get123number());
  }

}

