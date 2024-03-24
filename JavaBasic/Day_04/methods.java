package Day_04;
import java.util.*;
public class methods {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        sum(a, b);
        System.err.println("difference is : " + sub(a,b));
    }

    static int sub(int a ,int b){
        int sub = a-b;
        return sub;
    }

    static void sum(int a,int b){
        int sum = a+b;
        System.out.println("sum is : " + sum);
    }
}

