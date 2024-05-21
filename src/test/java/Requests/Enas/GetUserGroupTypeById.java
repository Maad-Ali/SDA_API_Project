package Requests.Enas;

import base_urls.BaseURL;
import pojos.UserGroupTypePojo;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserGroupTypeById extends BaseURL {

    @Test

    public void GetAllUserGroupTypeTest() {
        Response response =given(spec).get("/user-group-type/56");
        response.prettyPrint();
        System.out.println("response statusCode : "+response.statusCode());
        assert response.statusCode() == 200;
        // Verify the response body
        UserGroupTypePojo UserGroupType = response.as(UserGroupTypePojo.class);
        Assert.assertEquals(UserGroupType.getName(), "New Updated Tester 3");
        Assert.assertEquals(UserGroupType.getDescription(), "This Is New Updated Software Testing 3");
        Assert.assertNotNull(UserGroupType.getId(), "56 ");

    }
}