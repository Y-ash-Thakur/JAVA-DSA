package com.yash;

public class BubbleSort {
    public static void main (String [] args){
        int [] arr = {8,3,6,4,5,7,2};
        bubbleSort(arr);
        for(int num : arr){
            System.out.println(num);
        }
    }

    static void bubbleSort(int [] arr){
        int n = arr.length;

        for (int i = n-1; i >= 1; i--){
            for (int j = 0; j < i; j++ ){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
