package com.cydeo.test.day10_javaFaker_driver_util;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_Practice  {

    @Test
    public void java_faker_practice(){

        Faker faker = new Faker();
        String name = faker.name().fullName();
        System.out.println(name);
        System.out.println("faker.harryPotter().quote() = " + faker.harryPotter().quote());
        System.out.println("faker.gameOfThrones().quote() = " + faker.gameOfThrones().quote());

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.numerify(\"773-###-###\") = " + faker.numerify("773-###-###"));

        System.out.println("faker.letterify(\"???\") = " + faker.letterify("???"));
        System.out.println("faker.howIMetYourMother().catchPhrase() = " + faker.howIMetYourMother().catchPhrase());
    }
}
