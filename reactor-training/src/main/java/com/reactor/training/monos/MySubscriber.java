package com.reactor.training.monos;

import org.reactivestreams.Subscription;
import reactor.core.CoreSubscriber;

public class MySubscriber implements CoreSubscriber<Object> {
    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("onSubscribe: done!");
        subscription.request(Long.MAX_VALUE);
        this.subscription = subscription;
    }

    @Override
    public void onNext(Object item) {
        System.out.println("onNext: " + item.toString());
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("onError: " + throwable.toString());
    }

    @Override
    public void onComplete() {
        System.out.println("onComplete: no more items to process!");
    }
}
