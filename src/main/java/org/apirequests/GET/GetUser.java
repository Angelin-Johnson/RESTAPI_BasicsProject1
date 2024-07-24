package org.apirequests.GET;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetUser {
    public static void main(String[] args){
        RestAssured.baseURI="https://reqres.in/api/users";
        given().
                queryParam("page","1").body("").
        when().
                get().
        then().log().all().
                assertThat().statusCode(200).
                body("page",equalTo(1));

    }
}
