package com.reactor.training.monos;

import com.reactor.training.util.MySubscriber;
import reactor.core.publisher.Mono;

/**
 * Subscription to a publisher that emits 1 item
 * followed by a SUCCESS signal
 * */
public class MonoExample01 {
    public static void main(String[] args) {
        //create a publisher which emits 1 item
        var monoPublisher = Mono.just(1);
        //create a subscriber
        var mySubscriber = new MySubscriber();
        //performs the subscription
        monoPublisher.subscribe(mySubscriber);
    }
}
