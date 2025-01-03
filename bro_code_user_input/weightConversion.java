package bro_code_user_input;

import java.util.Scanner;

public class weightConversion {
    public static void main(String[] args) {
        
        // WEIGHT CONVERSION PROGRAM

        // Declare variables
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // welcome message
        System.out.println("Welcome to the weight conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // prompt for user choice
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt(); 

        // option 1 convert lbs to kgs
        // option 2 convert kgs to lbs
        // else print not a valid choice

        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in kgs: %.2f kg", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Weight in lbs: %.2f lbs", newWeight);
        } else {
            System.out.println("That was not a valid choice");
        }

        scanner.close();
    }
}
