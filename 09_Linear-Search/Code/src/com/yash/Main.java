package com.yash;

public class Main{
    public static void main(String[] args) {

        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 199;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // Search the target and return true and false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if(element == target){
                return true;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target is not found
        return false;
    }

    // Search the target and return the value
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if(element == target){
                return element;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target is not found
        return Integer.MAX_VALUE;
    }

    // search in the array : return the index if item is found
    // otherwise if the item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
             // check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target is not found
        return -1;
    }
}