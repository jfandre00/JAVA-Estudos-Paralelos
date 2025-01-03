package bro_code_user_input;

public class arithmetic {
    public static void main(String[] args) {
        
        // Arithmetic Operators

        int x = 10;
        int y = 3;
        int z;
        int k;
        int w;
        int t;
        int resto;

        z = x + y;
        k = x - y;
        w = x * y;
        t = x / y;
        resto = x % y;
        
        System.out.println("x + y = " + z);
        System.out.println("x - y = " + k);
        System.out.println("x * y = " + w);
        System.out.println("x / y = " + t);
        System.out.println("x % y = " + resto);

        // Augmented Assignment Operators

        int a = 10;
        int b = 2;

        a += b; // a = a + b
        System.out.println("a += b: " + a);

        a -= b; // a = a - b
        System.out.println("a -= b: " + a);

        a *= b; // a = a * b
        System.out.println("a *= b: " + a);

        a /= b; // a = a / b
        System.out.println("a /= b: " + a);

        // Increment and Decrement Operators

        int c = 1;

        c++; // c = c + 1

        System.out.println("c++: " + c);


        // Order of Operations [P - E - M - D - A - S]
        // Parentheses - Exponents - Multiplication - Division - Addition - Subtraction

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println("3 + 4 * (7 - 5) / 2.0 = " + result);

    }
    
}
