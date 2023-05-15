package Jour2.Job8;

public class LengthOfNumber {
    public static void main(String[] args) {
        System.out.println("Entre un nombre :");
        int number = Integer.parseInt(System.console().readLine());
        int length = 0;
        while (number > 0)
        {
            number /= 10;
            length++;
        }
        System.out.println("La longueur du nombre est " + length);
    }
}
