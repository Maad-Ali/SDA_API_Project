package EnasUserGroupType.Requests;

import EnasUserGroupType.base_urls.BaseURL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import EnasUserGroupType.pojos.UserGroupTypePojo;

import static io.restassured.RestAssured.given;

public class AddNewUserGroupType extends BaseURL {

    @Test
    public void addNewUserGroupTypeTest() {
        String StrJson = "\n" +
                "    {\n" +
                "        \"id\": null,\n" +
                "        \"name\": \"New Tester 2\",\n" +
                "        \"description\": \"This Is New Software Testing 2\"\n" +
                "    }";

        Response response = given(spec)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(StrJson)
                .when()
                .post("/user-group-type")
                .then()
                .extract().response();

// Print the full response
        System.out.println("Response body: " + response.getBody().asString());

// Verify response status code
        Assert.assertEquals(response.getStatusCode(), 201);

// Verify the response body
        UserGroupTypePojo createdUserGroupType = response.as(UserGroupTypePojo.class);
        Assert.assertEquals(createdUserGroupType.getName(), "New Tester 2");
        Assert.assertEquals(createdUserGroupType.getDescription(), "This Is New Software Testing 2");
        Assert.assertNotNull(createdUserGroupType.getId()); // Verify id is not null
    }
}