package com.yash;

import static com.yash.StringExample.greet;

public class PassingExample {
    public static void main(String[] args) {
     String name = "iron man";
     greet(name);
    }

    static void greet(String naam) {
        System.out.println(naam);
    }
}

