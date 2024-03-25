// ! package are like folders

package Day_02;

import java.util.*;

public class Demo {
    public static void main(String[] args){
        // ! 30 "raja"
        System.out.println("value at index 0 : " + args[0]); // 30
        System.out.println("value at index 1 : " + args[1]); // raja

        Scanner input = new Scanner(System.in); // system.in is standard keyboard input
        
        System.out.print("enter roll no : ");
        int a = input.nextInt();       // integer input
        System.out.print("enter name : ");
        String str1 = input.next();    //  string input , it will only take single word
        String str2 = input.nextLine(); // takes input of all the line
        
        System.out.println("entered string 1 : " + str1);
        System.out.println("entered string 2 : " + str2);
        System.out.println("entered number : " + a);

        // ! b -> identifier & 10 -> literal
        int b = 10;
    }
}
