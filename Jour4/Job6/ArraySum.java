package Jour4.Job6;

import java.util.Scanner;

public class ArraySum {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Populate the array with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }


        int sum = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("The program took " + duration + " milliseconds to run");
        System.out.println("The sum of the elements in the array is: " + sum);

        scanner.close();
    }
}
