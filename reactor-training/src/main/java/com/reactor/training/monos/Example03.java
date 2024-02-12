package com.reactor.training.monos;

import reactor.core.publisher.Mono;

/**
 * Simple subscription to a publisher that emits an error
 * and transform it to a custom error
 * */
public class Example03 {
    public static void main(String[] args) {
        //create a publisher which emits 1 error when transforming the item
        var monoPublisher =
                Mono.just(1)
                        .map(item -> item+1)
                        .map(res -> res/0)
                        .onErrorMap(throwable -> new RuntimeException("Division by zero is not allowed"));
        //create a subscriber
        var mySubscriber = new MySubscriber();
        //performs the subscription
        monoPublisher.subscribe(mySubscriber);
    }
}
