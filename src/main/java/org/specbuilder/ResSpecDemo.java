package org.specbuilder;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.core.IsAnything;

import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

public class ResSpecDemo {
    public static void main(String... args){

    }

    static ResponseSpecification setUpResponseSpecification(){
        ResponseSpecBuilder builder=new ResponseSpecBuilder();
        builder.expectStatusCode(200);
        ResponseSpecification responseSpec= builder.build();
        return responseSpec;
    }

    static void test_with(){
        String url="https://reqres.in/api/users?page=2";
        RestAssured
                .when()
                .get(url)
                .then()
                .spec(setUpResponseSpecification());
    }

    static void test_without(){
        String url="https://reqres.in/api/users";
        RestAssured
                .when()
                .get(url)
                .then()
                .spec(setUpResponseSpecification())
                .body("page",is(anything()));

    }


}
