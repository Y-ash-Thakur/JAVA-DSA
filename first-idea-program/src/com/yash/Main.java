package com.yash; // it's the folder in which our java file lies

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("hey how are you");  // System.out is a standard output stream
        Scanner input = new Scanner(System.in); // every class in java extends the object,
        // Scanner is a class that specifies the input stream and using the object of the class we can take the input
        System.out.println(input.nextLine());
    }
}
