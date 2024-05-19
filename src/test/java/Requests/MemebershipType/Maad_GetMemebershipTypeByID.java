package Requests.MemebershipType;

import base_urls.BaseURL;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.MemebershipPojo;
import utilties.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class Maad_GetMemebershipTypeByID extends BaseURL {

    @Test
    public void MembershipTypeTest() {


    Response response = given(spec).get("/v1/user/1411/application/2/membership");
    response.prettyPrint();
    assert response.statusCode() == 200;

MemebershipPojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(),MemebershipPojo.class);

        assertEquals("3052", actualData.getId());
        assertEquals("2", actualData.getApp_id());
        assertEquals("Quaspareparts Gateway App", actualData.getApp_name());
        assertEquals("Quaspareparts", actualData.getApp_short_name());
        assertEquals("https://cdn-a3m-dev.clarusway.com/public/a3m-data/application/2/logo/1703352263730-picture.png", actualData.getApp_logo_url());
        assertEquals("1411", actualData.getUser_id());
        assertEquals("renaldo.lemke", actualData.getUsername());
        assertEquals("Odis", actualData.getName());
        assertEquals("Doyle", actualData.getLastname());
        assertEquals("2e810f91-4b7f-4d78-8d18-c5e9f7491cb8", actualData.getSubscription_id());
        assertEquals("5", actualData.getMembership_type_id());
        assertEquals("false", actualData.getIs_individual_membership());
        assertEquals("5", actualData.getDefault_role_id());
        assertEquals("Business Owner", actualData.getDefault_role_name());
        assertEquals("1715253779444611", actualData.getOrganization_id());
        assertEquals("XYZ Inc", actualData.getOrganization_name());
        assertEquals("SAR", actualData.getOrganization_currency());
        assertEquals("false", actualData.getIs_owner());
        assertEquals("true", actualData.getIs_active());
        assertEquals("true", actualData.getIs_default());
        assertEquals("2024-05-17T08:28:35.080717Z", actualData.getCreated_at());
        assertEquals("1405", actualData.getCreated_by());
        assertEquals("2024-05-17T08:28:35.080718Z", actualData.getUpdated_at());
        assertEquals("1405", actualData.getUpdated_by());














    }


}
