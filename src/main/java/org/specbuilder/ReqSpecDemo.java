package org.specbuilder;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class ReqSpecDemo {
    static RequestSpecification setUpRequestSpecification(){
       RequestSpecBuilder builder=new RequestSpecBuilder();
       builder.setBaseUri("https://reqres.in/");
       builder.setBasePath("api/users");
       RequestSpecification reqspec= builder.build();
       return reqspec;
    }

    public static void main(String[] args){

    }

    static void test_withoutParam(){
        Response response= RestAssured.given()
                .spec(setUpRequestSpecification())
                .when()
                .get();
                response.getBody().prettyPrint();
    }


    static void test_withParam(){
        Response response= RestAssured.given().spec(setUpRequestSpecification())
                .queryParam("page","2")
                .when()
                .get();
        response.getBody().prettyPrint();
    }
}
