package Pattern;

public class numDiamond {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the diamond

        if (n % 2 == 0) {
            System.out.println("Please use an odd number for a symmetric number diamond pattern.");
        } else {
            printNumberDiamond(n);
        }
    }
    public static void printNumberDiamond(int n) {
        int spaces = n / 2;

        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
            spaces--;
        }

        spaces = 1;

        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            System.out.println();
            spaces++;
        }
    }
}
