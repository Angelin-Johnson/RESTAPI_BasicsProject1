package org.authorisation;

import static io.restassured.RestAssured.given;

public class DigestAuth {
    public static void main(String... args){
        given().auth().digest("postman","password")
                .when().get("https://postman-echo.com/digest-auth")
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }
}
