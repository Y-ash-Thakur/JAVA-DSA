package com.yash;

public class Scoping {
    static int a = 500;
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "yash";
        {
//            int a = 78; // Already initialised outside the block in the same method, hence you can not initialise again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name =  "onam";
            System.out.println(name);
            // Value initialised in the block, will remain in the block
        }
        System.out.println(a);
        System.out.println(name);

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 1000;
        }
        System.out.println(a);
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
