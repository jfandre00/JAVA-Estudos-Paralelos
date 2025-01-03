package bro_code_user_input;

public class printf {
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s", name); // %s = string
        System.out.printf("\nHello %c", firstLetter); // %c = char
        System.out.printf("\nYou are %d years old", age); // %d = integer
        System.out.printf("\nYou are %.2f cm tall", height); // %f = floating point number
        System.out.printf("\nAre you employed: %b", isEmployed); // %b = boolean

        System.out.printf("\n%s is %d years old\n", name, age); // multiple formatting

        // Precision

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);

        // flags

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative or a space if positive

        price1 = 90050.99;

        System.out.printf("%+.2f\n", price1); // +9.99
        System.out.printf("%,.2f\n", price1); // 90,050.99
        System.out.printf("%(.2f\n", price3); // (54.01)
        System.out.printf("% .2f\n", price1); // 90050.99 (good for lining up positive and negative values)

        // width

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); // 0001
        System.out.printf("%04d\n", id2); // 0023
        System.out.printf("%04d\n", id3); // 0456
        System.out.printf("%04d\n", id4); // 7890

        System.out.printf("%4d\n", id1); //    1
        System.out.printf("%4d\n", id2); //   23
        System.out.printf("%4d\n", id3); //  456
        System.out.printf("%4d\n", id4); // 7890

        System.out.printf("%-4d\n", id1); // 1
        System.out.printf("%-4d\n", id2); // 23
        System.out.printf("%-4d\n", id3); // 456
        System.out.printf("%-4d\n", id4); // 7890
        



        
    }
}
