package org.authorisation;

import static io.restassured.RestAssured.given;

public class PreemptiveAuth {
    public static void main(String... args){
        given().auth().preemptive()
                .basic("postman","password")
                .when().get("https://postman-echo.com/basic-auth")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }
}
