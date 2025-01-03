package bro_code_user_input;

import java.util.Random;

public class random_numbers {
    public static void main(String[] args) {
        
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        double number;

        boolean isHeads;

        number1 = random.nextInt(6) + 1; // 0 to 5 + 1 = 1 to 6
        number2 = random.nextInt(6) + 1; 
        number3 = random.nextInt(6) + 1; 

        number = random.nextDouble(); // 0.0 to 1.0

        isHeads = random.nextBoolean();

        System.out.println("Random number: " + number1);
        System.out.println("Random number: " + number2);
        System.out.println("Random number: " + number3);

        System.out.println("Random number: " + number);

        if (isHeads) {
            System.out.println("Heads!");
        }
        else {
            System.out.println("Tails!");
        }
    }
    
}
