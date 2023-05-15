package Jour1.Job14;

public class Somme {
    public static void main(String[] args) {
        int num1,num2;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        int result = num1 + num2;
        System.out.println("La somme de " + num1 + " et " + num2 + " est " + result);
    }
}
