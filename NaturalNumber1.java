import java.util.Scanner;

public class NaturalNumber1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.println("Natural numbers from 1 to " + n + ":");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
}
}
}