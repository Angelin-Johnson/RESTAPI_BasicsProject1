package org.apirequests;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertTrue;

public class getRequestDemo {
    @BeforeSuite
    void setup(){
        System.out.println("SetUp");
    }
    
    @Test
    void get_req(){
        RestAssured.baseURI="http://localhost:3000";
        RestAssured.basePath="ping";
        //given().when().get().then().log().all().statusCode(200).body("result",equalTo("pong"));
        Response response=given().when().get().andReturn();
        assertTrue(response.getStatusCode()==200);
        JsonPath jpath=response.jsonPath();
        String result=jpath.get("result");
        System.out.println(result);


    }
    @AfterSuite
    void tearDown(){
        System.out.println("TearDown");
    }
}
