package bro_code_user_input;

import java.util.Scanner;

public class compoundInterestCalculator {
    public static void main(String[] args) {

        // Compound Interest Calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        System.out.printf("The amount after %d years is: $%.2f", years, amount);

        

        scanner.close();
    }
    
}