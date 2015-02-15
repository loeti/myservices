package io.swagger.model;


import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class Error  { 
  /**
   **/
  private Integer code = null;
  /**
   **/
  private String message = null;
  /**
   **/
  private String fields = null;
  
  
  @ApiModelProperty(required = false, value = "")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  @ApiModelProperty(required = false, value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  @ApiModelProperty(required = false, value = "")
  public String getFields() {
    return fields;
  }
  public void setFields(String fields) {
    this.fields = fields;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  fields: ").append(fields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
