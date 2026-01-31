import java.util.Scanner;

public class EarthquakeCategorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to the EarthquakesAdvisor3000");
        System.out.println("Please enter the magnitude of the Earthquake (use , instead of .): ");
        double userInput = input.nextDouble();

        String magnitude = (userInput < 2.0) ? "Micro"
                : (userInput >= 2.0 && userInput < 4.0) ? "Minor"
                : (userInput >= 4.00 && userInput < 5.0) ? "Light"
                : (userInput >= 5.00 && userInput < 6.0) ? "Moderate"
                : (userInput >= 6.00 && userInput < 7.0) ? "Strong"
                : (userInput >= 7.00 && userInput < 8.0) ? "Major"
                : "Great";

        switch (magnitude) {
            case "Micro":
                System.out.println("This earthquake is only detected by seismographs.");
                System.out.println("You can stay indoors :)");
                break;
            case "Minor":
                System.out.println("This earthquake is rarely felt, but recorded by seismographs.");
                System.out.println("You can stay indoors :)");
                break;
            case "Light":
                System.out.println("This earthquake is felt by people, with minor damages.");
                System.out.println("Please evacuate buildings safely.");
                break;
            case "Moderate":
                System.out.println("This earthquake can cause damage in populated areas.");
                System.out.println("Please stay away from windows and any falling objects and evacuate as soon as it's safe to do it.");
                break;
            case "Strong":
                System.out.println("This earthquake can cause serious damage in areas up to 100 miles.");
                System.out.println("Please evacuate immediately!");
                break;
            case "Major":
                System.out.println("This earthquake can cause severe damage over large areas.");
                System.out.println("Please evacuate immediately!");
                break;
            case "Great":
                System.out.println("Massive destruction!");
                System.out.println("Evacuate immediately!");
                break;
            default:
                System.out.println("Error in calculation, please try again.");
        }

    }
}
