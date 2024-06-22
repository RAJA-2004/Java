package OOPS.class_02;
import java.util.*;;
public class inheritance {
    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);
        circle c = new circle();
        c.area();
        c.perimeter();
        triangle t = new triangle();
        t.area();
        t.perimeter();
        rectangle r = new rectangle();
        r.area();
        r.perimeter();
    }
}

class shape{
    int radius,length,width,height,base,perpendicular;
    public void area(){
        System.out.println("shape area");
    }
    public void perimeter(){
        System.out.println("shape perimeter");
    }
}

class circle extends shape{
    Scanner obj = new Scanner(System.in);
    public void area(){
        System.out.println("enter radius");
        super.radius = obj.nextInt();
        System.out.println("area: "+(super.radius*super.radius));
    }
    public void perimeter(){
        System.out.println("perimeter: "+(2*3.14*super.radius));
    }
}

class triangle extends shape{
    Scanner obj = new Scanner(System.in);
    public void area(){
        System.out.println("enter height base and perpendicullar");
        super.height = obj.nextInt();
        super.base = obj.nextInt();
        super.perpendicular = obj.nextInt();
        System.out.println("area: "+(0.5*super.base*super.height));
    }
    public void perimeter(){
        System.out.println("perimeter: "+(super.radius+super.perpendicular+super.height));
    }
}

class rectangle extends shape{
    Scanner obj = new Scanner(System.in);
    public void area(){
        System.out.println("enter length width");
        super.length = obj.nextInt();
        super.width = obj.nextInt();
        System.out.println("area: "+(super.length*super.width));
    }
    public void perimeter(){
        System.out.println("perimeter: "+(2*(super.length+super.width)));
    }
}