package Day_03;
import java.util.*;
public class countOccurance {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long n = obj.nextInt();
        long a = obj.nextInt();
        long count = 0;
        while(n>0){
            long rem = n%10;
            if(rem == a) count++;
            n = n/10;
        }
        System.out.println(a + " occured " + count);
    }
}
