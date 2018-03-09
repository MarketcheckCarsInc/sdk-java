# HistoryApi

All URIs are relative to *https://marketcheck-prod.apigee.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**history**](HistoryApi.md#history) | **GET** /history/{vin} | Get a cars online listing history


<a name="history"></a>
# **history**
> List&lt;HistoricalListing&gt; history(vin, apiKey, fields, rows, page)

Get a cars online listing history

The history API returns online listing history for a car identified by its VIN. History listings are sorted in the descending order of the listing date / last seen date

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.HistoryApi;


HistoryApi apiInstance = new HistoryApi();
String vin = "vin_example"; // String | The VIN to identify the car to fetch the listing history. Must be a valid 17 char VIN
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
String fields = "fields_example"; // String | List of fields to fetch, in case the default fields list in the response is to be trimmed down
Integer rows = 56; // Integer | Number of results to return. Default is 10. Max is 50
BigDecimal page = new BigDecimal(); // BigDecimal | Page number to fetch the results for the given criteria. Default is 1.
try {
    List<HistoricalListing> result = apiInstance.history(vin, apiKey, fields, rows, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryApi#history");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| The VIN to identify the car to fetch the listing history. Must be a valid 17 char VIN |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]
 **fields** | **String**| List of fields to fetch, in case the default fields list in the response is to be trimmed down | [optional]
 **rows** | **Integer**| Number of results to return. Default is 10. Max is 50 | [optional]
 **page** | **BigDecimal**| Page number to fetch the results for the given criteria. Default is 1. | [optional]

### Return type

[**List&lt;HistoricalListing&gt;**](HistoricalListing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

