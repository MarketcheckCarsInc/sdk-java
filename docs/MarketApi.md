# MarketApi

All URIs are relative to *https://marketcheck-prod.apigee.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAverages**](MarketApi.md#getAverages) | **GET** /averages | [MOCK] Get Averages for YMM
[**getComparison**](MarketApi.md#getComparison) | **GET** /comparison | Compare market
[**getCompetition**](MarketApi.md#getCompetition) | **GET** /competition | Competitors
[**getDepreciation**](MarketApi.md#getDepreciation) | **GET** /depreciation | Depreciation
[**getMDS**](MarketApi.md#getMDS) | **GET** /mds | Market Days Supply
[**getPopularity**](MarketApi.md#getPopularity) | **GET** /popularity | Popularity
[**getTrends**](MarketApi.md#getTrends) | **GET** /trends | Get Trends for criteria


<a name="getAverages"></a>
# **getAverages**
> Averages getAverages(vin, apiKey, year, make, model, trim, fields)

[MOCK] Get Averages for YMM

[Merged with the /search API - Please check the &#39;stats&#39; parameter to the Search API above] Get market averages for price / miles / msrp / dom (days on market) fields for active cars matching the given reference VIN&#39;s basic specification or Year, Make, Model, Trim (Optional) criteria

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String vin = "vin_example"; // String | VIN as a reference to the type of car for which averages data is to be returned
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
String year = "year_example"; // String | Year of the car
String make = "make_example"; // String | Make of the car
String model = "model_example"; // String | Model of the Car
String trim = "trim_example"; // String | Trim of the Car
String fields = "fields_example"; // String | Comma separated list of fields to generate stats for. Allowed fields in the list are - price, miles, msrp, dom (days on market)
try {
    Averages result = apiInstance.getAverages(vin, apiKey, year, make, model, trim, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getAverages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN as a reference to the type of car for which averages data is to be returned |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]
 **year** | **String**| Year of the car | [optional]
 **make** | **String**| Make of the car | [optional]
 **model** | **String**| Model of the Car | [optional]
 **trim** | **String**| Trim of the Car | [optional]
 **fields** | **String**| Comma separated list of fields to generate stats for. Allowed fields in the list are - price, miles, msrp, dom (days on market) | [optional]

### Return type

[**Averages**](Averages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getComparison"></a>
# **getComparison**
> ComparisonPoint getComparison(vin, apiKey)

Compare market

[MOCK] Get historical market trends for cars matching the given VIN&#39;s basic specification or Year, Make, Model, Trim (Optional) criteria

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String vin = "vin_example"; // String | VIN as a reference to the type of car for which comparison data is to be returned
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
try {
    ComparisonPoint result = apiInstance.getComparison(vin, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getComparison");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN as a reference to the type of car for which comparison data is to be returned |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]

### Return type

[**ComparisonPoint**](ComparisonPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompetition"></a>
# **getCompetition**
> CompetitorsPoint getCompetition(vin, apiKey)

Competitors

[MOCK] Competitor cars in market for current vin

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String vin = "vin_example"; // String | VIN as a reference to the type of car for which competitors data is to be returned
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
try {
    CompetitorsPoint result = apiInstance.getCompetition(vin, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getCompetition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN as a reference to the type of car for which competitors data is to be returned |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]

### Return type

[**CompetitorsPoint**](CompetitorsPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDepreciation"></a>
# **getDepreciation**
> DepreciationPoint getDepreciation(vin, apiKey)

Depreciation

[MOCK] Model resale value based on depreciation

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String vin = "vin_example"; // String | VIN as a reference to the type of car for which Depreciation stats is to be returned
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
try {
    DepreciationPoint result = apiInstance.getDepreciation(vin, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getDepreciation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN as a reference to the type of car for which Depreciation stats is to be returned |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]

### Return type

[**DepreciationPoint**](DepreciationPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMDS"></a>
# **getMDS**
> Mds getMDS(vin, apiKey, exact, latitude, longitude, radius, debug, includeSold)

Market Days Supply

Get the basic information on specifications for a car identified by a valid VIN

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String vin = "vin_example"; // String | VIN to decode
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
String exact = "exact_example"; // String | Exact parameter
Double latitude = 3.4D; // Double | Latitude component of location
Double longitude = 3.4D; // Double | Longitude component of location
Integer radius = 56; // Integer | Radius around the search location
String debug = "debug_example"; // String | Debug parameter
String includeSold = "includeSold_example"; // String | To fetch sold vins
try {
    Mds result = apiInstance.getMDS(vin, apiKey, exact, latitude, longitude, radius, debug, includeSold);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMDS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN to decode |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]
 **exact** | **String**| Exact parameter | [optional]
 **latitude** | **Double**| Latitude component of location | [optional]
 **longitude** | **Double**| Longitude component of location | [optional]
 **radius** | **Integer**| Radius around the search location | [optional]
 **debug** | **String**| Debug parameter | [optional]
 **includeSold** | **String**| To fetch sold vins | [optional]

### Return type

[**Mds**](Mds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPopularity"></a>
# **getPopularity**
> List&lt;PopularityItem&gt; getPopularity(year, make, model, trim, bodyType, apiKey, stats)

Popularity

[MOCK] [Merged with the /search API - Please check the &#39;popularity&#39; parameter to the Search API above] Get the Popularity for the given simple filter criteria (by given Year, Make, Model, Trim criteria)

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String year = "year_example"; // String | Year of the car
String make = "make_example"; // String | Make of the car
String model = "model_example"; // String | Model of the Car
String trim = "trim_example"; // String | Trim of the Car
String bodyType = "bodyType_example"; // String | Body type to filter the cars on. Valid values are the ones returned by body_type facets API call
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
String stats = "stats_example"; // String | The list of fields for which stats need to be generated based on the matching listings for the search criteria. Allowed fields are - price, miles, msrp, dom The stats consists of mean, max, average and count of listings based on which the stats are calculated for the field. Stats could be requested in addition to the listings for the search. Please note - The API calls with the stats fields may take longer to respond.
try {
    List<PopularityItem> result = apiInstance.getPopularity(year, make, model, trim, bodyType, apiKey, stats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getPopularity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **String**| Year of the car |
 **make** | **String**| Make of the car |
 **model** | **String**| Model of the Car |
 **trim** | **String**| Trim of the Car |
 **bodyType** | **String**| Body type to filter the cars on. Valid values are the ones returned by body_type facets API call |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]
 **stats** | **String**| The list of fields for which stats need to be generated based on the matching listings for the search criteria. Allowed fields are - price, miles, msrp, dom The stats consists of mean, max, average and count of listings based on which the stats are calculated for the field. Stats could be requested in addition to the listings for the search. Please note - The API calls with the stats fields may take longer to respond. | [optional]

### Return type

[**List&lt;PopularityItem&gt;**](PopularityItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrends"></a>
# **getTrends**
> List&lt;TrendPoint&gt; getTrends(vin, carType, apiKey, year, make, model, trim)

Get Trends for criteria

Get historical market trends for cars matching the given VIN&#39;s basic specification or Year, Make, Model, Trim (Optional) criteria

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String vin = "vin_example"; // String | VIN as a reference to the type of car for which trend data is to be returned
String carType = "carType_example"; // String | Car type. Allowed values are - new / used / certified
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
String year = "year_example"; // String | Year of the car
String make = "make_example"; // String | Make of the car
String model = "model_example"; // String | Model of the Car
String trim = "trim_example"; // String | Trim of the Car
try {
    List<TrendPoint> result = apiInstance.getTrends(vin, carType, apiKey, year, make, model, trim);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getTrends");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vin** | **String**| VIN as a reference to the type of car for which trend data is to be returned |
 **carType** | **String**| Car type. Allowed values are - new / used / certified |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]
 **year** | **String**| Year of the car | [optional]
 **make** | **String**| Make of the car | [optional]
 **model** | **String**| Model of the Car | [optional]
 **trim** | **String**| Trim of the Car | [optional]

### Return type

[**List&lt;TrendPoint&gt;**](TrendPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

