import java.util.Scanner;
//Marko Pavic
//Lab2
//1/31/23
public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int count = 0;
/// Request integer input from the user.
        System.out.println("Enter the desired integers you wish to calculate. " +
                "The program will stop and show the calculated numbers and their conditions once you enter 0: ");
        // Add a Positive addition if a postive integer is entered and count it
        // Otherwise if negative interger entered increment a negative number and count it
        do {
            number = input.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
            total += number;
            count++;
        } while (number != 0);
//Calculate the total and average of numbers entered
        double average = (double) total / (count - 1);
//Print Statements
        System.out.println("The number of positives is " + positiveCount);
        System.out.println("The number of negatives is " + negativeCount);
        System.out.println("The total is " + (total - number));
        System.out.println("The average is " + average);
    }
}