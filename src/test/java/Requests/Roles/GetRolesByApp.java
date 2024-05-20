package Requests.Roles;

import base_urls.BaseURL;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.RolePojo;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class GetRolesByApp extends BaseURL {

    @Test
    public void AppRoles(){

        RolePojo expectedData = new RolePojo();
        System.out.println("expectedData = " + expectedData);

        Response response = given(spec).get("application/2/role");
        response.prettyPrint();

        RolePojo actualData = response.as(RolePojo.class);
        System.out.println("actualData = " + actualData);

        System.out.println("response statusCode : "+response.statusCode());
        assert response.statusCode() == 200;

        assertEquals(actualData.getId(), expectedData.getId());
        assertEquals(actualData.getName(), expectedData.getName());
        assertEquals(actualData.getApp_id(), expectedData.getApp_id());

    }
}
