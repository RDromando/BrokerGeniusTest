package com.BingoDraw;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import static sun.misc.Version.print;

public class Main {


    public static void main(String[] args) {

        int myList[] = new int[75];
        int capacity = myList.length;
        int size = 0;

        while (size < capacity) {
            int newNumber = getRandomNumber1(1, 76);

            if(IntStream.of(myList).anyMatch(x -> x == newNumber) == false){
                myList[size] = newNumber;
                System.out.println("New saved number on the position " + size +" is: " + newNumber);
                size++;
            } else {
                System.out.println(newNumber + " already exists!");
            }
        }

        printArrayLength(myList);
    }

    private static void printArrayLength(int[] anArray) {
        if (anArray == null) {
            System.out.println("The length of the array can't be determined.");
        } else {
            int arrayLength = anArray.length;
            System.out.println("The length of the array is: " + arrayLength);
        }
    }

    private static int getRandomNumber1(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }

        Random random = new Random();
        return random.ints(1, min, max).findFirst().getAsInt();


    }
}

