package com.reactor.training.util;

import org.reactivestreams.Subscription;
import reactor.core.CoreSubscriber;

public class MySubscriber implements CoreSubscriber<Object> {

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("Subscription done!");
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(Object item) {
        System.out.println("Item received: " + item.toString());
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Exception received: " + throwable.toString());
    }

    @Override
    public void onComplete() {
        System.out.println("Completed!, no more items to receive.");
    }
}
