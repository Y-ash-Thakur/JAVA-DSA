package com.yash;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "yash";
        char target = 's';
//        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch: str.toCharArray()) // for every char in my char array
        if(ch == target){ // To apply for each loop we must have the set of array that is why we converted our string into array
            return true;
        }
        return false;
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
