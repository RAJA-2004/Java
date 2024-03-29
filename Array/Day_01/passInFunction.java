package Array.Day_01;
import java.util.*;;
public class passInFunction {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int [] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Before"+'\n'+Arrays.toString(arr));
        change(arr);
        System.out.println("After"+'\n'+Arrays.toString(arr));
    }
    static void change(int []arr){
        arr[1] = 99;
    }
}
