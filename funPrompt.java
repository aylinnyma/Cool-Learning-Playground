import java.util.Scanner;

public class funPrompt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = input.nextLine();

        System.out.print("What's your favorite emoji? ");
        String emoji = input.nextLine();

        System.out.println("\nHello " + name + "! Welcome to Java 😄");
        System.out.println("Your emoji of the day is: " + emoji);

        input.close();
    }
}
