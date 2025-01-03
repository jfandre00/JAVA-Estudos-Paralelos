package bro_code_user_input;

import java.util.Scanner;


public class mathClass {
    public static void main(String[] args) {
        
        System.out.println(Math.PI); 
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 3); // 2^3 = 8
        System.out.println(result);

        result = Math.abs(-5);
        System.out.println(result);

        result = Math.sqrt(16);
        System.out.println(result);

        result = Math.round(3.14); // arredonda para o inteiro mais próximo
        System.out.println(result);

        result = Math.ceil(3.14); // arredonda para cima
        System.out.println(result);

        result = Math.floor(3.14); // arredonda para baixo
        System.out.println(result);

        result = Math.max(10, 20);
        System.out.println(result);

        result = Math.min(10, 20);
        System.out.println(result);

        // Hypotenuse of a right triangle c = sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);
            double a;
            double b;
            double c;

            System.out.print("Enter the length side A: ");
            a = scanner.nextDouble();

            System.out.print("Enter the length side B: ");
            b = scanner.nextDouble();

            c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

            System.out.println("The length of the hypotenuse (side C) is: " + c + "cm");

            // circumference = 2 * PI * r
            // area = PI * r^2
            // volume = 4/3 * PI * r^3

            double radius;
            double circumference;
            double area;
            double volume;
            
            System.out.print("Enter the radius: ");
            radius = scanner.nextDouble();

            // Atenção ao arredondamento
            // %.1f -> 1 casa decimal e usa o printf
            // %.2f -> 2 casas decimais
            // \n foi usado para pular uma linha
            // após o comando de arredondamento usa-se a vírgula e a variável que queremos arredondar
            circumference = 2 * Math.PI * radius;
            System.out.printf("The circumference is: %.1fcm\n", circumference);

            area = Math.PI * Math.pow(radius, 2);
            System.out.printf("The area is: %.1fcm²\n", area);

            volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
            System.out.printf("The volume is: %.1fcm³", volume);

        scanner.close();

    }
    
}
