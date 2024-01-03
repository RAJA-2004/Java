import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
public class input {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int ram = sc.nextInt();
        System.out.println("enter name : ");
        String input = scanner.next();
        System.out.println(input);
        System.out.println(ram);
    }
}
