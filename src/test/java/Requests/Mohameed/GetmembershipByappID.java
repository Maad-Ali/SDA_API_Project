package Requests.Mohameed;

import base_urls.BaseURL;
import base_urls.BaseURL;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.MemebershipPojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;


public class GetmembershipByappID  extends BaseURL {
// {
//         "id": 192,
//         "app_id": 2,
//         "app_name": "Quaspareparts Gateway App",
//         "app_short_name": "Quaspareparts",
//         "app_logo_url": "https://cdn-a3m-dev.clarusway.com/public/a3m-data/application/2/logo/1703352263730-picture.png",
//         "user_id": 93,
//         "username": "salmanteG@test.com",
//         "subscription_id": "65c40f3b-0619-48fb-94f1-a9761b29b24d",
//         "is_individual_membership": false,
//         "default_role_id": 5,
//         "default_role_name": "Business Owner",
//         "organization_id": 1716152048216350,
//         "organization_name": "emily",
//         "is_owner": false,
//         "is_active": true,
//         "is_default": true,
//         "created_at": "2024-05-20T13:13:21.750666Z",
//         "created_by": 31,
//         "updated_at": "2024-05-20T13:13:21.750667Z",
//         "updated_by": 31
//         }
//         ]



    @Test
    public void GetmembershipByappIDTest() {
        Response response = given(spec).get("application/2/membership");
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
        assertEquals(actualData.getApp_name() , "Quaspareparts Gateway App");
        assertEquals( actualData.getApp_short_name(), "Quaspareparts");
//            assertEquals(actualData.getOrganization_id(),1716152048216350);



    }
}