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
 * Dealer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class Dealer {
  @SerializedName("id")
  private String id = null;

  @SerializedName("franchise_id")
  private String franchiseId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("car_type")
  private String carType = null;

  @SerializedName("target_url_new")
  private String targetUrlNew = null;

  @SerializedName("target_url_used")
  private String targetUrlUsed = null;

  @SerializedName("target_url_certified")
  private String targetUrlCertified = null;

  @SerializedName("dealer_type")
  private String dealerType = "independent";

  @SerializedName("rating")
  private BigDecimal rating = null;

  public Dealer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id associated with the dealer in the Marketcheck database
   * @return id
  **/
  @ApiModelProperty(value = "The unique id associated with the dealer in the Marketcheck database")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Dealer franchiseId(String franchiseId) {
    this.franchiseId = franchiseId;
    return this;
  }

   /**
   * Dealer franchise id
   * @return franchiseId
  **/
  @ApiModelProperty(value = "Dealer franchise id")
  public String getFranchiseId() {
    return franchiseId;
  }

  public void setFranchiseId(String franchiseId) {
    this.franchiseId = franchiseId;
  }

  public Dealer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the dealer
   * @return name
  **/
  @ApiModelProperty(value = "Name of the dealer")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dealer street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Street of the dealer
   * @return street
  **/
  @ApiModelProperty(value = "Street of the dealer")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Dealer city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City of the dealer
   * @return city
  **/
  @ApiModelProperty(value = "City of the dealer")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Dealer state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State of the dealer
   * @return state
  **/
  @ApiModelProperty(value = "State of the dealer")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Dealer zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Zip of the dealer
   * @return zip
  **/
  @ApiModelProperty(value = "Zip of the dealer")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Dealer latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latutide for the dealer location
   * @return latitude
  **/
  @ApiModelProperty(value = "Latutide for the dealer location")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Dealer longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude for the dealer location
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude for the dealer location")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Dealer phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Contact no of the dealer
   * @return phone
  **/
  @ApiModelProperty(value = "Contact no of the dealer")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Dealer carType(String carType) {
    this.carType = carType;
    return this;
  }

   /**
   * Car type new|used|certified
   * @return carType
  **/
  @ApiModelProperty(value = "Car type new|used|certified")
  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public Dealer targetUrlNew(String targetUrlNew) {
    this.targetUrlNew = targetUrlNew;
    return this;
  }

   /**
   * Target url for the new cars listing
   * @return targetUrlNew
  **/
  @ApiModelProperty(value = "Target url for the new cars listing")
  public String getTargetUrlNew() {
    return targetUrlNew;
  }

  public void setTargetUrlNew(String targetUrlNew) {
    this.targetUrlNew = targetUrlNew;
  }

  public Dealer targetUrlUsed(String targetUrlUsed) {
    this.targetUrlUsed = targetUrlUsed;
    return this;
  }

   /**
   * Target url for the used cars listing
   * @return targetUrlUsed
  **/
  @ApiModelProperty(value = "Target url for the used cars listing")
  public String getTargetUrlUsed() {
    return targetUrlUsed;
  }

  public void setTargetUrlUsed(String targetUrlUsed) {
    this.targetUrlUsed = targetUrlUsed;
  }

  public Dealer targetUrlCertified(String targetUrlCertified) {
    this.targetUrlCertified = targetUrlCertified;
    return this;
  }

   /**
   * Target url for the certified cars listing
   * @return targetUrlCertified
  **/
  @ApiModelProperty(value = "Target url for the certified cars listing")
  public String getTargetUrlCertified() {
    return targetUrlCertified;
  }

  public void setTargetUrlCertified(String targetUrlCertified) {
    this.targetUrlCertified = targetUrlCertified;
  }

  public Dealer dealerType(String dealerType) {
    this.dealerType = dealerType;
    return this;
  }

   /**
   * Dealer type - independent, franchise, multi-brand, authorized
   * @return dealerType
  **/
  @ApiModelProperty(value = "Dealer type - independent, franchise, multi-brand, authorized")
  public String getDealerType() {
    return dealerType;
  }

  public void setDealerType(String dealerType) {
    this.dealerType = dealerType;
  }

  public Dealer rating(BigDecimal rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Overall rating of the dealership on scale 1-5
   * @return rating
  **/
  @ApiModelProperty(value = "Overall rating of the dealership on scale 1-5")
  public BigDecimal getRating() {
    return rating;
  }

  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dealer dealer = (Dealer) o;
    return Objects.equals(this.id, dealer.id) &&
        Objects.equals(this.franchiseId, dealer.franchiseId) &&
        Objects.equals(this.name, dealer.name) &&
        Objects.equals(this.street, dealer.street) &&
        Objects.equals(this.city, dealer.city) &&
        Objects.equals(this.state, dealer.state) &&
        Objects.equals(this.zip, dealer.zip) &&
        Objects.equals(this.latitude, dealer.latitude) &&
        Objects.equals(this.longitude, dealer.longitude) &&
        Objects.equals(this.phone, dealer.phone) &&
        Objects.equals(this.carType, dealer.carType) &&
        Objects.equals(this.targetUrlNew, dealer.targetUrlNew) &&
        Objects.equals(this.targetUrlUsed, dealer.targetUrlUsed) &&
        Objects.equals(this.targetUrlCertified, dealer.targetUrlCertified) &&
        Objects.equals(this.dealerType, dealer.dealerType) &&
        Objects.equals(this.rating, dealer.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, franchiseId, name, street, city, state, zip, latitude, longitude, phone, carType, targetUrlNew, targetUrlUsed, targetUrlCertified, dealerType, rating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dealer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    franchiseId: ").append(toIndentedString(franchiseId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    carType: ").append(toIndentedString(carType)).append("\n");
    sb.append("    targetUrlNew: ").append(toIndentedString(targetUrlNew)).append("\n");
    sb.append("    targetUrlUsed: ").append(toIndentedString(targetUrlUsed)).append("\n");
    sb.append("    targetUrlCertified: ").append(toIndentedString(targetUrlCertified)).append("\n");
    sb.append("    dealerType: ").append(toIndentedString(dealerType)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

