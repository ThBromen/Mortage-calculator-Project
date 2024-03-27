import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mortgage Calculator!");
        System.out.println("-----------------------------------");
        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter loan term (in years): ");
        int loanTermYears = scanner.nextInt();
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanTermYears * 12;
        double mortgagePayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        System.out.println("-----------------------------------");
        System.out.printf("Your monthly mortgage payment is: $%.2f%n", mortgagePayment);

        scanner.close();
    }
}
