package Jour2.Job10;

public class SumOfDigitInNumber {
    public static void main(String[] args) {
        System.out.println("Entre un nombre :");
        int number = Integer.parseInt(System.console().readLine());
        int sum = 0;
        while (number > 0)
        {
            sum += number % 10; 
            number /= 10;
        }
        System.out.println("La somme des chiffres du nombre est " + sum);
    }
}
