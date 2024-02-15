package com.reactor.training.monos;

import com.reactor.training.util.MySubscriber;
import reactor.core.publisher.Mono;

/**
 * Subscription to a publisher that transforms an error
 * into a custom error
 * */
public class MonoExample03 {
    public static void main(String[] args) {
        //create a publisher which emits 1 error when transforming the item
        var monoPublisher = Mono.just(1)
                .map(item -> item+1)
                .map(res -> res/0)
                .onErrorMap(throwable -> new RuntimeException("Division by zero is not allowed"));
        //create a subscriber
        var mySubscriber = new MySubscriber();
        //performs the subscription
        monoPublisher.subscribe(mySubscriber);
    }
}
