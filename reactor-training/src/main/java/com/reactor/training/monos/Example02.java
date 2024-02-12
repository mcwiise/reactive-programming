package com.reactor.training.monos;

import reactor.core.publisher.Mono;

/**
 * Simple subscription to a publisher that emits an error
 * */
public class Example02 {
    public static void main(String[] args) {
        //create a publisher which emits 1 error when transforming the item
        var monoPublisher =
                Mono.just(1)
                        .map(item -> item+1)
                        .map(res -> res/0);
        //create a subscriber
        var mySubscriber = new MySubscriber();
        //performs the subscription
        monoPublisher.subscribe(mySubscriber);
    }
}
