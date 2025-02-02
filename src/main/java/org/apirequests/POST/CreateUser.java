package org.apirequests.POST;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CreateUser {
    public static void main(String... args){
        RestAssured.baseURI="https://reqres.in/api/users";
        String userData="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        given().
                body(userData)
                .when().post()
                .then().log().all()
                .assertThat().statusCode(201)
                .body("id",is(notNullValue()));


    }
}
