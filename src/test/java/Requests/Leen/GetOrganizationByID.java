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
    public void getAllOrganizations() {

        // https://qa-gm3.quaspareparts.com/a3m/auth/api/v1/organization/1716152048216350/summary
        //Set the url
        spec.pathParams("first", "v1", "second", "organization", "third","1716152048216350","fourth","summary");

        //Set expected Data
        String strJson = """
                         {
                              "id": 1716152048216350,
                              "name": "emily",
                              "founder_id": 25,
                              "created_at": "2024-05-19T20:54:08.192578+00:00",
                              "updated_at": "2024-05-20T12:26:34.89195+00:00",
                              "number_of_applications": 1,
                              "number_of_files": 0,
                              "number_of_users": 14,
                              "number_of_groups": 48,
                              "group_types": [
                                  {
                                      "id": 1,
                                      "name": "Department",
                                      "number_of_groups": 5,
                                      "number_of_users": 0
                                  },
                                  {
                                      "id": 3,
                                      "name": "Team",
                                      "number_of_groups": 26,
                                      "number_of_users": 0
                                  },
                                  {
                                      "id": 2,
                                      "name": "Remote Unit",
                                      "number_of_groups": 17,
                                      "number_of_users": 2
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
        assertEquals(actualData.getId(),expectedData.getId());
        assertEquals(actualData.getName(),expectedData.getName());
        assertEquals(actualData.getCreated_at(),expectedData.getCreated_at());
        assertEquals(actualData.getFounder_id(),expectedData.getFounder_id());
        assertEquals(actualData.getGroup_types().getFirst().getNumber_of_groups(),expectedData.getGroup_types().getFirst().getNumber_of_groups());
        assertEquals(actualData.getGroup_types().getFirst().getNumber_of_users(),expectedData.getGroup_types().getFirst().getNumber_of_users());
        assertEquals(actualData.getNumber_of_applications(),expectedData.getNumber_of_applications());
        assertEquals(actualData.getNumber_of_files(),expectedData.getNumber_of_files());
        assertEquals(actualData.getNumber_of_groups(),expectedData.getNumber_of_groups());
        assertEquals(actualData.getNumber_of_users(),expectedData.getNumber_of_users());



    }
}
