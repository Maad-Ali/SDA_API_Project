package bishri;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

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
                        },
                        {
                            "id": 6,
                            "name": "active",
                            "description": "Organization/Company account is active"
                        },
                        {
                            "id": 4,
                            "name": "deactive",
                            "description": "Organization/Company account is active"
                        },
                        {
                            "id": 5,
                            "name": "deactive",
                            "description": "Organization/Company account is active"
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
        assertEquals(expectedData[3].getName(), actualData[3].getName());
        assertEquals(expectedData[4].getName(), actualData[4].getName());
        assertEquals(expectedData[5].getName(), actualData[5].getName());
        assertEquals(expectedData[1].getId(), actualData[1].getId());
        assertEquals(expectedData[2].getId(), actualData[2].getId());
        assertEquals(expectedData[3].getId(), actualData[3].getId());
        assertEquals(expectedData[4].getId(), actualData[4].getId());
        assertEquals(expectedData[5].getId(), actualData[5].getId());
        assertEquals(expectedData[1].getDescription(), actualData[1].getDescription());
        assertEquals(expectedData[2].getDescription(), actualData[2].getDescription());
        assertEquals(expectedData[3].getDescription(), actualData[3].getDescription());
        assertEquals(expectedData[4].getDescription(), actualData[4].getDescription());
        assertEquals(expectedData[5].getDescription(), actualData[5].getDescription());
    }
}
