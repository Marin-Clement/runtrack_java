package Jour2.Job11;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Entrer un nombre:");
        int x = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= x; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
