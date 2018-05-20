package com.BingoNumberGenerator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        System.out.println("Your 1st random number is: " +getRandomNumber1(1,75));
        System.out.println("Your 2nd random number is: " +getRandomNumber2(1,75));
        System.out.println("Your 3rd random number is: " +getRandomNumber3(1,75));

    }

    private static int getRandomNumber3(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }

        int randomNumber2 = ThreadLocalRandom.current().nextInt(min,max);
        return randomNumber2;
    }

    private static int getRandomNumber2(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    private static int getRandomNumber1(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }

        Random random = new Random();
        return random.ints(1, min, max).findFirst().getAsInt();


    }
}
