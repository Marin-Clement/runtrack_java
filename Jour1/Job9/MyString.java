package Jour1.Job9;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        // declare a String variable
        String myString = "Hello World";

        // declare a String variable using the String constructor
        String myString2 = new String("Hello World");

        // declare a String variable using a char array
        char[] caracteres = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String myString3 = new String(caracteres);

        // declare a String variable using the concatenation operator
        String myString4 = "Hello" + " " + "World";

        // declare a String variable using the toString() method
        String myString5 = Integer.toString(42);

        // declare a String variable using the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String myString6 = sc.nextLine();
    }
}
