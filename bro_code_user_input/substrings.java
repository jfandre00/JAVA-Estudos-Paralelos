package bro_code_user_input;

import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {
        
        String email = "jfandre@uol.com.br";
        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1);
        String aleaString = email.substring(0, 9); 

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
        System.out.println("AleaString: " + aleaString);

        String email2;
        String username2;
        String domain2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        email2 = scanner.nextLine();

        if(email2.contains("@")) {
            username2 = email2.substring(0, email2.indexOf('@'));
            domain2 = email2.substring(email2.indexOf('@') + 1);

            System.out.println("Username: " + username2);
            System.out.println("Domain: " + domain2);
            
        } else {
            System.out.println("Invalid email! Email must contain '@' character.");
        }
        
        scanner.close();
    }
}
