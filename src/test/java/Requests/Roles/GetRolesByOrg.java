package Requests.Roles;

import base_urls.BaseURL;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class GetRolesByOrg extends BaseURL {

    @Test
    public void OrgRoles(){
        Response response = given(spec).get("2/organization/1715254322840616/role");
        response.prettyPrint();

        System.out.println("response statusCode : "+response.statusCode());
        assert response.statusCode() == 200;
    }
}
