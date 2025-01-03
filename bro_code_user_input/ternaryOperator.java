package bro_code_user_input;

public class ternaryOperator {
    public static void main(String[] args) {
        
        // ternary operator ? = Return 1 ou 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        /* 
        if(score >= 60) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed");
        }
            */

        String passOrFail = (score >= 60) ? "You passed" : "You failed";
        System.out.println(passOrFail);

        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;

        String timeofDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeofDay);


        int income = 600000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println("Tax rate: " + taxRate);

    }
    
}
