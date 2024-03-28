package Array.Day_03;
import java.util.*;;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        rev(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void rev(int[] arr,int i,int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
