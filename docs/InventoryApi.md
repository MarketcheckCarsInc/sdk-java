# InventoryApi

All URIs are relative to *https://marketcheck-prod.apigee.net/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDealerActiveInventory**](InventoryApi.md#getDealerActiveInventory) | **GET** /dealer/{dealer_id}/active/inventory | Dealer inventory
[**getDealerHistoricalInventory**](InventoryApi.md#getDealerHistoricalInventory) | **GET** /dealer/{dealer_id}/historical/inventory | Dealer&#39;s historical inventory


<a name="getDealerActiveInventory"></a>
# **getDealerActiveInventory**
> BaseListing getDealerActiveInventory(dealerId, apiKey, rows, start)

Dealer inventory

Get a dealer&#39;s currently active inventory

### Example
```java
// Import classes:
//import marketcheck.cars.api.client.ApiException;
//import marketcheck.cars.api.client.api.InventoryApi;


InventoryApi apiInstance = new InventoryApi();
String dealerId = "dealerId_example"; // String | Id representing the dealer to fetch the active inventory for
String apiKey = "apiKey_example"; // String | The API Authentication Key. Mandatory with all API calls.
Integer rows = 56; // Integer | Number of results to return. Default is 10. Max is 50
Integer start = 56; // Integer | Page number to fetch the results for the given criteria. Default is 1. Pagination is allowed only till first 1000 results for the search and sort criteria. The page value can be only between 1 to 1000/rows
try {
    BaseListing result = apiInstance.getDealerActiveInventory(dealerId, apiKey, rows, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#getDealerActiveInventory");
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
//import marketcheck.cars.api.client.api.InventoryApi;


InventoryApi apiInstance = new InventoryApi();
String dealerId = "dealerId_example"; // String | Id representing the dealer to fetch the active inventory for
try {
    BaseListing result = apiInstance.getDealerHistoricalInventory(dealerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryApi#getDealerHistoricalInventory");
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

