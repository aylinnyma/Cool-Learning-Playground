import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game options
        String[] options = {"Rock", "Paper", "Scissors"};

        // Start the game
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors). Type 'exit' to quit:");

        while (true) {
            // Player's choice
            System.out.print("Your choice: ");
            String playerChoice = scanner.nextLine();

            // Exit condition
            if (playerChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Validate player's choice
            int playerIndex = -1;
            for (int i = 0; i < options.length; i++) {
                if (playerChoice.equalsIgnoreCase(options[i])) {
                    playerIndex = i;
                    break;
                }
            }
            if (playerIndex == -1) {
                System.out.println("Invalid choice. Please select Rock, Paper, or Scissors.");
                continue;
            }

            // Computer's choice
            int computerIndex = random.nextInt(3);
            String computerChoice = options[computerIndex];
            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (playerIndex == computerIndex) {
                System.out.println("It's a tie!");
            } else if ((playerIndex == 0 && computerIndex == 2) ||
                       (playerIndex == 1 && computerIndex == 0) ||
                       (playerIndex == 2 && computerIndex == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}