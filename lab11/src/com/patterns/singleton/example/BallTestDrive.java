package com.patterns.singleton.example;

public class BallTestDrive {
    public static void main(String[] args) {
        Ball b1 = Ball.getInstance("Blue");
        b1.bounce();
    }
}
