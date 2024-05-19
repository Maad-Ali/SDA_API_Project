package Asma;

import base_urls.BaseURL;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class RoleService extends BaseURL {

    @Test
    public void GetRolesByOrg(){
        Response response = given(spec).get("2/organization/1715254322840616/role");
        response.prettyPrint();

        assertEquals(response.statusCode(), 200);
    }


    @Test
    public void GetRolesByAPP(){
        Response response = given(spec).get("application/2/role");
        response.prettyPrint();

        assertEquals(response.statusCode(), 200);
    }


    @Test
    public void GetRolesBySub(){
        Response response = given(spec).get("role");
        response.prettyPrint();

        assertEquals(response.statusCode(), 200);
    }
}
