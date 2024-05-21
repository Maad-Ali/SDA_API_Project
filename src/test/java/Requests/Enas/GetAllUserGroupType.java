package Requests.Enas;

import base_urls.BaseURL;
import pojos.UserGroupTypePojo;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAllUserGroupType extends BaseURL {

    @Test

    public void GetAllUserGroupTypeTest() {
        Response response =given(spec).get("/user-group-type");
        response.prettyPrint();
        System.out.println("response statusCode : "+response.statusCode());
        assert response.statusCode() == 200;

        // Verify response status code
        Assert.assertEquals(response.getStatusCode(), 200);

        // Verify the response body is not empty
        List<UserGroupTypePojo> userGroupTypes = response.jsonPath().getList("", UserGroupTypePojo.class);
        Assert.assertTrue(userGroupTypes.size() > 0);

        // Verify the description of the first UserGroupType
        Assert.assertEquals(userGroupTypes.get(0).getDescription(), "User account is deactivated, and not authorized to access any the application");
    }
}