package com.reactor.training.fluxes;

import com.reactor.training.util.MySubscriber;
import reactor.core.publisher.Flux;

/**
 * Subscription to a publisher that emits 4 items,
 * and a subscriber that cancels the subscription after reading 2 items
 * */
public class FluxExample02 {
    public static void main(String[] args) {
        //create a publisher
        var monoPublisher = Flux.just(1,2,3,4)
                .log()
                .take(2);
        //create a subscriber
        var mySubscriber = new MySubscriber();
        //performs the subscription
        monoPublisher.subscribe(mySubscriber);
    }
}
