package bro_code_user_input;

import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {
        
        // Enhanced switch = A replacement to many else if statements

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        
        String day = scanner.nextLine();

        /*
        switch(day) {
            case "Monday" -> System.out.println("It is a weekday.");
            case "Tuesday" -> System.out.println("It is a weekday.");
            case "Wednesday" -> System.out.println("It is a weekday.");
            case "Thursday" -> System.out.println("It is a weekday.");
            case "Friday" -> System.out.println("It is a weekday.");
            case "Saturday" -> System.out.println("It is a weekend.");
            case "Sunday" -> System.out.println("It is a weekend.");
            default -> System.out.println("Invalid day.");
        }
        */
            
        // consolidating the cases that have the same output

        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday.");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend.");
            default -> System.out.println("Invalid day.");
        }

        scanner.close();
    }

   

}
