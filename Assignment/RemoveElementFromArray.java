import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int removeIndex = 3;

        if (removeIndex >= 0 && removeIndex < array.length) {
            int[] newArray = new int[array.length - 1];
            int newIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (i != removeIndex) {
                    newArray[newIndex++] = array[i];
                }
            }
            System.out.println("Array after removing 4th element: " + Arrays.toString(newArray));
        } else {
            System.out.println("Invalid index to remove.");
        }
    }
}
