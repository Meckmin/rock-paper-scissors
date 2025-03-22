import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        String playAgain;

        do {
            String playerChoice = enterMove();
            String computerChoice = randomMove();

            if (playerChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("paper")) {
                System.out.println("You lost.");
            } else if (playerChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) {
                System.out.println("You win!");
            } else if (playerChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("scissors")) {
                System.out.println("You lost.");
            } else if (playerChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) {
                System.out.println("You win!");
            } else if (playerChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("rock")) {
                System.out.println("You lost.");
            } else if (playerChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Draw!");
            }

            playAgain = playAgain();

        } while (playAgain.equalsIgnoreCase("yes"));

        scanner.close();
    }

    static String randomMove() {

        String[] choices = {"rock", "paper", "scissors"};

        String computerChoice = "";
        computerChoice = choices[random.nextInt(1,4)];
        System.out.println("Computer choice: " + computerChoice);

        return computerChoice;
    }

    static String enterMove() {

        String playerChoice;
        while (true) {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine();

            if (!playerChoice.equalsIgnoreCase("rock") &&
                    !playerChoice.equalsIgnoreCase("paper") &&
                    !playerChoice.equalsIgnoreCase("scissors")) {
                System.out.println("Invalid move!");
            } else {
                break;
            }
        }

        return playerChoice;
    }

    static String playAgain() {

        String playAgain;
        while (true) {
            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("yes") && !playAgain.equalsIgnoreCase("no")) {
                System.out.println("Invalid answer!");
            } else {
                break;
            }
        }

        return playAgain;
    }

}
