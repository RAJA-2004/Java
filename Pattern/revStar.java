package Pattern;

public class revStar {
    public static void main(String arg[]){
        for(int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();;
        }
    }
}
