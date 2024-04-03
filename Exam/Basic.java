package Exam;

import java.util.*;

abstract class abs{
    abs(){
        System.out.println("abstract class constructor");
    }
    abstract void aMethod();
    void normalMethod(){
        System.out.println("noraml method");
    }
};

class subclass extends abs{
    void aMethod() {
        System.out.println("This is an implementation of the abstract method.");
    }
}

public class Basic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // ! max occur character


        String str = obj.nextLine();
        char[] arr = str.toCharArray();
        int[] hash = new int[256]; // Correct initialization
        for (int i = 0; i < str.length(); i++) {
            hash[arr[i]]++; // Correct index calculation
        }
        int maxi = 0;
        char ans = ' ';
        for (int i = 0; i < str.length(); i++) { // Iterate over the length of the string
            if (hash[arr[i]] > maxi) { // Compare with maxi
                maxi = hash[arr[i]];
                ans = arr[i]; // Store the character
            }
        }
        System.out.println(ans); 
        // subclass obj = new subclass();

        // // Call the abstract method
        // obj.aMethod();

        // // Call the non-abstract method
        // obj.normalMethod();

        // String[] names = new String[5];
        // int[] votes = new int[5];
        // float[] totalVotes = new float[5];
        // int sum = 0;
        // for(int i=0;i<5;i++){
        //     names[i] = obj.next();
        //     votes[i] = obj.nextInt();
        //     sum+=votes[i];
        // }
        // for(int i=0;i<5;i++){
        //     totalVotes[i] = (votes[i]*100)/sum;
        // }
        // System.out.println("RESULT"+'\n');
        // for(int i=0;i<5;i++){
        //     System.out.print(names[i]+" "+votes[i]+" "+totalVotes[i]+'\n');
        // }
        // System.out.println("total" + " " + sum);
        // System.out.println("the winner of election is : "+winner(votes, names));
    }
    static String winner(int[] votes,String[] names){
        int maxi = -1;
        int index = 0;
        for(int i=0;i<5;i++){
            if(votes[i]>maxi){
                maxi = votes[i];
                index = i;
            }
        }
        return names[index];
    }
}
