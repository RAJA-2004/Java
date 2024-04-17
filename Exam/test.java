package Exam;

import java.util.*;

public class test {

    private static int count = 0;
    public test(){
        count++;
    }

    public static void swaps(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);



        // ! WAVE SORT
        // System.out.print("enter array size : ");
        // int n = obj.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = obj.nextInt();
        // }
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length-1;i+=2){
        //     swaps(arr,i,i+1);
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // ! METHOD OVERLOADING
        // cp c = new cp();
        // c.test1();
        // c.test1(1);
        // c.test1(2,"raja");

        // ! METHOD OVERRIDING
        // cp c1 = new cp();
        // c1.name();

        // ! INTERFACE
        // raja r = new raja();
        // r.display();

        // ! INHERITANCE
        // fish shark = new fish();
        // shark.color();
        // shark.eat();
        // shark.breathe();
        // teacher t = new teacher();
        // regular r = new regular();
        // casual c = new casual();
        // officer o = new officer();
        // c.code = 123;
        // c.name = "aakash";
        // t.subject = "java";
        // t.publication = "gehu";
        // c.speed = 1234;
        // o.grade = 10;
        // c.wages = 35.45;
        // t.display();
        // c.display();
        // o.display();

        // ! COPY CONSTRUCTOR
        // Bank b = new Bank();
        // b.display();
        // Bank b2 = new Bank(b);
        // b2.name = "raja";
        // b2.balance = 43.56;
        // System.out.println();
        // b2.display();

        // ! PRIME
        // System.out.print("enter the number : ");
        // int a = obj.nextInt();
        // int flag = 0;
        // for(int i=2;i<a;i++){
        //     if(a%i==0){
        //         flag = 1;
        //         break;
        //     }
        // }
        // if(flag==1) System.out.println("not prime");
        // else System.out.println("prime");
        
        // ! COUNT OBJECTS CREATED
        // test a = new test();
        // test b = new test();
        // test c = new test();
        // System.out.println("object creation count : "+test.count);

        // ! BANK CLASS
        // String name;
        // String type;
        // long account_no;
        // double amount;
        // System.out.print("enter name : ");
        // name = obj.nextLine();
        // System.out.print("enter account type : ");
        // type = obj.nextLine();
        // System.out.print("enter account no : ");
        // account_no = obj.nextLong();
        // System.out.print("enter base amount : ");
        // amount = obj.nextDouble();
        // Bank b = new Bank(name, type, account_no, amount);
        // System.out.println("account created successfully !!!");
        // System.out.println();
        // System.out.print("enter amount to deposit : ");
        // double y = obj.nextDouble();
        // b.deposit(y);
        // b.withdraw();
        // b.display();

        // ! SUM OF DIAGONALS
        // int[][] arr1 = new int[3][3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         arr1[i][j] = obj.nextInt();
        //     }
        // }
        // int add = 0;
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         if(i==j){
        //             add+=arr1[i][j];
        //         }
        //     }
        // }
        // System.out.println("sum of diagonals : "+add);

        // ! ADD MATRIX
        // int[][] arr1 = new int[3][3];
        // int[][] arr2 = new int[3][3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         arr1[i][j] = obj.nextInt();
        //     }
        // }
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         arr2[i][j] = obj.nextInt();
        //     }
        // }
        // int[][] add = new int[3][3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         add[i][j] = arr1[i][j]+arr2[i][j];
        //     }
        // }
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(add[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // ! CASE CONVERT AND FREQUENCY COUNT
        // String str1 = obj.nextLine();
        // String str2 = "";
        // for(int i=0;i<str1.length();i++){
        //     char ch = str1.charAt(i);
        //     if(ch >= 'a' && ch <= 'z'){
        //         ch = (char)(ch+'A'-'a');
        //     }
        //     str2+=ch;
        // }
        // System.out.println(str2);
        // int[] frequency = new int[256];
        // char[] s2 = str2.toCharArray();
        // for(char ch:s2){
        //     frequency[ch]++;
        // }
        // for(int i=0;i<256;i++){
        //     if(frequency[i]!=0){
        //         System.out.println((char)i+"-"+frequency[i]);
        //     }
        // }

        // ! COMMON ELEMENTS IN 3 ARRAY
    //     System.out.print("enter size of array 1 : ");
    //     int m = obj.nextInt();
    //     System.out.print("enter size of array 2 : ");
    //     int n = obj.nextInt();
    //     System.out.print("enter size of array 3 : ");
    //     int p = obj.nextInt();
    //     int[] arr1 = new int[m];
    //     int[] arr2 = new int[n];
    //     int[] arr3 = new int[p];
    //     for(int i=0;i<m;i++){
    //         arr1[i] = obj.nextInt();
    //     }
    //     for(int i=0;i<n;i++){
    //         arr2[i] = obj.nextInt();
    //     }
    //     for(int i=0;i<p;i++){
    //         arr3[i] = obj.nextInt();
    //     }
    //    Set<Integer> st = new HashSet<>();
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             for(int k=0;k<p;k++){
    //                 if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
    //                     st.add(arr1[i]);
    //                 }
    //             }
    //         }
    //     }
    //     System.out.println(st);

        // ! ISOMORPHIC
        // String str1 = obj.nextLine();
        // String str2 = obj.nextLine();
        // int ans = 0;
        // Map<Character,Character> mp = new HashMap<>();
        // if(str1.length()!=str2.length()){
        //     System.out.println("not isomorphic");
        // }
        // for(int i=0;i<str1.length();i++){
        //     char s1 = str1.charAt(i);
        //     char s2 = str2.charAt(i);
        //     if(mp.containsKey(s1)){
        //         if(mp.get(s1)!=s2){
        //             ans = -1;
        //         }
        //     }else{
        //         if(mp.containsValue(s2)){
        //             ans = -1;
        //         }
        //         mp.put(s1, s2);
        //     }
        // }
        // if(ans == -1) System.out.println("not isomorphic");
        // if(ans == 0) System.out.println("isomorphic");

        // ! MATRIX MULTIPLY
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j] = obj.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j] = obj.nextInt();
            }
        }
        int a = arr1.length;
        int b = arr2.length;
        int c = arr2[0].length;
        int[][] arr3 = new int[a][c];
        for(int i=0;i<a;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<b;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // ! TRANSPOSE MATRIX
        int[][] transpose = new int[3][3];
        int rows = arr3.length;
        int cols = arr3[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i] = arr3[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        } 

        // ! PANGRAM
        String str = obj.nextLine();
        boolean[] mark = new boolean[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch+'a'-'A');
            }
            if(ch >='a' && ch <= 'z'){
                mark[ch-'a']=true;
            }
        }
        int res = -1;
        for(int i=0;i<26;i++){
            if(!mark[i]){
                res = 0;
                System.out.println("not pangram");
                break;
            }
        }
        if(res == -1) System.out.println("pangram");

        // ! GCD
        // int a = obj.nextInt();
        // int b = obj.nextInt();
        // while(b!=0){
        //     int temp = b;
        //     b = a%b;
        //     a = temp;
        // }
        // System.out.println("gcd is : "+a);

        // ! ANAGRAM
        String str1 = obj.nextLine();
        String str2 = obj.nextLine();
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        int count = 0;
        if(str1.length()!=str2.length()){
            System.out.println("not anagram");
        }
        else{
            for(int i=0;i<str1.length();i++){
                if(s1[i]!=s2[i]){
                    System.out.println("not anagram");
                    break;
                }else{
                    count++;
                }
            }
        }
        if(count==str1.length()) System.out.println("anagram");
    }
}

