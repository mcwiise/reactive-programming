package com.reactor.training.fluxes;

import com.reactor.training.util.MySubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Subscription to a publisher that emits 4 items
 * */
public class FluxExample01 {
    public static void main(String[] args) {
        var fluxPublisher = Flux.just(1,2,3,4);
        var mySubscriber = new MySubscriber();
        fluxPublisher.subscribe(mySubscriber);
    }
}
