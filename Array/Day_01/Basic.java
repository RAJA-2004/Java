package Array.Day_01;
import java.lang.reflect.Array;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();

        // ! array declaration
        // ! datatype [] "name" = new datatype[size]
        int []arr = new int[x];
        String []str = new String[x];
        // ! direct declaration 
        int []own = {1,2,3,4,5};


        int []test;         // declaration
        test = new int[5]; // initialisation

        for(int i=0;i<x;i++){
            int a = obj.nextInt();
            arr[i] = a;
        }

        for(int i=0;i<x;i++){
            str[i] = obj.next();
        }
        // ! using indexing
        // for(int i=0;i<x;i++){
        //     System.out.print("value at index "+i+" : "+arr[i]+'\n');
        // }
        //  ! for each loop
        // for(int a : arr){
        //     System.out.println(a);
        // }
        // ! using inbuilt method
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
    }
}
