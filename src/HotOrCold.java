/*
Check if a given value is close to a desired value
 */
import java.util.Scanner;
public class HotOrCold {

    static Scanner sc = new Scanner(System.in);
    static final double exitCode = 0.0;
    // create a method where I will put my desired value
    public static double desiredValue() {
        return 77;
    }
    // method that determines if desired value is close to the guessed value provided by the user
    public static void determinant(double desiredValue) {
        System.out.println("Guess the random chosen value");
        double guessedValue = sc.nextDouble();

        while (guessedValue != exitCode) {

            if (guessedValue == desiredValue) {
                System.out.println("You got it!");
            } else if (guessedValue < desiredValue) {
                System.out.println("Cold.");
            } else
                System.out.println("TOO HOT!");
            guessedValue = sc.nextDouble();
        }
    }
    public static void main(String[] args) {
        determinant(desiredValue());
    }
}
