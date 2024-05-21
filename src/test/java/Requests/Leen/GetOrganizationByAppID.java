package Requests.Leen;

import base_urls.BaseURL;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.Leen.OrganizationApplication;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static utilties.ObjectMapperUtils.convertJsonToJava;

public class GetOrganizationByAppID extends BaseURL {
    @Test
    public void getAllOrganizations() {

        // https://qa-gm3.quaspareparts.com/a3m/auth/api/application/2/organization
        //Set the url
        spec.pathParams("first", "application", "second", "2", "third", "organization");

        //Set expected Data
        String strJson = """
                         {
                                       "id": 1,
                                       "name": "Acme LLC",
                                       "founder_id": 2,
                                       "short_name": "Acme"
                                   },
                                   {
                                       "id": 1716152660399179,
                                       "name": "Emir",
                                       "founder_id": 28
                                   },
                                   {
                                       "id": 1716152801150253,
                                       "name": "My Company",
                                       "founder_id": 29,
                                       "short_name": "My Comp"
                                   },
                                   {
                                       "id": 1677064640369316,
                                       "name": "Packman LLC",
                                       "founder_id": 2
                                   },
                                   {
                                       "id": 1716154971361888,
                                       "name": "R",
                                       "founder_id": 24
                                   },
                                   {
                                       "id": 1716152048216350,
                                       "name": "emily",
                                       "founder_id": 25
                                   },
                                   {
                                       "id": 1716152384509420,
                                       "name": "leon",
                                       "founder_id": 27
                                   },
                                   {
                                       "id": 1716152239973093,
                                       "name": "nancy",
                                       "founder_id": 26
                                   }
                """;

        OrganizationApplication expectedData = convertJsonToJava(strJson, OrganizationApplication.class);
        System.out.println("expectedData = " + expectedData);

        //Set the request and get the response
        Response response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();

        //Do Assertion
        List<OrganizationApplication> actualDataList = response.as(new TypeRef<>() {
        });
        OrganizationApplication actualData = actualDataList.getFirst();//Get the first element from List
        System.out.println("actualData = " + actualData);
        assertEquals(200, response.statusCode());
        assertEquals(actualData.getId(), expectedData.getId());
        assertEquals(actualData.getName(), expectedData.getName());
        assertEquals(actualData.getShort_name(), expectedData.getShort_name());
        assertEquals(actualData.getFounder_id(), expectedData.getFounder_id());
    }
}