interface human{
    void gender();
}

interface boy{
    void age();
}

class raja implements human, boy{
    public void gender(){
        System.out.println("male");
    }
    public void age(){
        System.out.println("20");
    }
    public void display(){
        this.gender();
        this.age();
    }
}

class p{
    public void name(){
        System.out.println("raja");
    }
    public void test1(){
        System.out.println("no parameter");
    }
    public void test1(int num,String name){
        System.out.println("two parameter :- "+num+" and "+name);
    }
}

class cp extends p{
    public void name(){
        System.out.println("raja digvijay singh");
    }
    public void test1(int num){
        System.out.println("one parameter :- "+ num);
    }
}

class stuff{
    int code;
    String name;
}

class teacher extends stuff{
    String subject;
    String publication;
    public void display(){
        System.out.println(subject+" "+publication);
    }
}

class typist extends stuff{
    int speed;
}

class officer extends stuff{
    int grade;
    public void display(){
        System.out.println(grade);
    }
}

class regular extends typist{

}

class casual extends typist{
    double wages;
    public void display(){
        System.err.println(code+" "+name+" "+speed+" "+wages);
    }
}

class Animal{
    String area;
    public void color(){
        System.out.println("animal color");
    }
    public void eat(){
        System.out.println("eats");
    }
}

class fish extends Animal{
    String type;
    public void breathe(){
        System.out.println("breathe");
    }
}

class Bank{
    Scanner obj = new Scanner(System.in);
    String name;
    String type;
    long account_no;
    double balance;
    public Bank(){
        this.name = "null";
        this.account_no = 0;
        this.balance = 0;
        this.type = "null";
    }
    public Bank(Bank b){
        this.name = b.name;
        this.account_no = b.account_no;
        this.balance = b.balance;
        this.type = b.type;
    }
    public Bank(String name,String type,long account_no,double balance){
        this.name = name;
        this.account_no = account_no;
        this.type = type;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("deposit successfully");
    }
    public void withdraw(){
        System.out.println("current balance : "+this.balance);
        System.out.print("enter amount to withdraw : ");
        double x = obj.nextInt();
        if(x > this.balance) System.out.println("insufficient balance !!!");
        else{
            this.balance-=x;
            System.out.println("withdrwal successfully");
        }
    }
    public void display(){
        System.err.println("name : "+this.name);
        System.out.println("balance : "+this.balance);
    }
}