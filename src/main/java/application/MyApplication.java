package main.java.application;

import main.java.person.Gender;
import main.java.person.Person;

public class MyApplication {
    public static void main(String[] args) {
        Person adis = new Person("Adis", Gender.MALE);
        System.out.println(adis);
    }
}
