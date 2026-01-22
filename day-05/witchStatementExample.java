import java.util.Scanner;

public class SwitchStatementExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected option ONE");
                break;

            case 2:
                System.out.println("You selected option TWO");
                break;

            case 3:
                System.out.println("You selected option THREE");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
