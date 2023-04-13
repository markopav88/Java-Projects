import java.util.Scanner;
//Marko Pavic
public class CelsiusToFahrenheit {
    public static void main (String[] args) {
        System.out.print("Enter the degree in Celsius: ");
        /*System.out.print doesn't create a new line and is used to print output on the same line
        while System.out.println would print output on separate lines.*/
        Scanner in = new Scanner(System.in);
        //Scanner is used as input in Java
        //New creates a instance of the class
        double celsiusDegree = in.nextDouble();
        double fahrenheitDegree = (9.0 / 5.0) * celsiusDegree + 32;
        //conversion of C to F
System.out.print(celsiusDegree + " " + "Celsius is " + fahrenheitDegree + " " + "Fahrenheit" );

//python version below for reference
/*def main():
           # This prints a message without a newline ending
           print("Enter a degree in Celsius: ", end="")
            # We printed a prompt above, so we don't provide a message to input function
            celsius_degree = float(input()) # Gets the next input line as a float value
           fahrenheit_degree = (9.0 / 5.0) * celsius_degree + 32
           print(celsius_degree, " Celsius is ", fahrenheit_degree, " Fahrenheit")

      main()
         */

    }
}
