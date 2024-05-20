package Hadeel;

import utilties.ObjectMapperUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.UserGroupServicePojo;
import static base_urls.BaseURL.spec;
import static io.restassured.RestAssured.given;

public class UpdateUnit {
    @Test
    public void updateUnit() throws JsonProcessingException {
        spec.pathParams("first", "user-group");

        // Use String.format to inject the id and organization_id into the JSON string
        String updateJson = String.format("""
                {
                    "id": %d,
                    "name": "Updated Unit By RestAssured",
                    "group_type_id": 3,
                    "organization_id": %d,
                    "short_name": "updated-04",
                    "roles": []
                }
                """, CreateUnit.Unit_id, CreateUnit.organization_id);

        UserGroupServicePojo expectedUpdateData = ObjectMapperUtils.convertJsonToJava(updateJson, UserGroupServicePojo.class);
        System.out.println("expectedUpdateData = " + expectedUpdateData);

        Response updateResponse = given(spec)
                .contentType("application/json")
                .body(expectedUpdateData)
                .put("{first}");

        updateResponse.prettyPrint();
        updateResponse.then().statusCode(200);

    }
}
//2246
//1715253779444611
