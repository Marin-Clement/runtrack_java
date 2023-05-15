package Jour4.Job7;

import java.util.Scanner;

public class ArraySumThread {
        public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        scanner.close();

        int[] arr = new int[size];
        // Populate the array with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        int mid = size / 2;

        SumThread thread1 = new SumThread(arr, 0, mid);
        SumThread thread2 = new SumThread(arr, mid, size);

        long startTime = System.nanoTime();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int totalSum = thread1.getSum() + thread2.getSum();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("The program took " + duration + " milliseconds to run");
        System.out.println("Total Sum: " + totalSum);
    }

    private static class SumThread extends Thread {
        private int[] arr;
        private int start;
        private int end;
        private int sum;

        public SumThread(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }
        }

        public int getSum() {
            return sum;
        }
    }
}
