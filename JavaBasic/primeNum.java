import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int c = (int)Math.sqrt(a);
        int count = 0;
        for(int i=2;i<c;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Prime");
        }else{
            System.out.println("not Prime");
        }
    }
}
