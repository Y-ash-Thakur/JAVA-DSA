package com.yash;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitive
        int[] arr = new int[5];
        arr[0] = 23 ;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        System.out.println(arr[1]);

        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

            // Advanced version of the for loop.
//        for (int num: arr){ // for every element in array, print the element
//            System.out.print(num + " "); // here num represents element of the array
//        }

//        System.out.println(arr[5]); // Index out of bound

        // array of object
        String[] str = new String[4]; // Here new keyword is used to create an object in the heap memory,
        // and the object is holding the reference variable that is pointing to any value
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "yash";
        System.out.println(Arrays.toString(str));
    }
}
