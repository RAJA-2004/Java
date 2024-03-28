package Array.Day_03;

import java.util.Arrays;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int []arr = {1,3,5,7};
        swaps(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swaps(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
