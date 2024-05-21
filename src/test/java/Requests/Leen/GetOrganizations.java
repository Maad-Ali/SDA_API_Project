package Requests.Leen;

import base_urls.BaseURL;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojos.Leen.OrganizationServicePojoItem;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static utilties.ObjectMapperUtils.convertJsonToJava;

public class GetOrganizations extends BaseURL {
    @Test
    public void getAllOrganizations() {

        // https://qa-gm3.quaspareparts.com/a3m/auth/api/organization-group
        //Set the url
        spec.pathParams("first", "organization-group");

        //Set expected Data
        String strJson = """
                         {
                                  "id": 2,
                                  "name": "Acme Company Group",
                                  "short_name": "Acme CG",
                                  "owners": [
                                      {
                                          "id": 2,
                                          "name": "Boss",
                                          "lastname": "BizOwner",
                                          "username": "boss",
                                          "email": "boss@test.com",
                                          "is_email_verified": true,
                                          "preferences": {
                                              "sales_target": 12
                                          },
                                          "status_id": 1,
                                          "created_at": "2023-01-17T19:58:44.900372Z",
                                          "updated_at": "2023-01-17T19:58:44.900377Z"
                                      }
                                  ],
                                  "organizations": [
                                      {
                                          "id": 1,
                                          "name": "Acme LLC",
                                          "founder_id": 2,
                                          "short_name": "Acme",
                                          "address": "Ronald Avenue McMillan Drive No. 5, Tysons, Virginia",
                                          "phone": "15555555555",
                                          "email": "contact@acme.com",
                                          "website": "www.acme.com",
                                          "fax": "15555555555",
                                          "status_id": 1,
                                          "organization_group_id": 2,
                                          "created_at": "2023-01-17T20:35:06.419830Z",
                                          "updated_at": "2023-02-22T10:54:14.929604Z",
                                          "currency": "USD"
                                      },
                                      {
                                          "id": 1677064640369316,
                                          "name": "Packman LLC",
                                          "founder_id": 2,
                                          "organization_group_id": 2,
                                          "created_at": "2023-02-22T11:17:20.308779Z",
                                          "updated_at": "2023-02-22T11:17:20.308781Z"
                                      }
                                  ],
                                  "created_at": "2023-05-08T11:52:17.047256Z",
                                  "updated_at": "2023-05-08T11:59:45.589403Z"
                              }
                """;

        OrganizationServicePojoItem expectedData = convertJsonToJava(strJson, OrganizationServicePojoItem.class);
        System.out.println("expectedData = " + expectedData);

        //Set the request and get the response
        Response response = given(spec).get("{first}");
        response.prettyPrint();

        //Do Assertion
        List<OrganizationServicePojoItem> actualDataList = response.as(new TypeRef<>() {
        });
        OrganizationServicePojoItem actualData = actualDataList.getFirst();//Get the first element from List
        System.out.println("actualData = " + actualData);


        assertEquals(200, response.statusCode());
        assertEquals(actualData.getId(), expectedData.getId());
        assertEquals(actualData.getName(), expectedData.getName());
        assertEquals(actualData.getShort_name(), expectedData.getShort_name());
        assertEquals(actualData.getCreated_at(), expectedData.getCreated_at());
        //assertEquals(actualData.getUpdated_at(), expectedData.getUpdated_at());

        assertEquals(actualData.getOwners().getFirst().getId(), expectedData.getOwners().getFirst().getId());
        assertEquals(actualData.getOwners().getFirst().getAddress(), expectedData.getOwners().getFirst().getAddress());
        assertEquals(actualData.getOwners().getFirst().getEmail(), expectedData.getOwners().getFirst().getEmail());
        assertEquals(actualData.getOwners().getFirst().getPhone(), expectedData.getOwners().getFirst().getPhone());
        assertEquals(actualData.getOwners().getFirst().getLastname(), expectedData.getOwners().getFirst().getLastname());
        assertEquals(actualData.getOwners().getFirst().getUsername(), expectedData.getOwners().getFirst().getUsername());
        assertEquals(actualData.getOwners().getFirst().getStatus_id(), expectedData.getOwners().getFirst().getStatus_id());
        assertEquals(actualData.getOwners().getFirst().getPreferences().getSales_target(), expectedData.getOwners().getFirst().getPreferences().getSales_target());
        assertEquals(actualData.getOwners().getFirst().getUpdated_at(), expectedData.getOwners().getFirst().getUpdated_at());
        assertEquals(actualData.getOwners().getFirst().getUpdated_by(), expectedData.getOwners().getFirst().getUpdated_by());
        assertEquals(actualData.getOwners().getFirst().getIs_email_verified(), expectedData.getOwners().getFirst().getIs_email_verified());
        assertEquals(actualData.getOwners().getFirst().getCreated_at(), expectedData.getOwners().getFirst().getCreated_at());

        assertEquals(actualData.getOrganizations().getFirst().getId(), expectedData.getOrganizations().getFirst().getId());
        assertEquals(actualData.getOrganizations().getFirst().getCurrency(), expectedData.getOrganizations().getFirst().getCurrency());
        assertEquals(actualData.getOrganizations().getFirst().getOrganization_group_id(), expectedData.getOrganizations().getFirst().getOrganization_group_id());
        assertEquals(actualData.getOrganizations().getFirst().getFax(), expectedData.getOrganizations().getFirst().getFax());
        assertEquals(actualData.getOrganizations().getFirst().getName(), expectedData.getOrganizations().getFirst().getName());
        assertEquals(actualData.getOrganizations().getFirst().getWebsite(), expectedData.getOrganizations().getFirst().getWebsite());
        assertEquals(actualData.getOrganizations().getFirst().getAddress(), expectedData.getOrganizations().getFirst().getAddress());
        assertEquals(actualData.getOrganizations().getFirst().getPhone(), expectedData.getOrganizations().getFirst().getPhone());
        assertEquals(actualData.getOrganizations().getFirst().getFounder_id(), expectedData.getOrganizations().getFirst().getFounder_id());
        assertEquals(actualData.getOrganizations().getFirst().getShort_name(), expectedData.getOrganizations().getFirst().getShort_name());
        assertEquals(actualData.getOrganizations().getFirst().getEmail(), expectedData.getOrganizations().getFirst().getEmail());
        assertEquals(actualData.getOrganizations().getFirst().getStatus_id(), expectedData.getOrganizations().getFirst().getStatus_id());
        assertEquals(actualData.getOrganizations().getFirst().getCreated_at(), expectedData.getOrganizations().getFirst().getCreated_at());
        assertEquals(actualData.getOrganizations().getFirst().getUpdated_at(), expectedData.getOrganizations().getFirst().getUpdated_at());

    }
}
