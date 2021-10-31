package io.github.shomeier;

import java.net.http.HttpClient;

public class ApiCalls {

    private static HttpClient client;

    public static void main(String[] args) throws Exception {

        client = HttpClient.newHttpClient();


    }

}
