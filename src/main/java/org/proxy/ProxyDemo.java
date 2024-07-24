package org.proxy;

import io.restassured.RestAssured;

public class ProxyDemo {
    public static void main(String[] args){
//        RestAssured.proxy("127.0.0.1",8888);
//        RestAssured.given().when().get("http://localhost:3000/ping").then().log().all();
        //or
        RestAssured.given().proxy("127.0.0.1",8888).when().get("http://localhost:3000/ping").then().log().all();

    }
}
