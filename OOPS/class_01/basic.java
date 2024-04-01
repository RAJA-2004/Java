package OOPS.class_01;
import java.util.*;;
class Student{
    int roll;
    String name;
    double marks;
    Student(){
        this.roll = 0;
        this.name = "empty";
        this.marks = 0;
    }
    Student(int roll,String name,double marks){
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }
    void display(){
        System.out.println(name+" "+marks+" "+roll);
    }
}
public class basic {

    public static void main(String[] args) {
        // Student[] s1 = new Student[5];
        // Student raja = new Student();
        // System.out.println("BEFORE"+'\n'+raja.marks+" "+ raja.name+" "+raja.roll);
        // raja.marks = 90;
        // raja.name = "raja";
        // raja.roll = 3;
        // System.out.println("AFTER"+'\n'+raja.marks+" "+ raja.name+" "+raja.roll);
        
        // ! cant change the value once set
        // final int number = 10;
        
        // Student rohan = new Student(12,"rohan",90.90);
        // rohan.display();


        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        int count = 1;
        int ans = 0;
        if(n==1){
            ans=1;
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i]){
                count++;
                if(count > ans){
                    ans = count;
                }
            }else{
                count = 1;
            }
        }
        System.out.println(ans);
    }
}
