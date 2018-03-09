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
import marketcheck.cars.api..client.model.Error;
import marketcheck.cars.api..client.model.PlotPoint;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GraphsApi
 */
@Ignore
public class GraphsApiTest {

    private final GraphsApi api = new GraphsApi();

    
    /**
     * Price, Miles plots data for given criteria
     *
     * [DEPRECIATED Please check this in /search API using plot&#x3D;true]Get price, miles plot data for active cars matching the given VIN&#39;s basic specification or Year, Make, Model, Trim (Optional) criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPriceMilesPlotDataTest() throws ApiException {
        String carType = null;
        String apiKey = null;
        String vin = null;
        String year = null;
        String make = null;
        String model = null;
        String trim = null;
        Integer rows = null;
        List<PlotPoint> response = api.getPriceMilesPlotData(carType, apiKey, vin, year, make, model, trim, rows);

        // TODO: test validations
    }
    
}
