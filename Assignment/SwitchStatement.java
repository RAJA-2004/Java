import java.time.LocalDate;

public class SwitchStatement {
    public static void main(String[] args) {
        int choice = 3;

        switch (choice) {
            case 1:
                System.out.println("Current year: " + LocalDate.now().getYear());
                break;
            case 2:
                System.out.println("Current month: " + LocalDate.now().getMonth());
                break;
            case 3:
                System.out.println("Current day: " + LocalDate.now().getDayOfMonth());
                break;
            default:
                System.out.println("Not applicable");
                break;
        }
    }
}
