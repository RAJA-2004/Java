package Day_03;
import java.util.*;
public class alphabetCaseCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char str = obj.next().trim().charAt(0);
        if(str >= 'a' && str <= 'z'){
            System.out.println("small case");
        }else{
            System.out.println("upper case");
        }
    }
}
