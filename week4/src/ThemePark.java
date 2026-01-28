import java.util.Scanner;

public class ThemeParkTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basePrice = 20.0;

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        System.out.print("Are you a student or a senior? (student/senior/none): ");
        String type = scanner.nextLine().toLowerCase();

        double finalPrice = basePrice;

        // Calculate discount
        if (type.equals("student") && age < 30) {
            finalPrice = basePrice * 0.8; // 20% off
        } else if (type.equals("senior") && age >= 65) {
            finalPrice = basePrice * 0.7; // 30% off
        }

        System.out.println("Your ticket price is: $" + finalPrice);

        scanner.close();
    }
}