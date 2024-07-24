package org.authorisation;

import static io.restassured.RestAssured.given;

public class OAuth {
    public static void main(String... args){
        given().auth().oauth2("")
                .when().get(" https://api.github.com/user/repos")
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }
}
