package com.reactor.training.monos;

import com.reactor.training.monos.MySubscriber;
import reactor.core.publisher.Mono;

/**
 * Simple subscription to a publisher that emits 1 item
 * */
public class Example01 {
    public static void main(String[] args) {
        //create a publisher which emits 1 item
        //Mono.empty() emits zero items
        var monoPublisher = Mono.just(1);
        //create a subscriber
        var mySubscriber = new MySubscriber();
        //performs the subscription
        monoPublisher.subscribe(mySubscriber);
    }
}
