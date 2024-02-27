package com.reactor.training.fluxes;

import com.reactor.training.util.MySubscriber;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * Subscription to a publisher that takes just one item,
 * */
public class FluxExample04 {
    public static void main(String[] args) {
        //create a publisher
        var sourceList = List.of(1,2,3,4);
        var monoPublisher = Flux.fromIterable(sourceList)
                .log()
                .take(2)
                .next();
        //create a subscriber
        var mySubscriber = new MySubscriber();
        //performs the subscription
        monoPublisher.subscribe(mySubscriber);
    }
}
