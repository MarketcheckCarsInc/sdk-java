# GraphsApi

All URIs are relative to *https://marketcheck-prod.apigee.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPriceMilesPlotData**](GraphsApi.md#getPriceMilesPlotData) | **GET** /plots | Price, Miles plots data for given criteria


<a name="getPriceMilesPlotData"></a>
# **getPriceMilesPlotData**
> List&lt;PlotPoint&gt; getPriceMilesPlotData(carType, apiKey, vin, year, make, model, trim, rows)

Price, Miles plots data for given criteria

[DEPRECIATED Please check this in /search API using plot&#x3D;true]Get price, miles plot data for active cars matching the given VIN&#39;s basic specification or Year, Make, Model, Trim (Optional) criteria

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.GraphsApi;


GraphsApi apiInstance = new GraphsApi();
String carType = "carType_example"; // String | Car type to get the scatter plot data for
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
String vin = "vin_example"; // String | VIN as a reference to the type of car for which plot data is to be returned
String year = "year_example"; // String | Year of the car
String make = "make_example"; // String | Make of the car
String model = "model_example"; // String | Model of the Car
String trim = "trim_example"; // String | Trim of the Car
Integer rows = 56; // Integer | Number of results to return. Default is 1000. Max is 10000
try {
    List<PlotPoint> result = apiInstance.getPriceMilesPlotData(carType, apiKey, vin, year, make, model, trim, rows);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GraphsApi#getPriceMilesPlotData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carType** | **String**| Car type to get the scatter plot data for |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]
 **vin** | **String**| VIN as a reference to the type of car for which plot data is to be returned | [optional]
 **year** | **String**| Year of the car | [optional]
 **make** | **String**| Make of the car | [optional]
 **model** | **String**| Model of the Car | [optional]
 **trim** | **String**| Trim of the Car | [optional]
 **rows** | **Integer**| Number of results to return. Default is 1000. Max is 10000 | [optional]

### Return type

[**List&lt;PlotPoint&gt;**](PlotPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

