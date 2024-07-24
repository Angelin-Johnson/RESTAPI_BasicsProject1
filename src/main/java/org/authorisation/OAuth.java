package org.authorisation;

import static io.restassured.RestAssured.given;

public class OAuth {
    public static void main(String... args){
        given().auth().oauth2("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")
                .when().get(" https://api.github.com/user/repos")
                .then().log().all()
                .assertThat()
                .statusCode(200);
    }
}
