package org.serialdeserial;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;

public class SerialisationRequests {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String... args) throws JsonProcessingException {
        BlogPostsPojo post=new BlogPostsPojo();
        post.setId("3");
        post.setTitle("Fiction");
        post.setAuthor("Shiyl Baby");

        String url="http://localhost:3000/blogposts";
        String json=MAPPER.writeValueAsString(post);
        System.out.println(json);

        Response response= RestAssured.given().contentType("application/json").log().all(true).body(json)
                .when().post(url).andReturn();
       assertEquals(response.getStatusCode(),201,"HTTP Message");
    }
}
