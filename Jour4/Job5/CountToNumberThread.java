package Jour4.Job5;

import java.util.Scanner;

public class CountToNumberThread {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int maxNumber = scanner.nextInt();
        scanner.close();
        // Create two threads
        int halfNumber = maxNumber / 2;
        CounterThread counterThread1 = new CounterThread(1, halfNumber);
        CounterThread counterThread2 = new CounterThread(halfNumber + 1, maxNumber);
        // Start the threads
        counterThread1.start();
        counterThread2.start();

        long startTime = System.nanoTime();

        // Wait for both threads to complete
        counterThread1.join();
        counterThread2.join();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("The program took " + duration + " milliseconds to run");
        int count = counterThread1.getCount() + counterThread2.getCount();
        System.out.println("Count: " + count);

    }

    private static class CounterThread extends Thread {
        private int startNumber;
        private int endNumber;
        private int count;

        public CounterThread(int startNumber, int endNumber) {
            this.startNumber = startNumber;
            this.endNumber = endNumber;
        }

        @Override
        public void run() {
            for (int i = startNumber; i <= endNumber; i++) {
                count++;
            }
        }

        public int getCount() {
            return count;
        }
    }
}
