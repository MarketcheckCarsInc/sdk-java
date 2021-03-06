/*
 * Marketcheck Cars API
 * <b>Access the New, Used and Certified cars inventories for all Car Dealers in US.</b> <br/>The data is sourced from online listings by over 44,000 Car dealers in US. At any time, there are about 6.2M searchable listings (about 1.9M unique VINs) for Used & Certified cars and about 6.6M (about 3.9M unique VINs) New Car listings from all over US. We use this API at the back for our website <a href='https://www.marketcheck.com' target='_blank'>www.marketcheck.com</a> and our Android and iOS mobile apps too.<br/><h5> Few useful links : </h5><ul><li>A quick view of the API and the use cases is depicated <a href='https://portals.marketcheck.com/mcapi/' target='_blank'>here</a></li><li>The Postman collection with various usages of the API is shared here https://www.getpostman.com/collections/2752684ff636cdd7bac2</li></ul>
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package marketcheck.cars.api..client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Describes the Car specification
 */
@ApiModel(description = "Describes the Car specification")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class Build {
  @SerializedName("year")
  private BigDecimal year = null;

  @SerializedName("make")
  private String make = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("trim")
  private String trim = null;

  @SerializedName("body_type")
  private String bodyType = null;

  @SerializedName("vehicle_type")
  private String vehicleType = null;

  @SerializedName("drivetrain")
  private String drivetrain = null;

  @SerializedName("fuel_type")
  private String fuelType = null;

  @SerializedName("made_in")
  private String madeIn = null;

  @SerializedName("engine")
  private String engine = null;

  @SerializedName("engine_block")
  private String engineBlock = null;

  @SerializedName("engine_size")
  private String engineSize = null;

  @SerializedName("engine_measure")
  private String engineMeasure = null;

  @SerializedName("engine_aspiration")
  private String engineAspiration = null;

  @SerializedName("transmission")
  private String transmission = null;

  @SerializedName("doors")
  private BigDecimal doors = null;

  @SerializedName("cylinders")
  private BigDecimal cylinders = null;

  @SerializedName("steering_type")
  private String steeringType = null;

  @SerializedName("antibrake_sys")
  private String antibrakeSys = null;

  @SerializedName("tank_size")
  private String tankSize = null;

  @SerializedName("overall_height")
  private String overallHeight = null;

  @SerializedName("overall_length")
  private String overallLength = null;

  @SerializedName("overall_width")
  private String overallWidth = null;

  @SerializedName("std_seating")
  private String stdSeating = null;

  @SerializedName("highway_miles")
  private String highwayMiles = null;

  @SerializedName("city_miles")
  private String cityMiles = null;

  public Build year(BigDecimal year) {
    this.year = year;
    return this;
  }

   /**
   * Year of the Car
   * @return year
  **/
  @ApiModelProperty(value = "Year of the Car")
  public BigDecimal getYear() {
    return year;
  }

  public void setYear(BigDecimal year) {
    this.year = year;
  }

  public Build make(String make) {
    this.make = make;
    return this;
  }

   /**
   * Car Make
   * @return make
  **/
  @ApiModelProperty(value = "Car Make")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Build model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Car model
   * @return model
  **/
  @ApiModelProperty(value = "Car model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Build trim(String trim) {
    this.trim = trim;
    return this;
  }

   /**
   * Trim of the car
   * @return trim
  **/
  @ApiModelProperty(value = "Trim of the car")
  public String getTrim() {
    return trim;
  }

  public void setTrim(String trim) {
    this.trim = trim;
  }

  public Build bodyType(String bodyType) {
    this.bodyType = bodyType;
    return this;
  }

   /**
   * Body type of the car
   * @return bodyType
  **/
  @ApiModelProperty(value = "Body type of the car")
  public String getBodyType() {
    return bodyType;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  public Build vehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

   /**
   * Vehicle type of the car
   * @return vehicleType
  **/
  @ApiModelProperty(value = "Vehicle type of the car")
  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public Build drivetrain(String drivetrain) {
    this.drivetrain = drivetrain;
    return this;
  }

   /**
   * Drivetrain of the car
   * @return drivetrain
  **/
  @ApiModelProperty(value = "Drivetrain of the car")
  public String getDrivetrain() {
    return drivetrain;
  }

  public void setDrivetrain(String drivetrain) {
    this.drivetrain = drivetrain;
  }

  public Build fuelType(String fuelType) {
    this.fuelType = fuelType;
    return this;
  }

   /**
   * Fuel type of the car
   * @return fuelType
  **/
  @ApiModelProperty(value = "Fuel type of the car")
  public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public Build madeIn(String madeIn) {
    this.madeIn = madeIn;
    return this;
  }

   /**
   * Made in of the car
   * @return madeIn
  **/
  @ApiModelProperty(value = "Made in of the car")
  public String getMadeIn() {
    return madeIn;
  }

  public void setMadeIn(String madeIn) {
    this.madeIn = madeIn;
  }

  public Build engine(String engine) {
    this.engine = engine;
    return this;
  }

   /**
   * Engine of the car
   * @return engine
  **/
  @ApiModelProperty(value = "Engine of the car")
  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public Build engineBlock(String engineBlock) {
    this.engineBlock = engineBlock;
    return this;
  }

   /**
   * Engine block of the car
   * @return engineBlock
  **/
  @ApiModelProperty(value = "Engine block of the car")
  public String getEngineBlock() {
    return engineBlock;
  }

  public void setEngineBlock(String engineBlock) {
    this.engineBlock = engineBlock;
  }

  public Build engineSize(String engineSize) {
    this.engineSize = engineSize;
    return this;
  }

   /**
   * Engine size of the car
   * @return engineSize
  **/
  @ApiModelProperty(value = "Engine size of the car")
  public String getEngineSize() {
    return engineSize;
  }

  public void setEngineSize(String engineSize) {
    this.engineSize = engineSize;
  }

  public Build engineMeasure(String engineMeasure) {
    this.engineMeasure = engineMeasure;
    return this;
  }

   /**
   * Engine block of the car
   * @return engineMeasure
  **/
  @ApiModelProperty(value = "Engine block of the car")
  public String getEngineMeasure() {
    return engineMeasure;
  }

  public void setEngineMeasure(String engineMeasure) {
    this.engineMeasure = engineMeasure;
  }

  public Build engineAspiration(String engineAspiration) {
    this.engineAspiration = engineAspiration;
    return this;
  }

   /**
   * Engine aspiration of the car
   * @return engineAspiration
  **/
  @ApiModelProperty(value = "Engine aspiration of the car")
  public String getEngineAspiration() {
    return engineAspiration;
  }

  public void setEngineAspiration(String engineAspiration) {
    this.engineAspiration = engineAspiration;
  }

  public Build transmission(String transmission) {
    this.transmission = transmission;
    return this;
  }

   /**
   * Transmission of the car
   * @return transmission
  **/
  @ApiModelProperty(value = "Transmission of the car")
  public String getTransmission() {
    return transmission;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public Build doors(BigDecimal doors) {
    this.doors = doors;
    return this;
  }

   /**
   * No of doors of the car
   * @return doors
  **/
  @ApiModelProperty(value = "No of doors of the car")
  public BigDecimal getDoors() {
    return doors;
  }

  public void setDoors(BigDecimal doors) {
    this.doors = doors;
  }

  public Build cylinders(BigDecimal cylinders) {
    this.cylinders = cylinders;
    return this;
  }

   /**
   * No of cylinders of the car
   * @return cylinders
  **/
  @ApiModelProperty(value = "No of cylinders of the car")
  public BigDecimal getCylinders() {
    return cylinders;
  }

  public void setCylinders(BigDecimal cylinders) {
    this.cylinders = cylinders;
  }

  public Build steeringType(String steeringType) {
    this.steeringType = steeringType;
    return this;
  }

   /**
   * Steering type of the car
   * @return steeringType
  **/
  @ApiModelProperty(value = "Steering type of the car")
  public String getSteeringType() {
    return steeringType;
  }

  public void setSteeringType(String steeringType) {
    this.steeringType = steeringType;
  }

  public Build antibrakeSys(String antibrakeSys) {
    this.antibrakeSys = antibrakeSys;
    return this;
  }

   /**
   * Antibrake system of the car
   * @return antibrakeSys
  **/
  @ApiModelProperty(value = "Antibrake system of the car")
  public String getAntibrakeSys() {
    return antibrakeSys;
  }

  public void setAntibrakeSys(String antibrakeSys) {
    this.antibrakeSys = antibrakeSys;
  }

  public Build tankSize(String tankSize) {
    this.tankSize = tankSize;
    return this;
  }

   /**
   * Tank size of the car
   * @return tankSize
  **/
  @ApiModelProperty(value = "Tank size of the car")
  public String getTankSize() {
    return tankSize;
  }

  public void setTankSize(String tankSize) {
    this.tankSize = tankSize;
  }

  public Build overallHeight(String overallHeight) {
    this.overallHeight = overallHeight;
    return this;
  }

   /**
   * Overall height of the car
   * @return overallHeight
  **/
  @ApiModelProperty(value = "Overall height of the car")
  public String getOverallHeight() {
    return overallHeight;
  }

  public void setOverallHeight(String overallHeight) {
    this.overallHeight = overallHeight;
  }

  public Build overallLength(String overallLength) {
    this.overallLength = overallLength;
    return this;
  }

   /**
   * Overall length of the car
   * @return overallLength
  **/
  @ApiModelProperty(value = "Overall length of the car")
  public String getOverallLength() {
    return overallLength;
  }

  public void setOverallLength(String overallLength) {
    this.overallLength = overallLength;
  }

  public Build overallWidth(String overallWidth) {
    this.overallWidth = overallWidth;
    return this;
  }

   /**
   * Overall width of the car
   * @return overallWidth
  **/
  @ApiModelProperty(value = "Overall width of the car")
  public String getOverallWidth() {
    return overallWidth;
  }

  public void setOverallWidth(String overallWidth) {
    this.overallWidth = overallWidth;
  }

  public Build stdSeating(String stdSeating) {
    this.stdSeating = stdSeating;
    return this;
  }

   /**
   * Std seating of the car
   * @return stdSeating
  **/
  @ApiModelProperty(value = "Std seating of the car")
  public String getStdSeating() {
    return stdSeating;
  }

  public void setStdSeating(String stdSeating) {
    this.stdSeating = stdSeating;
  }

  public Build highwayMiles(String highwayMiles) {
    this.highwayMiles = highwayMiles;
    return this;
  }

   /**
   * Highway miles of the car
   * @return highwayMiles
  **/
  @ApiModelProperty(value = "Highway miles of the car")
  public String getHighwayMiles() {
    return highwayMiles;
  }

  public void setHighwayMiles(String highwayMiles) {
    this.highwayMiles = highwayMiles;
  }

  public Build cityMiles(String cityMiles) {
    this.cityMiles = cityMiles;
    return this;
  }

   /**
   * City miles of the car
   * @return cityMiles
  **/
  @ApiModelProperty(value = "City miles of the car")
  public String getCityMiles() {
    return cityMiles;
  }

  public void setCityMiles(String cityMiles) {
    this.cityMiles = cityMiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Build build = (Build) o;
    return Objects.equals(this.year, build.year) &&
        Objects.equals(this.make, build.make) &&
        Objects.equals(this.model, build.model) &&
        Objects.equals(this.trim, build.trim) &&
        Objects.equals(this.bodyType, build.bodyType) &&
        Objects.equals(this.vehicleType, build.vehicleType) &&
        Objects.equals(this.drivetrain, build.drivetrain) &&
        Objects.equals(this.fuelType, build.fuelType) &&
        Objects.equals(this.madeIn, build.madeIn) &&
        Objects.equals(this.engine, build.engine) &&
        Objects.equals(this.engineBlock, build.engineBlock) &&
        Objects.equals(this.engineSize, build.engineSize) &&
        Objects.equals(this.engineMeasure, build.engineMeasure) &&
        Objects.equals(this.engineAspiration, build.engineAspiration) &&
        Objects.equals(this.transmission, build.transmission) &&
        Objects.equals(this.doors, build.doors) &&
        Objects.equals(this.cylinders, build.cylinders) &&
        Objects.equals(this.steeringType, build.steeringType) &&
        Objects.equals(this.antibrakeSys, build.antibrakeSys) &&
        Objects.equals(this.tankSize, build.tankSize) &&
        Objects.equals(this.overallHeight, build.overallHeight) &&
        Objects.equals(this.overallLength, build.overallLength) &&
        Objects.equals(this.overallWidth, build.overallWidth) &&
        Objects.equals(this.stdSeating, build.stdSeating) &&
        Objects.equals(this.highwayMiles, build.highwayMiles) &&
        Objects.equals(this.cityMiles, build.cityMiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, make, model, trim, bodyType, vehicleType, drivetrain, fuelType, madeIn, engine, engineBlock, engineSize, engineMeasure, engineAspiration, transmission, doors, cylinders, steeringType, antibrakeSys, tankSize, overallHeight, overallLength, overallWidth, stdSeating, highwayMiles, cityMiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Build {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    trim: ").append(toIndentedString(trim)).append("\n");
    sb.append("    bodyType: ").append(toIndentedString(bodyType)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    drivetrain: ").append(toIndentedString(drivetrain)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    madeIn: ").append(toIndentedString(madeIn)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    engineBlock: ").append(toIndentedString(engineBlock)).append("\n");
    sb.append("    engineSize: ").append(toIndentedString(engineSize)).append("\n");
    sb.append("    engineMeasure: ").append(toIndentedString(engineMeasure)).append("\n");
    sb.append("    engineAspiration: ").append(toIndentedString(engineAspiration)).append("\n");
    sb.append("    transmission: ").append(toIndentedString(transmission)).append("\n");
    sb.append("    doors: ").append(toIndentedString(doors)).append("\n");
    sb.append("    cylinders: ").append(toIndentedString(cylinders)).append("\n");
    sb.append("    steeringType: ").append(toIndentedString(steeringType)).append("\n");
    sb.append("    antibrakeSys: ").append(toIndentedString(antibrakeSys)).append("\n");
    sb.append("    tankSize: ").append(toIndentedString(tankSize)).append("\n");
    sb.append("    overallHeight: ").append(toIndentedString(overallHeight)).append("\n");
    sb.append("    overallLength: ").append(toIndentedString(overallLength)).append("\n");
    sb.append("    overallWidth: ").append(toIndentedString(overallWidth)).append("\n");
    sb.append("    stdSeating: ").append(toIndentedString(stdSeating)).append("\n");
    sb.append("    highwayMiles: ").append(toIndentedString(highwayMiles)).append("\n");
    sb.append("    cityMiles: ").append(toIndentedString(cityMiles)).append("\n");
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

