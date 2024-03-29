package Array.Day_02;

import java.util.Arrays;
import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int [][] arr = {
            {1,2,3},
            {4,5},
            {6,7,8,9,10}
        };
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
    }
}
