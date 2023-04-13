//1.25.23
//Marko Pavic
//Lab1

import java.util.Scanner;
import java.util.Random;

public class Game {
    // Constants
    private static final String[] options = {"rock", "paper", "scissors", "lizard", "Spock"};
    private static final int NUM_OPTIONS = options.length;
    // Next to be completed are instance variables
    private int computerChoice;
    private int userChoice;
    private Scanner sc;
    private Random rand;
    //Contructer
    public Game() {
        sc = new Scanner(System.in);
        rand = new Random();
    }
    // Main method
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
    private void play() {
        // Generate random number between 1 and NUM_OPTIONS with is (5)
        computerChoice = rand.nextInt(NUM_OPTIONS) + 1;
        // Ask user to enter their choice
        System.out.println("Enter a number (1-5) to choose rock, paper, scissors, lizard, or spock:");
        userChoice = sc.nextInt();
        //  user's input need to be computed and made to be correct (in reference to other calculations).
        while (userChoice < 1 || userChoice > NUM_OPTIONS) {
            System.out.println("Invalid choice. Please enter a number between 1 and 5:");
            userChoice = sc.nextInt();
        }
        // Against each other show the users and the computers options
        System.out.println("Computer chose " + options[computerChoice - 1] + ".");
        System.out.println("You chose " + options[userChoice - 1] + ".");
        //In the end compute the result of the calculation
/*Do if statements that comply with each other and else if statements to calculated results for human
and computer depending on the humans input
 */
        //At end create a print statement to print results and prompt user to enter and interact with the program
        if (computerChoice == userChoice) {
            System.out.println("It's a tie.");
        } else if (computerChoice == 1 && (userChoice == 3 || userChoice == 4)) {
            System.out.println("Computer wins. Rock beats Scissors and Lizard.");
        } else if (computerChoice == 2 && (userChoice == 1 || userChoice == 5)) {
            System.out.println("Computer wins. Paper beats Rock and Spock.");
        } else if (computerChoice == 3 && (userChoice == 2 || userChoice == 4)) {
            System.out.println("Computer wins. Scissors beats Paper and Lizard.");
        } else if (computerChoice == 4 && (userChoice == 2 || userChoice == 5)) {
            System.out.println("Computer wins. Lizard beats Paper and Spock.");
        } else if (computerChoice == 5 && (userChoice == 1 || userChoice == 3)) {
            System.out.println("Computer wins. Spock beats Rock and Scissors.");
        } else {
            System.out.println("You win.");
        }
    }
}