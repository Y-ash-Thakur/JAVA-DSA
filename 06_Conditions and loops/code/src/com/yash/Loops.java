package com.yash;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: Print numbers from 1 to 5
        /*
        Syntax of for loop

        for (initialisation; condition; increment/decrement)  {
            // body
        }
        */

        // Q: Print numbers from one to five
//        for(int i = 1; i < 5; i++){
//            System.out.println(i);
//        }

        // print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num < n; num++){
//            System.out.print(num + " ");
//            System.out.println("Hello World");

        // While loops
        /*
        Syntax:
        while (condition) {
            // body
        }
        */

        int i = 1;
        while(i <=5){
//            System.out.println(i);
            i ++;
        }

        // do while
        /*

        do {

        } while(condition);

        */
        int n = 1;
        do{
            System.out.println("Hello World");
        } while(n != 1);


    }

}

