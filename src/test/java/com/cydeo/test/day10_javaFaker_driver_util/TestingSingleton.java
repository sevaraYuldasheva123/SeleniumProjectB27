package com.cydeo.test.day10_javaFaker_driver_util;

import org.testng.annotations.Test;

public class TestingSingleton {

    @Test
    public void singleton_understand_test(){

        String str1 = Singleton.getWord();
        System.out.println(str1);

        String str2 = Singleton.getWord();
        System.out.println(str2);

        String str3 = Singleton.getWord();
        System.out.println(str3);

    }

    @Test
    public void singleton_understand_test2(){
        String str4 = Singleton.getWord();
        System.out.println(str4);
    }
}
