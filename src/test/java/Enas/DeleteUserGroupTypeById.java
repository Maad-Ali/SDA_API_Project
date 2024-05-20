package Enas;

import base_urls.BaseURL;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserGroupTypeById extends BaseURL {

    @Test

    public void GetAllUserGroupTypeTest() {
        Response response =given(spec).delete("/user-group-type/56");
        response.prettyPrint();
        System.out.println("response statusCode : "+response.statusCode());
        assert response.statusCode() == 200;


    }
}