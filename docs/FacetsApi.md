# FacetsApi

All URIs are relative to *https://marketcheck-prod.apigee.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFacets**](FacetsApi.md#getFacets) | **GET** /facets | Facets


<a name="getFacets"></a>
# **getFacets**
> List&lt;FacetItem&gt; getFacets(fields, apiKey, vin, year, make, model, trim)

Facets

[Merged with the /search API - Please check the &#39;facets&#39; parameter to the Search API above] Get the facets for the given simple filter criteria (by given VIN&#39;s basic specification, Or by Year, Make, Model, Trim criteria) and facet fields

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.FacetsApi;


FacetsApi apiInstance = new FacetsApi();
String fields = "fields_example"; // String | Comma separated list of fields to generate facets for. Supported fields are - year, make, model, trim, exterior_color, interior_color, drivetrain, vehicle_type, car_type, body_style, body_subtype, doors
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
String vin = "vin_example"; // String | VIN as a reference to the type of car for which facets data is to be returned
String year = "year_example"; // String | Year of the car
String make = "make_example"; // String | Make of the car
String model = "model_example"; // String | Model of the Car
String trim = "trim_example"; // String | Trim of the Car
try {
    List<FacetItem> result = apiInstance.getFacets(fields, apiKey, vin, year, make, model, trim);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FacetsApi#getFacets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**| Comma separated list of fields to generate facets for. Supported fields are - year, make, model, trim, exterior_color, interior_color, drivetrain, vehicle_type, car_type, body_style, body_subtype, doors |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]
 **vin** | **String**| VIN as a reference to the type of car for which facets data is to be returned | [optional]
 **year** | **String**| Year of the car | [optional]
 **make** | **String**| Make of the car | [optional]
 **model** | **String**| Model of the Car | [optional]
 **trim** | **String**| Trim of the Car | [optional]

### Return type

[**List&lt;FacetItem&gt;**](FacetItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

