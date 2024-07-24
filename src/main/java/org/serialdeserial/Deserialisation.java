package org.serialdeserial;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

public class Deserialisation {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String... args) throws IOException {
        String link="http://localhost:3000/blogposts/2";
        BlogPostsPojo postnew=MAPPER.readValue(new URL(link), BlogPostsPojo.class);
        System.out.println(postnew.getId());

        String url="http://localhost:3000/blogposts/2";
        BlogPostsPojo post= RestAssured.given().get(url).as(BlogPostsPojo.class);
        System.out.println(post.toString());

        String url2="http://localhost:3000/blogposts";
        Type type=new TypeReference<List<BlogPostsPojo>>() {}.getType();
        List<BlogPostsPojo> postList=RestAssured.given().get(url2).as(type);
        System.out.println(postList.toString());

        String url3="http://localhost:3000/blogposts/";
        BlogPostsPojo post1[]= RestAssured.given().get(url3).as(BlogPostsPojo[].class);
        System.out.println(post1);
    }
}
