package com.yash;

public class Main{
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "yash thakur";
        

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 45;
        int rno3 = 89;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // array objects are in heap.
        // Heap objects are not continuous // Means continuous block of memory
        // Dynamic memory allocation
        // array objects in java may not be continuous ===> depends on jvm
        // store 5 roll numbers:
//        int [] rnos = new int[5]; // rnos reference variable is pointing to the array object of int data type.
//        // or directly
//        int [] rnos2 = {1,2,3,4,5,6,7,8,9};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the (heap) memory

//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

        for(String element : arr) {
            System.out.println(element);
        }
    }
}