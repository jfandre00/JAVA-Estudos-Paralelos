package bro_code_user_input;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    System.out.println("Error! Division by zero!");
                    validOperator = false;
                }
                else {
                result = num1 / num2;}
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Error! Invalid operator!");
                validOperator = false;
            }
        }

        if(validOperator) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        scanner.close();

    }
    
}