package Requests.Enas;

import base_urls.BaseURL;
import pojos.UserGroupTypePojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateUserGroupType extends BaseURL {

    @Test
    public void updateUserGroupTypeTest() {
        String StrJson = "\n" +
                "    {\n" +
                "        \"id\": 56,\n" +
                "        \"name\": \"New Updated Tester 3\",\n" +
                "        \"description\": \"This Is New Updated Software Testing 3\"\n" +
                "    }";

        Response response = given(spec)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(StrJson)
                .when()
                .put("/user-group-type")
                .then()
                .extract().response();

// Print the full response
        System.out.println("Response body: " + response.getBody().asString());

// Verify response status code
        Assert.assertEquals(response.getStatusCode(), 200);

// Verify the response body
        UserGroupTypePojo UpdatedUserGroupType = response.as(UserGroupTypePojo.class);
        Assert.assertEquals(UpdatedUserGroupType.getName(), "New Updated Tester 3");
        Assert.assertEquals(UpdatedUserGroupType.getDescription(), "This Is New Updated Software Testing 3");
        Assert.assertNotNull(UpdatedUserGroupType.getId(), "56 ");
    }
}