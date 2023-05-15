package Jour1.Job13;

public class NumberTo {
    public static void main(String[] args) {
        System.out.println("Saississez un nombre :");
        int number = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
