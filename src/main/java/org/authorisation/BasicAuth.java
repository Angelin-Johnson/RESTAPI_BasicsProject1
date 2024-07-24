package org.authorisation;


import static io.restassured.RestAssured.given;

public class BasicAuth {
   public static void main(String... args){
      given().auth().basic("postman","password")
              .when().get("https://postman-echo.com/basic-auth")
              .then()
              .log().all()
              .assertThat()
              .statusCode(200);//making
   }


}
