package com.pattern.singleton;

public class Singleton2 {

    private Singleton2(){}

    private static Singleton2 instance = new Singleton2();

    public static Singleton2 getInstance(){
        if(instance == null){
            return new Singleton2();
        }
        return instance;
    }
}
