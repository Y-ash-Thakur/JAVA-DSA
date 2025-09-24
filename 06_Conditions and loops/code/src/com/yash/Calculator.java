package com.yash;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take the input from the user till the user does not press X or x
        int ans = 0;
        while (true){
            // take the operator from the user
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.println("Enter number 1");
                int num1 = in.nextInt();
                System.out.println("Enter number 2");
                int num2 = in.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }

                if (op == '-') {
                    ans = num1 - num2;
                }

                if(op == '*'){
                    ans = num1 * num2;
                }

                if(op == '/'){
                    ans = num1 / num2;
                }
            } else if(op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("Invalid Character");
            }
            System.out.println(ans);
        }
    }
}
