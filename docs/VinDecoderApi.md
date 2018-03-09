# VinDecoderApi

All URIs are relative to *https://marketcheck-prod.apigee.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**decode**](VinDecoderApi.md#decode) | **GET** /vin/{vin}/specs | VIN Decoder
[**getEconomy**](VinDecoderApi.md#getEconomy) | **GET** /economy | Get Economy based on environmental factors
[**getEfficiency**](VinDecoderApi.md#getEfficiency) | **GET** /fuel_efficiency | Get fuel effeciency
[**getSafetyRating**](VinDecoderApi.md#getSafetyRating) | **GET** /safety | Get Safety Rating


<a name="decode"></a>
# **decode**
> Build decode(vin, apiKey)

VIN Decoder

Get the basic information on specifications for a car identified by a valid VIN

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.VinDecoderApi;


VinDecoderApi apiInstance = new VinDecoderApi();
String vin = "vin_example"; // String | VIN to decode
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
try {
    Build result = apiInstance.decode(vin, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VinDecoderApi#decode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN to decode |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]

### Return type

[**Build**](Build.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEconomy"></a>
# **getEconomy**
> Economy getEconomy(vin, apiKey)

Get Economy based on environmental factors

[MOCK] Calculate Economy i.e. Environmental Friendliness

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.VinDecoderApi;


VinDecoderApi apiInstance = new VinDecoderApi();
String vin = "vin_example"; // String | VIN as a reference to the type of car for which Environmental Economy data is to be returned
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
try {
    Economy result = apiInstance.getEconomy(vin, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VinDecoderApi#getEconomy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN as a reference to the type of car for which Environmental Economy data is to be returned |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]

### Return type

[**Economy**](Economy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEfficiency"></a>
# **getEfficiency**
> FuelEfficiency getEfficiency(vin, apiKey)

Get fuel effeciency

[MOCK] Calculate fuel efficiency from taxonomy db mileage values

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.VinDecoderApi;


VinDecoderApi apiInstance = new VinDecoderApi();
String vin = "vin_example"; // String | VIN as a reference to the type of car for which fuel data is to be returned
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
try {
    FuelEfficiency result = apiInstance.getEfficiency(vin, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VinDecoderApi#getEfficiency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN as a reference to the type of car for which fuel data is to be returned |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]

### Return type

[**FuelEfficiency**](FuelEfficiency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSafetyRating"></a>
# **getSafetyRating**
> SafetyRating getSafetyRating(vin, apiKey)

Get Safety Rating

[MOCK] Get Safety ratings from third party sources

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.VinDecoderApi;


VinDecoderApi apiInstance = new VinDecoderApi();
String vin = "vin_example"; // String | VIN to fetch the safety ratings
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
try {
    SafetyRating result = apiInstance.getSafetyRating(vin, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VinDecoderApi#getSafetyRating");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN to fetch the safety ratings |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]

### Return type

[**SafetyRating**](SafetyRating.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

