package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilties.GSessionID.SessionID;


public class BaseURL  {

    public static RequestSpecification spec;

    static {
            spec = new RequestSpecBuilder()
                    .setBaseUri("https://qa-gm3.quaspareparts.com/a3m/auth/api")
    //                .addHeader("Authorization","Bearer "+generateToken())
                    .addHeader("Cookie","GSESSIONID="+SessionID())
                    .setContentType(ContentType.JSON)
                    .build();

    }



}
