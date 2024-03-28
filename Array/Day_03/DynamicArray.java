package Array.Day_03;

import java.util.*;;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // ! ArrayList is similar to Vector
        int maxi = -1;
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i=0;i<10;i++){
            list.add(obj.nextInt());
            if(maxi < list.get(i)){
                maxi = list.get(i);
            }
        }

        // ! use .get(index)
        // for(int i=0;i<10;i++){
        //     System.out.println(list.get(i));
        // }
        System.out.println(list);
        System.err.println("maximum element : "+maxi);
    }
}
