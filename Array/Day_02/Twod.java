package Array.Day_02;

import java.util.Arrays;
import java.util.Scanner;

public class Twod {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.err.print("enter row size : ");
        int x = obj.nextInt();
        System.err.print("enter col size : ");
        int y = obj.nextInt();
        int [][] arr = new int[x][y];

        int [][] arr2 = {
            {1,2,3},{4,5,6},{7,8,9}
        };

        // ! this is also correct bcz each array is an individual object
        int [][] arr3 = {
            {1,2,3},
            {4,5},
            {7,8,9,10,11}
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = obj.nextInt();
            }
        }

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        for(int[] i:arr){
            System.out.println(Arrays.toString(i));
        }
    }
}
