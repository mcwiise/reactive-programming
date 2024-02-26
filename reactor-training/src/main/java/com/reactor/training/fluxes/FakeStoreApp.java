package com.reactor.training.fluxes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Subscription to a publisher that emits 4 items
 * */
public class FakeStoreApp {

    public static final String STORE_API_URL = "https://fakestoreapi.com/products";
    public Product performRequest(){
        try {
            var url = new URL(STORE_API_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }

                var product = new Product();
                product.getProductFromRawResponse(response.toString());
                return product;
            }
        } catch (ProtocolException e) {
            System.out.println("There was a ProtocolException when trying to perform the request" + e);
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            System.out.println("There was a MalformedURLException when trying to perform the request" + e);
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("There was a IOException when trying to perform the request" + e);
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        var fakeStoreApp = new FakeStoreApp();
        var productResponse = fakeStoreApp.performRequest();
    }
}
