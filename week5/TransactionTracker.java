import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;


public class TransactionTracker {
    public static void main(String[] args) {
        ArrayList<String> transactions = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add transaction ");
            System.out.println("2. Count transactions performed yesterday");
            System.out.println("3. Calculate total income (Sales) and total expenses (Purchases)");
            System.out.println("4. Exit");
            System.out.println("5. Print all");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter type (Purchase/Sale): ");
                    String request = input.nextLine();
                    System.out.print("Enter the amount (Purchase/Sale): ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    System.out.print("Enter the date (Purchase/Sale): ");
                    LocalDate dateNow = LocalDate.now();
                    transactions.add(request + "," + amount + "," + dateNow);
                    System.out.println("Transaction succesfully added! :)");
                    break;
                case 2:
                    LocalDate dateYesterday = LocalDate.now().minusDays(1);
                    int count = 0;
                    for (String trans : transactions) {
                        String[] parts = trans.split(",");
                        if (parts[2].equals(dateYesterday.toString())) {
                            count++;
                        }
                    }
                    System.out.println("Amount of transactions yesterday: " + count);
                    break;
                case 3:
                    double income = 0;
                    double expense = 0;
                    for (String trans : transactions) {
                        String[] parts = trans.split(",");
                        String tType = parts[0];
                        double tAmount = Double.parseDouble(parts[1]);
                        if (tType.equalsIgnoreCase("Sale")) {
                            income += tAmount;
                        } else if (tType.equalsIgnoreCase("Purchase")) {
                            expense += tAmount;
                        }
                    }
                    System.out.println("Total income: " + income);
                    System.out.println("Total expense: " + expense);
                    break;
                case 4:
                    input.close();
                    System.out.println("Application is now closed");
                    break;
                case 5:
                    System.out.println(transactions);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}