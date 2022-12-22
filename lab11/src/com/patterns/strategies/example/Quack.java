package com.patterns.strategies.example;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}