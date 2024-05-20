package Requests.MemebershipType;

import base_urls.BaseURL;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.MemebershipPojo;
import utilties.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;


public class Maad_GetMemebershipType extends BaseURL {

    @Test

    public void MemebershipTypeTest(){

        Response response = given(spec).get("/v1/user/31/application/2/membership/65c40f3b-0619-48fb-94f1-a9761b29b24d");
        response.prettyPrint();

        assert response.statusCode() == 200;
        MemebershipPojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(),MemebershipPojo.class);

        // do assertions

        assertEquals(actualData.getId(),76);
        assertEquals(actualData.getApp_id(),2);
        assertEquals(actualData.getApp_name(),"Quaspareparts Gateway App");
        assertEquals(actualData.getApp_short_name(),"Quaspareparts");
        assertEquals(actualData.getApp_logo_url(),"https://cdn-a3m-dev.clarusway.com/public/a3m-data/application/2/logo/1703352263730-picture.png");
        assertEquals(actualData.getUser_id(),31);
        assertEquals(actualData.getUsername(),"assurewise@assurewise.com");
        assertEquals(actualData.getSubscription_id(),"65c40f3b-0619-48fb-94f1-a9761b29b24d");
        assertEquals(actualData.getMembership_type_id(),5);
        assertEquals(actualData.getIs_individual_membership(),false);
        assertEquals(actualData.getDefault_role_id(),5);
        assertEquals(actualData.getDefault_role_name(), "Business Owner");
        assertEquals(actualData.getOrganization_id(), Long.valueOf(1716152048216350L));
        assertEquals(actualData.getOrganization_name(),"emily");
        assertEquals(actualData.getIs_owner(),false);
        assertEquals(actualData.getIs_active(),true);
        assertEquals(actualData.getIs_default(),true);
        assertEquals(actualData.getCreated_at(),"2024-05-19T20:55:00.241502Z");
        assertEquals(actualData.getCreated_by(),25);
        assertEquals(actualData.getUpdated_at(),"2024-05-19T20:55:00.241504Z");
        assertEquals(actualData.getUpdated_by(),25);













    }


}
