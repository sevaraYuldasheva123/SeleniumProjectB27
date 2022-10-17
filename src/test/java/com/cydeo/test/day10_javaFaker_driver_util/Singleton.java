package com.cydeo.test.day10_javaFaker_driver_util;

public class Singleton {

    //1st step --> creating private constructor

    private Singleton(){

    }
    //2nd step --> creating private static String
    private static String word;

    //provide getter method to prevent the access
    public static String getWord(){

        if (word == null){
            System.out.println("First time call. Word obect is null "+ "Assigning the value now");
            word = "something";
        }else {
            System.out.println("Word already has a value");
        }
        return word;
    }
}
