package java_bro_code;

public class Main {
    public static void main(String[] args) {

        System.out.println("\tI love pizza!");
        System.out.println("It's really good!");


        // This is a comment

        /*
         * This
         * is
         * a
         * comment
        */

        int age = 44;
        int year = 2025;
        int quantity = 1;

        System.out.println("I am " + age + " years old.");
        System.out.println("It's the year " + year + ".");
        System.out.println("I have " + quantity + " pizza.");

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("The price of the pizza is $" + price + ".");
        
        //char are single characters
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("My grade is " + grade + symbol + "and I have " + currency + "20.00.");

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);

        if(isStudent == true) {
            System.out.println("I am a student.");
        } else {
            System.out.println("I am not a student.");
        }

        String name = "André Ferreira";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("My name is " + name + " and I love " + food + ".");
        System.out.println("My email is " + email + ".");
        System.out.println("I wish I could drive a " + color + " " + car + ".");

        
         

    }
    
}
