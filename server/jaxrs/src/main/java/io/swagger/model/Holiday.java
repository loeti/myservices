package io.swagger.model;

import java.util.Date;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class Holiday  { 
  /**
   * The date of the public holiday.
   **/
  private Date date = null;
  /**
   * Description of product.
   **/
  private String name = null;
  
  
  @ApiModelProperty(required = false, value = "The date of the public holiday.")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  @ApiModelProperty(required = false, value = "Description of product.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holiday {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
