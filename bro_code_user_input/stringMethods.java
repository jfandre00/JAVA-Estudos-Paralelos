package bro_code_user_input;

public class stringMethods {
    public static void main(String[] args) {
        
        String name = "Andre Loureiro Montini Ferreira";

        int lenght = name.length();
        char letter = name.charAt(0); //returns the character at the specified index
        int index = name.indexOf("e"); //returns the index of the first occurrence of the specified character
        int lastIndex = name.lastIndexOf("e"); //returns the index of the last occurrence of the specified character

        name = name.toUpperCase(); //returns the string in uppercase
        String nameLowerCase = name.toLowerCase(); //returns the string in lowercase

        String nameTest = "   Andre Loureiro Montini Ferreira   ";
        nameTest = nameTest.trim(); //removes leading and trailing whitespaces

        String fruit = "banana";
        fruit = fruit.replace("a", "o"); //replaces all occurrences of the specified character

        name.isEmpty(); //returns true if the string is empty

        System.out.println("The name has " + lenght + " characters");
        System.out.println("The first letter of the name is " + letter);
        System.out.println("The first occurrence of the letter 'e' is at index " + index);
        System.out.println("The last occurrence of the letter 'e' is at index " + lastIndex);
        System.out.println("The name in uppercase is " + name);
        System.out.println("The name in lowercase is " + nameLowerCase);
        System.out.println("The name without leading and trailing whitespaces is " + nameTest);
        System.out.println("The fruit with all 'a' replaced by 'o' is " + fruit);
        System.out.println("The name is empty: " + name.isEmpty());

        if(name.isEmpty()) {
            System.out.println("The name is empty");
        } else {
            System.out.println("The name is not empty");
        }

        if(name.contains(" ")) {
            System.out.println("The name contains a space");
        } else {
            System.out.println("The name does not contain a space");
        }

        String name3 = "password";

        if(name3.equals("password")) { 
            System.out.println("The name is 'password'");
        } else {
            System.out.println("The name is not 'password'");
        }

        if(name3.equalsIgnoreCase("PASSWORD")) { 
            System.out.println("The name is 'password'");
        } else {
            System.out.println("The name is not 'password'");
        }



    }
    
}
