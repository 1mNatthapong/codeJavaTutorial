
import java.util.Scanner;

public class Ex5_4 {

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = checkEvenOrOdd(number);

        System.out.println("The number is: " + result);

        scanner.close();
    }
}
