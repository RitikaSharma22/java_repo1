import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int firstDigit = 0;
        int lastDigit = number % 10;
        
        while (number != 0) {
            firstDigit = number;
            number /= 10;
        }
        
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
}
} 