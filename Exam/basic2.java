package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class basic2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int NOTA = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
            if(arr[i]==1){
                one++;
            }
            else if(arr[i]==2){
                two++;
            }
            else if(arr[i]==3){
                three++;
            }
            else if(arr[i]==4){
                four++;
            }
            else if(arr[i]==5){
                five++;
            }
            else{
                NOTA++;
            }
        }
        System.out.println(one+" "+two+" "+three+" "+four+" "+five+" "+NOTA);
    }
}
