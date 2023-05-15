package Jour2.Job7;

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int x = Integer.parseInt(System.console().readLine());
        int y = 1;
        for (int i = 1; i <= x; i++)
        {
            y *= i;
        }
        System.out.println("Factorial of " + x + " is " + y);
    }
}
