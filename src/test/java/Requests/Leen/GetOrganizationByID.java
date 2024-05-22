package Requests.Leen;

import base_urls.BaseURL;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.Leen.OrganizationByAPP;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static utilties.ObjectMapperUtils.convertJsonToJava;

public class GetOrganizationByID extends BaseURL {
    @Test
    public void getOrganizationById() {

        // https://qa-gm3.quaspareparts.com/a3m/auth/api/v1/organization/1716291130693086/summary
        //Set the url
        spec.pathParams("first", "v1", "second", "organization", "third", "1716291130693086", "fourth", "summary");

        //Set expected Data
        String strJson = """
                        {
                             "id": 1716291130693086,
                             "name": "Clarusway Test",
                             "founder_id": 25,
                             "email": "ClaruswayTest@Test.com",
                             "created_at": "2024-05-21T11:32:10.667635+00:00",
                             "updated_at": "2024-05-21T20:12:01.684713+00:00",
                             "number_of_applications": 1,
                             "number_of_files": 0,
                             "number_of_users": 18,
                             "number_of_groups": 7,
                             "group_types": [
                                 {
                                     "id": 1,
                                     "name": "Department",
                                     "number_of_groups": 3,
                                     "number_of_users": 0
                                 },
                                 {
                                     "id": 2,
                                     "name": "Remote Unit",
                                     "number_of_groups": 4,
                                     "number_of_users": 0
                                 }
                             ]
                         }
                """;

        OrganizationByAPP expectedData = convertJsonToJava(strJson, OrganizationByAPP.class);
        System.out.println("expectedData = " + expectedData);

        //Set the request and get the response
        Response response = given(spec).get("{first}/{second}/{third}/{fourth}");
        response.prettyPrint();

        //Do Assertion
        OrganizationByAPP actualData = response.as(OrganizationByAPP.class);
        System.out.println("actualData = " + actualData);


        assertEquals(200, response.statusCode());
        assertEquals(actualData.getId(), expectedData.getId());
        assertEquals(actualData.getName(), expectedData.getName());
        assertEquals(actualData.getCreated_at(), expectedData.getCreated_at());
        assertEquals(actualData.getFounder_id(), expectedData.getFounder_id());
        assertEquals(actualData.getGroup_types().getFirst().getNumber_of_groups(), expectedData.getGroup_types().getFirst().getNumber_of_groups());
        assertEquals(actualData.getGroup_types().getFirst().getNumber_of_users(), expectedData.getGroup_types().getFirst().getNumber_of_users());
        assertEquals(actualData.getNumber_of_applications(), expectedData.getNumber_of_applications());
        assertEquals(actualData.getNumber_of_files(), expectedData.getNumber_of_files());
        assertEquals(actualData.getNumber_of_groups(), expectedData.getNumber_of_groups());
        assertEquals(actualData.getNumber_of_users(), expectedData.getNumber_of_users());


    }
}
