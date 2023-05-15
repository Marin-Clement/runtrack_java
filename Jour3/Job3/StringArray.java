package Jour3.Job3;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] tableau = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(tableau[1]);
        System.out.println(Arrays.toString(tableau));
        tableau[2] = "Mireille";
        System.out.println(Arrays.toString(tableau));
    }
}
