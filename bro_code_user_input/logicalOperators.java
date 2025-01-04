package bro_code_user_input;

import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // && = AND
        // || = OR
        // ! = NOT

        double temp = -10;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good today!");
            System.out.println("It is sunny outside!");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good today!");
            System.out.println("It is cloudy outside!");
        }
        else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad today!");
        }

        // username must be between 4 and 12 characters
        // username must not contain spaces or underscores

        String username;
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Error! Username must be between 4 and 12 characters!");
        } 
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Error! Username must not contain spaces or underscores!");

        }
        else {
            System.out.printf("Welcome, " + username + "!");
        }


        scanner.close();

    }


    
}
