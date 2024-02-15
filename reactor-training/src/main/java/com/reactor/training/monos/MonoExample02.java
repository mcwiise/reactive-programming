package com.reactor.training.monos;

import com.reactor.training.util.MySubscriber;
import reactor.core.publisher.Mono;

/**
 * Subscription to a publisher that emits no items
 * Subscription to a publisher that emits FAILURE signal
 * */
public class MonoExample02 {
    public static void main(String[] args) {

        //create a publisher that emits no items
        var emptyMono = Mono.empty();
        //create the subscriber
        var sub1 = new MySubscriber();
        //perform the subscription
        emptyMono.subscribe(sub1);
        System.out.println();

        //create a publisher which emits 1 error
        //when transforming the item
        var monoPublisher = Mono.just(1).log()
                .map(item -> item+1)
                .map(res -> res/0);
        //create a subscriber
        var sub2 = new MySubscriber();
        //performs the subscription
        monoPublisher.subscribe(sub2);
    }
}
