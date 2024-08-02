
import java.util.Scanner;

public class Ex5_3 {


    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int max = findMax(number1, number2);

        System.out.println("The maximum value is: " + max);

        scanner.close();
    }
}
