package com.yash;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,3,2};
        int ans = peakIndexMountainArray(arr);
        System.out.println(ans);
    }

    static int peakIndexMountainArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                // you are in decreasing part of the array
                // This may be the answer, but look at the left
                // This is why end != mid - 1
                end = mid;
            } else {
                // you are im the asc part of the array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that what's the check say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of the above line that is the best possible answer
        return start; // or return end as both are equal
    }
}
