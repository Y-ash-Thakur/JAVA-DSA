package com.yash;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = in.nextInt();

        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if( n % 10 == 2){
                count ++;
            }
            n = n/10;
        }

        System.out.println(count);

    }
}
