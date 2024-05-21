package Requests.bishri;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.OrganizationStateServicePojo;

import static base_urls.BaseURL.spec;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
public class C01Get_organization_status_service {
    @Test
    public void ReadAllOrgainization() throws JsonProcessingException {
        String strJson = """
                  [
                      {
                          "id": 1,
                          "name": "Active",
                          "description": "Organization account is activated and allowed to use the application"
                      },
                      {
                          "id": 3,
                          "name": "Passive",
                          "description": "Organization account is deactivated, and not allowed to use the application"
                      },
                      {
                          "id": 2,
                          "name": "Pending Confirmation",
                          "description": "Organization account is created, and waiting confirmation to use the application"
                      }
                  ]
                                 
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        OrganizationStateServicePojo[] expectedData = objectMapper.readValue(strJson, OrganizationStateServicePojo[].class);
        Response response = given(spec).get("/organization-status");
        response.prettyPrint();
        assert response.statusCode() == 200;
        OrganizationStateServicePojo[] actualData = objectMapper.readValue(response.asString(), OrganizationStateServicePojo[].class);
        assertEquals(expectedData[1].getName(), actualData[1].getName());
        assertEquals(expectedData[2].getName(), actualData[2].getName());
        assertEquals(expectedData[1].getId(), actualData[1].getId());
        assertEquals(expectedData[2].getId(), actualData[2].getId());
        assertEquals(expectedData[1].getDescription(), actualData[1].getDescription());
        assertEquals(expectedData[2].getDescription(), actualData[2].getDescription());
    }
}
