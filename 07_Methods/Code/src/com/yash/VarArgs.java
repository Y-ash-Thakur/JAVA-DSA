package com.yash;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // Variable length arguments - when we create a method that takes the variables numbers of arguments.
        // it is used when we don't know the numbers of arguments we want to pass during the function call.
        // variable length arguments always at the end
//        fun(1,2,3,4,5,6,7,8,9);
//        multiple(1,2, "yash", "onam");
//        demo(2,3,4,5,6,7,8,9); // Integer
//        demo("yash", "onam"); // String
//            demo() // If we are not passing any arguments then function will be confused what to process
        // Then this situation is known is AmbiGuity
        // AmbiGuity is the situation in which the java compiler is uncertain about the selection of the method
    }

    // when we have to take mix arguments i:e normal arguments with keyword arguments

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
        System.out.println();
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
