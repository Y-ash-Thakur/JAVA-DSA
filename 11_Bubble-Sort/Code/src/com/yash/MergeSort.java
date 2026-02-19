package com.yash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String [] args ){
        int [] arr = {5,2,8,4,1};
        mS(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void mS(int [] arr, int low, int high){
        if (low >= high) return;
        int mid = low + (high - low)/2;
        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int [] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int index = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while(left <= mid){
            temp.add(arr[left++]);
        }

        while(right <= high){
            temp.add(arr[right++]);
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
}
