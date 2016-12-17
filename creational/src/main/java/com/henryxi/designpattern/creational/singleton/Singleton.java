package com.henryxi.designpattern.creational.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {
    }
}
