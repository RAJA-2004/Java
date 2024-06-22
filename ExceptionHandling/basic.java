package ExceptionHandling;

public class basic {
    public static void main(String[] args) {
        System.out.println("program started...");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("program ended...");
    }
}
