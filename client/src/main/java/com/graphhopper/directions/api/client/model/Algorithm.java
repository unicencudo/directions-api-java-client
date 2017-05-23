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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Algorithm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-23T23:21:18.836+02:00")
public class Algorithm {
  /**
   * Gets or Sets problemType
   */
  public enum ProblemTypeEnum {
    @SerializedName("min")
    MIN("min"),
    
    @SerializedName("min-max")
    MIN_MAX("min-max");

    private String value;

    ProblemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("problem_type")
  private ProblemTypeEnum problemType = null;

  /**
   * Gets or Sets objective
   */
  public enum ObjectiveEnum {
    @SerializedName("transport_time")
    TRANSPORT_TIME("transport_time"),
    
    @SerializedName("completion_time")
    COMPLETION_TIME("completion_time");

    private String value;

    ObjectiveEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("objective")
  private ObjectiveEnum objective = null;

  public Algorithm problemType(ProblemTypeEnum problemType) {
    this.problemType = problemType;
    return this;
  }

   /**
   * Get problemType
   * @return problemType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProblemTypeEnum getProblemType() {
    return problemType;
  }

  public void setProblemType(ProblemTypeEnum problemType) {
    this.problemType = problemType;
  }

  public Algorithm objective(ObjectiveEnum objective) {
    this.objective = objective;
    return this;
  }

   /**
   * Get objective
   * @return objective
  **/
  @ApiModelProperty(example = "null", value = "")
  public ObjectiveEnum getObjective() {
    return objective;
  }

  public void setObjective(ObjectiveEnum objective) {
    this.objective = objective;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Algorithm algorithm = (Algorithm) o;
    return Objects.equals(this.problemType, algorithm.problemType) &&
        Objects.equals(this.objective, algorithm.objective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(problemType, objective);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Algorithm {\n");
    
    sb.append("    problemType: ").append(toIndentedString(problemType)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
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

