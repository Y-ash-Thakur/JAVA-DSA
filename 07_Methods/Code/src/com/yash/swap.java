package com.yash;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;

        // in java there is no call by reference, there is only call by value
        swap(20,10);
//        System.out.println(a + " " + b);

        String name = "yash thakur";
        changeName(name);  // Here the value of reference variable is passed
        System.out.println(name);
    }

    static void changeName(String naam){
        naam = "onam thakur"; // here we are creating a new object
    }

    static void swap(int num1, int num2){
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
//        System.out.println(a + " " + b);
        // this chnage will only be valid in the function scope only.
    }
}
