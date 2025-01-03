package bro_code_user_input;

public class nestedIfStatements {
    public static void main(String[] args) {
        
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent) {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7; // 30% discount
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9; // 10% discount    
            }
        } else {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8; // 20% discount
            }
            else { // it is not necessary to have an else statement here
                System.out.println("You don't get any discount");
                price *= 1; // not a student or senior
            }
        }

        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}

