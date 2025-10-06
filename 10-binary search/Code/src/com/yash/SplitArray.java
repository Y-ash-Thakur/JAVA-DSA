package com.yash;

public class SplitArray {
    public static void main(String[] args){
        int [] nums = {7,2,5,10,8};
        int m = 2;
        int answer = splitArray(nums, m);
        System.out.println(answer);
    }

    static int splitArray(int [] nums, int m){
        int start = 0;
        int end = 0;

        // Find the upper and lower limit
        for (int i = 0; i < nums.length; i ++){
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        // binary search
        while(start < end){
            // try for the middle as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with max sum
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if(sum + num > mid){
                    // you cannot add this in this subArray, make a new one
                    sum = num;
                    pieces ++;
                } else {
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // as at this point start and end will be the same
    }
}
