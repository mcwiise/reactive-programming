package com.reactor.training.monos;

import java.util.concurrent.Callable;

public class UsersCallable implements Callable<String> {

    private String name;

    public UsersCallable(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        if("FOO".equals(name)){
            return "Welcome back Mr. Foo";
        } else {
            throw new ClassNotFoundException("Unknown user: " + name);
        }
    }
}
