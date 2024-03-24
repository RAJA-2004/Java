package Day_03;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        while(true){
            System.out.print("enter first number : ");
            int a = obj.nextInt();
            System.out.print("enter second number : ");
            int b = obj.nextInt();
            System.out.print("enter operator : ");
            char ch = obj.next().trim().charAt(0);
            if(ch == '+'){
                int sum = a+b;
                System.out.println(sum);
            }
            else if(ch == '-'){
                int sub = 0;
                if(a>b) sub = a-b;
                else sub = b-a;
                System.err.println(sub);
            }
            else if(ch == '*'){
                int product  = a*b;
                System.err.println(product);
            }
            else if(ch == '/'){
                int div = a/b;
                System.err.println(div);
            }
            else break;
        }
        System.err.println("program terminated...");
    }
}
