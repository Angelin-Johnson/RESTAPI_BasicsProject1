package org.file;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;

public class FileUpload {
    public static void main(String... args){
        File file=new File("/Users/Shiyl/OneDrive/Documents/Angelin/Cover Letter.docx");
        Response res= RestAssured
                .given()
                .multiPart("file",file,"text/html")
                .when()
                .post("https://the-internet.herokuapp.com/upload")
                .thenReturn();
        System.out.println(res.prettyPrint());

}}
