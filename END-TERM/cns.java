/**
 * cns
 */
import java.util.*;
public class cns {
    private int id;
    private String name;
    private String dept;
    private String city;
    private double salary;

    public cns(){
        this.id=0;
        this.name="unknown";
        this.dept="unknown";
        this.city="unknown";
        this.salary=0.0;
    }

    public cns(int id,String name){
        this.id=id;
        this.name=name;
        this.dept="unknown";
        this.city="unknown";
        this.salary=0.0;
    }

    public cns(int id,String name, String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.city="unknown";
        this.salary=0.0;
    }

    public cns(int id,String name,String dept,String city){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.city=city;
        this.salary=0.0;
    }

    public cns(int id,String name,String dept,String city,double salary){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.city=city;
        this.salary=salary;
    }

    public void display(){
        System.out.println("id: "+id+" name: "+name+" dept: "+dept+" city: "+city+" salary: "+salary);
    }

    public static void main(String[] args) {
        cns c1 = new cns();
        c1.display();
        cns c2 = new cns(1,"raja");
        c2.display();
        cns c3 = new cns(2,"raja","cse");
        c3.display();
        cns c4 = new cns(3,"raja","cse","doon");
        c4.display();
        cns c5 = new cns(4,"raja","cse","doon",15000.00);
        c5.display();
    }
}