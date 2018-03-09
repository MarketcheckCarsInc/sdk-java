# DealerApi

All URIs are relative to *https://marketcheck-prod.apigee.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dealerSearch**](DealerApi.md#dealerSearch) | **GET** /dealers | Find car dealers around
[**getDealer**](DealerApi.md#getDealer) | **GET** /dealer/{dealer_id} | Dealer by id
[**getDealerActiveInventory**](DealerApi.md#getDealerActiveInventory) | **GET** /dealer/{dealer_id}/active/inventory | Dealer inventory
[**getDealerHistoricalInventory**](DealerApi.md#getDealerHistoricalInventory) | **GET** /dealer/{dealer_id}/historical/inventory | Dealer&#39;s historical inventory
[**getDealerLandingPage**](DealerApi.md#getDealerLandingPage) | **GET** /dealer/{dealer_id}/landing | Experimental: Get cached version of dealer landing page by dealer id
[**getDealerRatings**](DealerApi.md#getDealerRatings) | **GET** /dealer/{dealer_id}/ratings | Dealer&#39;s Rating
[**getDealerReviews**](DealerApi.md#getDealerReviews) | **GET** /dealer/{dealer_id}/reviews | Dealer&#39;s Review


<a name="dealerSearch"></a>
# **dealerSearch**
> DealersResponse dealerSearch(latitude, longitude, radius, apiKey, rows, start)

Find car dealers around

The dealers API returns a list of dealers around a given point and radius. Max radius of only 50 miles is supported.

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.DealerApi;


DealerApi apiInstance = new DealerApi();
Double latitude = 3.4D; // Double | Latitude component of location
Double longitude = 3.4D; // Double | Longitude component of location
Integer radius = 56; // Integer | Radius around the search location
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
Integer rows = 56; // Integer | Number of results to return. Default is 10. Max is 50
Integer start = 56; // Integer | Offset for the search results. Default is 1.
try {
    DealersResponse result = apiInstance.dealerSearch(latitude, longitude, radius, apiKey, rows, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerApi#dealerSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **Double**| Latitude component of location |
 **longitude** | **Double**| Longitude component of location |
 **radius** | **Integer**| Radius around the search location |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]
 **rows** | **Integer**| Number of results to return. Default is 10. Max is 50 | [optional]
 **start** | **Integer**| Offset for the search results. Default is 1. | [optional]

### Return type

[**DealersResponse**](DealersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDealer"></a>
# **getDealer**
> Dealer getDealer(dealerId, apiKey)

Dealer by id

Get a particular dealer&#39;s information by its id

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.DealerApi;


DealerApi apiInstance = new DealerApi();
String dealerId = "dealerId_example"; // String | Dealer id to get all the dealer info attributes
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
try {
    Dealer result = apiInstance.getDealer(dealerId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerApi#getDealer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealerId** | **String**| Dealer id to get all the dealer info attributes |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]

### Return type

[**Dealer**](Dealer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDealerActiveInventory"></a>
# **getDealerActiveInventory**
> BaseListing getDealerActiveInventory(dealerId, apiKey, rows, start)

Dealer inventory

Get a dealer&#39;s currently active inventory

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.DealerApi;


DealerApi apiInstance = new DealerApi();
String dealerId = "dealerId_example"; // String | Id representing the dealer to fetch the active inventory for
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
Integer rows = 56; // Integer | Number of results to return. Default is 10. Max is 50
Integer start = 56; // Integer | Page number to fetch the results for the given criteria. Default is 1. Pagination is allowed only till first 1000 results for the search and sort criteria. The page value can be only between 1 to 1000/rows
try {
    BaseListing result = apiInstance.getDealerActiveInventory(dealerId, apiKey, rows, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerApi#getDealerActiveInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealerId** | **String**| Id representing the dealer to fetch the active inventory for |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]
 **rows** | **Integer**| Number of results to return. Default is 10. Max is 50 | [optional]
 **start** | **Integer**| Page number to fetch the results for the given criteria. Default is 1. Pagination is allowed only till first 1000 results for the search and sort criteria. The page value can be only between 1 to 1000/rows | [optional]

### Return type

[**BaseListing**](BaseListing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDealerHistoricalInventory"></a>
# **getDealerHistoricalInventory**
> BaseListing getDealerHistoricalInventory(dealerId)

Dealer&#39;s historical inventory

[v1 : Not Implemented Yet] - Get a dealer&#39;s historical inventory

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.DealerApi;


DealerApi apiInstance = new DealerApi();
String dealerId = "dealerId_example"; // String | Id representing the dealer to fetch the active inventory for
try {
    BaseListing result = apiInstance.getDealerHistoricalInventory(dealerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerApi#getDealerHistoricalInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealerId** | **String**| Id representing the dealer to fetch the active inventory for |

### Return type

[**BaseListing**](BaseListing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDealerLandingPage"></a>
# **getDealerLandingPage**
> DealerLandingPage getDealerLandingPage(dealerId, apiKey)

Experimental: Get cached version of dealer landing page by dealer id

Experimental: Get cached version of dealer landing page by dealer id

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.DealerApi;


DealerApi apiInstance = new DealerApi();
String dealerId = "dealerId_example"; // String | Robot id to get the landing page html for
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
try {
    DealerLandingPage result = apiInstance.getDealerLandingPage(dealerId, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerApi#getDealerLandingPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealerId** | **String**| Robot id to get the landing page html for |
 **apiKey** | **String**| The API Authentication Key. Mandatory with all API calls. | [optional]

### Return type

[**DealerLandingPage**](DealerLandingPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDealerRatings"></a>
# **getDealerRatings**
> DealerRating getDealerRatings(dealerId)

Dealer&#39;s Rating

[MOCK] Get a dealer&#39;s Rating

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.DealerApi;


DealerApi apiInstance = new DealerApi();
String dealerId = "dealerId_example"; // String | Id representing the dealer to fetch the ratings for
try {
    DealerRating result = apiInstance.getDealerRatings(dealerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerApi#getDealerRatings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealerId** | **String**| Id representing the dealer to fetch the ratings for |

### Return type

[**DealerRating**](DealerRating.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDealerReviews"></a>
# **getDealerReviews**
> DealerReview getDealerReviews(dealerId)

Dealer&#39;s Review

[MOCK] Get a dealer&#39;s Review

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.DealerApi;


DealerApi apiInstance = new DealerApi();
String dealerId = "dealerId_example"; // String | Id representing the dealer to fetch the ratings for
try {
    DealerReview result = apiInstance.getDealerReviews(dealerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealerApi#getDealerReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dealerId** | **String**| Id representing the dealer to fetch the ratings for |

### Return type

[**DealerReview**](DealerReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

