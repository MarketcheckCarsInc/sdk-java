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
import java.util.ArrayList;
import java.util.List;
import marketcheck.cars.api..client.model.BaseListing;

/**
 * Search query response
 */
@ApiModel(description = "Search query response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-09T10:14:35.317+05:30")
public class SearchResponse {
  @SerializedName("num_found")
  private BigDecimal numFound = null;

  @SerializedName("listings")
  private List<BaseListing> listings = null;

  public SearchResponse numFound(BigDecimal numFound) {
    this.numFound = numFound;
    return this;
  }

   /**
   * The number of listings found
   * @return numFound
  **/
  @ApiModelProperty(value = "The number of listings found")
  public BigDecimal getNumFound() {
    return numFound;
  }

  public void setNumFound(BigDecimal numFound) {
    this.numFound = numFound;
  }

  public SearchResponse listings(List<BaseListing> listings) {
    this.listings = listings;
    return this;
  }

  public SearchResponse addListingsItem(BaseListing listingsItem) {
    if (this.listings == null) {
      this.listings = new ArrayList<BaseListing>();
    }
    this.listings.add(listingsItem);
    return this;
  }

   /**
   * Get listings
   * @return listings
  **/
  @ApiModelProperty(value = "")
  public List<BaseListing> getListings() {
    return listings;
  }

  public void setListings(List<BaseListing> listings) {
    this.listings = listings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponse searchResponse = (SearchResponse) o;
    return Objects.equals(this.numFound, searchResponse.numFound) &&
        Objects.equals(this.listings, searchResponse.listings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numFound, listings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponse {\n");
    
    sb.append("    numFound: ").append(toIndentedString(numFound)).append("\n");
    sb.append("    listings: ").append(toIndentedString(listings)).append("\n");
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

