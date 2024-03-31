package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class basic2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String newstr = new String(arr);
        System.out.println(newstr);
    }
}
