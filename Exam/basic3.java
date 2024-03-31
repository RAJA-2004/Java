package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class basic3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
        }
        int count = 0;
        for(int i=0;i<str1.length();i++){
            if(arr1[i]!=arr2[i]){
                System.err.println("not anagram");
                break;
            }
            count++;
        }
        if(count==str1.length()){
            System.err.println("anagram");
        }
    }
}
