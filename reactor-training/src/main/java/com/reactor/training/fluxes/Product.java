package com.reactor.training.fluxes;

public class Product {
    public Product getProductFromRawResponse(String rawProduct) {
        Gson g = new Gson();
        var product = g.fromJson(rawProduct, Product.class);
        return product;
    }
}
