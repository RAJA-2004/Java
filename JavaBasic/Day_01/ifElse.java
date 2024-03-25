import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        marks = sc.nextInt();
        if(marks>90){
            System.out.println("Grade : A");
        }
        else if(marks>70 && marks<90){
            System.out.println("Grade : B");
        }
        else if(marks>40 && marks<70){
            System.out.println("Grade : C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
