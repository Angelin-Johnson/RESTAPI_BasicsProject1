package org.allureReport;

import io.qameta.allure.*;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Epic("Rest API testing using testng and Allure Report" )
@Feature("CRUD operation to get user from the list")
public class AllureReportDEmo {
    @Test(description = "To get the details of user id 3",priority = 0)
    @Story("GET request with valid user")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Descritption:Validate to get the details of the user id-3")
    public void verifyUser(){
        RestAssured.baseURI="https://reqres.in/api/users/3";
        given()
        .filter(new AllureRestAssured())
                .queryParam("page","1").body("").
                when().
                get().
                then().log().all().
                assertThat().statusCode(200)
                .body("data.email",equalTo("emma.wong@reqres.in"))
                .body("data.first_name",equalTo("Emma"));

    }

    @Test(description = "To create a new user",priority = 1)
    @Story("POST request with new user")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Descritption:Validate to create a new user")
    public void CreateUser(){
        JSONObject data=new JSONObject();
        data.put("name","RestAPI");
        data.put("job","Testing");
        given()
                .filter(new AllureRestAssured())
                .contentType(ContentType.JSON)
                        .body(data.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then().log().all()
                .assertThat().statusCode(201)
                .body("name",equalTo("RestAPI"))
                .body("job",equalTo("Testing"));

    }

    }


