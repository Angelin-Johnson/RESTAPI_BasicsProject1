package org.apirequests.PATCH;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class UpdateUser {
    public static void main(String... args){

       RestAssured.baseURI="https://reqres.in/api/users/2";
       String userData="{\n" +
               "    \"name\": \"morpheus\",\n" +
               "    \"job\": \"zion resident\"\n" +
               "}";
       given().
               body(userData).
               when().patch().
               then().log().all().
               assertThat().
               statusCode(200).body("updatedAt",is(notNullValue()));


    }
}
