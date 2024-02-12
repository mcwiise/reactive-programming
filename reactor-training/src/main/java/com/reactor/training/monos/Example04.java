package com.reactor.training.monos;

import reactor.core.publisher.Mono;

/**
 * How to emit an item or failure signals in a programmatic way,
 * by using the Callable functional interface.
 *
 * So, we can make publishers to emit failure signals,
 * whenever a checked exception is thrown either by legacy code
 * or some injected library.
 * */
public class Example04 {
    public static void main(String[] args) {
        monoWithCallableOnComplete();
        monoWithCallableOnError();
    }

    /**
     * Creates a publisher that emits an item,
     * by using the Callable functional interface.
     * */
    public static void monoWithCallableOnComplete(){
        var fooUserCallable = new UsersCallable("FOO");
        var monoPublisher = Mono.fromCallable(fooUserCallable);
        var mySubscriber = new MySubscriber();
        monoPublisher.subscribe(mySubscriber);
    }

    /**
     * Creates a publisher that emits a failure signal,
     * by using the Callable functional interface.
     * */
    public static void monoWithCallableOnError(){
        var barUserCallable = new UsersCallable("bar");
        var monoPublisher = Mono.fromCallable(barUserCallable);
        var mySubscriber = new MySubscriber();
        monoPublisher.subscribe(mySubscriber);
    }
}
