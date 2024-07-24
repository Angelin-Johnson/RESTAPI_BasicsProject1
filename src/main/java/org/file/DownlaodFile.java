package org.file;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DownlaodFile {
    public static void main(String... args) throws IOException {
        Response re= RestAssured
                .given()
                .log().all()
                .when()
                .get("http://localhost:3000/students").andReturn();
        byte[] bytes=re.getBody().asByteArray();
        File file=new File("/Users/Shiyl/Downloads/students.json");
        Files.write(file.toPath(),bytes);

    }
}
