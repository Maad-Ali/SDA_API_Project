package Requests;

import base_urls.BaseURL;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.CountryPojo;
import utilties.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class C01_ReadCountries  extends BaseURL {

@Test

    public void getCountriesTest(){

    Response response =given(spec).get("/country/SA");
    response.prettyPrint();
    assert response.statusCode() == 200;

    CountryPojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), CountryPojo.class);
    assertEquals("Saudi Arabia", actualData.getName());
    assertEquals("SA", actualData.getIso2());
    assertEquals("SAR", actualData.getCurrency());
    assertEquals("Saudi riyal", actualData.getCurrency_name());
    assertEquals("Saudi riyal", actualData.getCurrency_name());




















}


}
