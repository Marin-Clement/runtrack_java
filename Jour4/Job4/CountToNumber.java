package Jour4.Job4;

import java.util.Scanner;

public class CountToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        long startTime = System.nanoTime();
        scanner.close();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            count++;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("The program took " + duration + " milliseconds to run");
        System.out.println("Count: " + count);
    }
}
