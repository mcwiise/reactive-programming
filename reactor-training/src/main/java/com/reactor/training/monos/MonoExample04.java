package com.reactor.training.monos;

import com.reactor.training.util.MySubscriber;
import com.reactor.training.util.UsersCallable;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * We have seen how to create simple publishers, now lets see how we can
 * create publishers in a programmatic way.
 * Subscription to a publisher that emits 1 item in a programmatic way,
 * Subscription to a publisher that emits a FAILURE signal in a programmatic way,
 *
 * Whenever we need to wrap checked exceptions thrown by legacy code
 * to emit FAILURE signals in reactor, we can use the Callable functional interface
 *
 * https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html
 * */
public class MonoExample04 {
    public static void main(String[] args) {
        monoWithCallableOnComplete();
        monoWithCallableOnError();
    }

    /**
     * Creates a publisher that emits an item followed by a SUCCESS signal,
     * by using the Callable functional interface.
     * */
    public static void monoWithCallableOnComplete(){
        var fooUserCallable = new UsersCallable("FOO");
        var monoPublisher = Mono.fromCallable(fooUserCallable);
        var mySubscriber = new MySubscriber();
        monoPublisher.subscribe(mySubscriber);
    }

    /**
     * Creates a publisher that emits a FAILURE signal,
     * by using the Callable functional interface.
     * */
    public static void monoWithCallableOnError(){
        var barUserCallable = new UsersCallable("bar");
        var monoPublisher = Mono.fromCallable(barUserCallable);
        var mySubscriber = new MySubscriber();
        monoPublisher.subscribe(mySubscriber);
    }
}
