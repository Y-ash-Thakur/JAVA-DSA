package com.yash;

public class Ceiling {
    public static void main(String[] args) {
//        int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
//        int target = 22;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
//            int mid = (start + end)/2; // might be possible that (start + end) exceeds the range of the integer
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
//                end = mid - 1;
                start = mid + 1; // when array is in descending order
            } else if(target > arr[mid]){
//                start = mid + 1;
                end = mid - 1; // when array is in descending order
            } else {
                // answer found
                return mid;
            }
        }
        return start;
    }
}