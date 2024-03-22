package Day_03;
import java.util.*;;
public class fibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n==1 || n==0) return n;
        return fibo(n-1)+fibo(n-2);
    }
}
