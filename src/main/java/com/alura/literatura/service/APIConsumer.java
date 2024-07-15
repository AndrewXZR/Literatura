package com.alura.literatura.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIConsumer {
    public String getData(String url){
        String json = "";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            json = response.body();
        } catch (IOException _) {
            System.out.println("Error: problemas de conectividad a Internet" +
                    " o problemas con el servidor remoto.");
        } catch (InterruptedException _) {
            System.out.println("Error: solicitud HTTP interrumpida.");
        }

        client.close();
        return json;
    }
}
