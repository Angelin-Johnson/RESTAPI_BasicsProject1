package org.async;

import org.asynchttpclient.Dsl;
import org.asynchttpclient.Response;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsyncDemo {
    public static void main(String... Args) throws ExecutionException, InterruptedException {
       Future<Response> response= Dsl.asyncHttpClient().prepareGet("https://reqres.in/api/users?delay=3").execute();
       Response res=response.get();
       System.out.println(res);
       System.out.println(res.getStatusCode());

    }
}
