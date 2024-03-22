package Day_03;
import java.util.*;;
public class reverse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = 0;
        while(a>0){
            int rem = a%10;
            b = b*10 + rem;
            a = a/10;
        }
        System.out.println(b);
    }   
}
