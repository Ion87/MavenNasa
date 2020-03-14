package provider;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Lidia on 14.03.2020.
 */
public class NasaDataProvider {
    private final static String Access_Key = "gwHZJmevi2ug220QzLmMKQGNTguavvOTU8WI7WDK";
    private final static String Neo_ENDPOINT = "https://api.nasa.gov/neo/rest/v1/feed";
    public void getNeoAsteroids(String startDate, String endDate)throws IOException {
        //1.Connect to nasa API
        URL oracle = new URL(Neo_ENDPOINT + "?start_date=" + startDate + "&end_date=" + endDate + "&api_key=" + Access_Key);
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        //2.read data
        String stringData = "";
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            stringData += inputLine;
        }
        in.close();
        //3.parse JSON
        JSONObject data = new JSONObject(stringData);
        int count = data.getInt("element_count");
        System.out.println("Found " + count + " results.");

        float diameter = data.getJSONObject("near_earth_objects")
                .getJSONArray("2020-03-07")
                .getJSONObject(0)
                .getJSONObject("estimated_diameter")
                .getJSONObject("kilometers")
                .getFloat("estimated_diameter_min");
        System.out.println("Diameter in km " + diameter);
    }
}
