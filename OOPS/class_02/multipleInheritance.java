package OOPS.class_02;
import java.util.*;;
public class multipleInheritance {
    public static void main(String[] args) {
        System.out.println("hello");
        test t = new test();
        t.test();
        t.user();
        t1 tt = new t1();
        tt.test();
    }
}

interface parent1{
    public void test();
    public void user();
}

interface parent2{
    public void test();
    public void user();
}

class test implements parent1, parent2{
    public void test(){
        System.out.println("test 1-2");
    }
    public void user(){
        System.out.println("user 1-2");
    }
}

class t1 extends parent1{
    public void test(){
        System.out.println("t1");
    }
}
