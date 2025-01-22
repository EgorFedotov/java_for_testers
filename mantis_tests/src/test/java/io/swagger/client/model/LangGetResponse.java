/*
 * MantisBT REST API
 * For the sandbox to work, MantisBT must be hosted at the root folder of the host. For example: http://mantishost/ rather http://host/mantisbt.  If that is not the case, then create a host alias to map it as such or edit swagger.json to change basePath to include the mantisbt folder name.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LocalizedString;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LangGetResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-01-22T17:43:33.672+03:00")
public class LangGetResponse {
  @SerializedName("language")
  private String language = null;

  @SerializedName("strings")
  private List<LocalizedString> strings = null;

  public LangGetResponse language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public LangGetResponse strings(List<LocalizedString> strings) {
    this.strings = strings;
    return this;
  }

  public LangGetResponse addStringsItem(LocalizedString stringsItem) {
    if (this.strings == null) {
      this.strings = new ArrayList<LocalizedString>();
    }
    this.strings.add(stringsItem);
    return this;
  }

   /**
   * Get strings
   * @return strings
  **/
  @ApiModelProperty(value = "")
  public List<LocalizedString> getStrings() {
    return strings;
  }

  public void setStrings(List<LocalizedString> strings) {
    this.strings = strings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LangGetResponse langGetResponse = (LangGetResponse) o;
    return Objects.equals(this.language, langGetResponse.language) &&
        Objects.equals(this.strings, langGetResponse.strings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, strings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LangGetResponse {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    strings: ").append(toIndentedString(strings)).append("\n");
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

}

