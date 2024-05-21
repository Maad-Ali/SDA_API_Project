package Requests.bishri;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.OrganizationStateServicePojo;
import utilties.ObjectMapperUtils;
import static base_urls.BaseURL.spec;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
public class C02GetOrganizationStatusServiceByid {
    @Test
    public void ReadOrgainizationByid() {
        Response response = given(spec).get("/organization-status/1");
        response.prettyPrint();
        assert response.statusCode() == 200;
        OrganizationStateServicePojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), OrganizationStateServicePojo.class);
        assertEquals(actualData.getName(),"Active" );
        assertEquals(1, actualData.getId());
        assertEquals("Organization account is activated and allowed to use the application", actualData.getDescription());
    }
}
