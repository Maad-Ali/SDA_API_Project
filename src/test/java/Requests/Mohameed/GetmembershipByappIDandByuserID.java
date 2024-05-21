package Requests.Mohameed;

import base_urls.BaseURL;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.MemebershipPojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class GetmembershipByappIDandByuserID extends BaseURL {
//    {
//        "id": 96,
//            "app_id": 2,
//            "app_name": "Quaspareparts Gateway App",
//            "app_short_name": "Quaspareparts",
//            "app_logo_url": "https://cdn-a3m-dev.clarusway.com/public/a3m-data/application/2/logo/1703352263730-picture.png",
//            "user_id": 45,
//            "username": "assurewise@assurewise.com",
//            "subscription_id": "e0f01b1a-a541-4e65-94ee-ed0177f1be86",
//            "membership_type_id": 5,
//            "is_individual_membership": false,
//            "default_role_id": 5,
//            "default_role_name": "Business Owner",
//            "organization_id": 1716291130693086,
//            "organization_name": "EmilY",
//            "is_owner": false,
//            "is_active": true,
//            "is_default": true,
//            "created_at": "2024-05-21T11:32:41.252781Z",
//            "created_by": 25,
//            "updated_at": "2024-05-21T11:32:41.252782Z",
//            "updated_by": 25
//    }

    @Test
    public void getmembershipapianduserid () {
        Response response = given(spec).get("/application/2/membership");
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
        assertEquals( actualData.getApp_logo_url(), "https://cdn-a3m-dev.clarusway.com/public/a3m-data/application/2/logo/1703352263730-picture.pn");
        assertEquals( actualData.getUser_id() ,"45");
        assertEquals( actualData.getUser_id() ,"45");



    }
}