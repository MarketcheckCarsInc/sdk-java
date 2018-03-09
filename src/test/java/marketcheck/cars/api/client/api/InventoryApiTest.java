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


package marketcheck.cars.api.client.api;

import marketcheck.cars.api.client.ApiException;
import marketcheck.cars.api..client.model.BaseListing;
import marketcheck.cars.api..client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventoryApi
 */
@Ignore
public class InventoryApiTest {

    private final InventoryApi api = new InventoryApi();

    
    /**
     * Dealer inventory
     *
     * Get a dealer&#39;s currently active inventory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDealerActiveInventoryTest() throws ApiException {
        String dealerId = null;
        String apiKey = null;
        Integer rows = null;
        Integer start = null;
        BaseListing response = api.getDealerActiveInventory(dealerId, apiKey, rows, start);

        // TODO: test validations
    }
    
    /**
     * Dealer&#39;s historical inventory
     *
     * [v1 : Not Implemented Yet] - Get a dealer&#39;s historical inventory
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDealerHistoricalInventoryTest() throws ApiException {
        String dealerId = null;
        BaseListing response = api.getDealerHistoricalInventory(dealerId);

        // TODO: test validations
    }
    
}
