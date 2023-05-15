package Jour2.Job9;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println("Entrez un nombre :");
        int number = Integer.parseInt(System.console().readLine());
        int firstDigit = number;
        int lastDigit = number % 10;
        while (firstDigit >= 10)
        {
            firstDigit /= 10;
        }
        System.out.println("Le premier chiffre de " + number + " est " + firstDigit);
        System.out.println("Le dernier chiffre de " + number + " est " + lastDigit);
    }
}
