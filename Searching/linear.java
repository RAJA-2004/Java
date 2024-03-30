package Searching;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int []arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=obj.nextInt();
        }
        int flag = 0;
        int find = obj.nextInt();
        for(int i=0;i<10;i++){
            if(find==arr[i]){
                flag = 1;
            }
        }
        if(flag==1){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
