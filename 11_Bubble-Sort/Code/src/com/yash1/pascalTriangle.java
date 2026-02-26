package com.yash1;
import java.util.*;

public class pascalTriangle {
    public static void main(String [] args){

        int n = 5;
        List<List<Integer>> result = generate(n);

        for (List<Integer> row : result){
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println( );
        }

    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));

            for (int j = 1; j < i; j++){
                row.set(j, triangle.get(i-1).get(j-1) +
                        triangle.get(i - 1).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }
}
