import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Online Movie Ticketing System ===");
            System.out.println("1. View Movies");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewMovies(scanner);
                    break;
                case 2:
                    bookTicket(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using our system!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void viewMovies(Scanner scanner) {
        System.out.println("\nLatest Movies:");
        System.out.println("1. Movie A");
        System.out.println("2. Movie B");
        System.out.println("3. Movie C");
        System.out.println("4. Movie D");
        System.out.println("5. Movie E");
    }

    public static void bookTicket(Scanner scanner) {
        System.out.println("\nEnter the movie number to book a ticket: ");
        int movieChoice = scanner.nextInt();
        System.out.println("Ticket booked for Movie " + movieChoice);
    }
}
