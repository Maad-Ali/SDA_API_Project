package Requests.Roles;

import base_urls.BaseURL;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetRolesBySub extends BaseURL {

    @Test
    public void SubRoles(){
        Response response = given(spec).get("role");
        response.prettyPrint();

        System.out.println("response statusCode : "+response.statusCode());
        assert response.statusCode() == 200;
    }
}
