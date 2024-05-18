package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilties.Authentication.generateToken;

public class BaseURL {

    public static RequestSpecification spec;

    static {
        spec = new RequestSpecBuilder()
                .setBaseUri("https://a3m-qa-gm3.quaspareparts.com/auth/api")
                .addHeader("Authorization","Bearer "+generateToken())
                .setContentType(ContentType.JSON)
                .build();
    }

}
