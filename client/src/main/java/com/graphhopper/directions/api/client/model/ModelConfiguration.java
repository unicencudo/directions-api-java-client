/*
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.graphhopper.directions.api.client.model.Routing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ModelConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-23T23:21:18.836+02:00")
public class ModelConfiguration {
  @SerializedName("routing")
  private Routing routing = null;

  public ModelConfiguration routing(Routing routing) {
    this.routing = routing;
    return this;
  }

   /**
   * Get routing
   * @return routing
  **/
  @ApiModelProperty(example = "null", value = "")
  public Routing getRouting() {
    return routing;
  }

  public void setRouting(Routing routing) {
    this.routing = routing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfiguration _configuration = (ModelConfiguration) o;
    return Objects.equals(this.routing, _configuration.routing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

