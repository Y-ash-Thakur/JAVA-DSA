package com.yash;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(23, 56);
        System.out.println(ans);
    }

    // pass the value of number when you are calling a method in main()

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Returning a value
    static public int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

//        System.out.println("This statement is unreachable thus it will not execute");
    }

    static public void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = in.nextInt();
        System.out.println("Enter number 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }

    /*
        syntax of the method
        access modifier return_type name_of _the_function(parameters){
        // body
        return statement;
        }
    */

}
