package Jour2.Job3;

public class MultiplicationTable {
    public static void main(String[] args)
    {
        System.out.println("Entrez un nombre : ");
        int number = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
