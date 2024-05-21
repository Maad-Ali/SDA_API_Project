package Requests.Mohameed;

import base_urls.BaseURL;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.MemebershipPojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class getmembership extends BaseURL {

    @Test
    public void getmembershipTest() {
        Response response = given(spec).get("/v1/membership");
        response.prettyPrint();
        assert response.statusCode() == 200;
        List<MemebershipPojo> actualDataList = response.as(new TypeRef<>() {
        });
        int idx = 0;
        for (MemebershipPojo eachPojo : actualDataList) {
            if (eachPojo.getUsername().equals("assurewise@assurewise.com")) {
                break;
            }
            idx++;
        }

        MemebershipPojo actualData = actualDataList.get(idx);
        System.out.println( " actualData"+actualData );
        System.out.println(actualData.getUsername());


        assertEquals( actualData.getApp_id(),2);
        assertEquals( actualData.getUsername(),"assurewise@assurewise.com");
        assertEquals("Quaspareparts Gateway App", actualData.getApp_name());
        assertEquals("Quaspareparts", actualData.getApp_short_name());



    }
}