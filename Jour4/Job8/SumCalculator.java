package Jour4.Job8;

import java.util.ArrayList;
import java.util.List;

public class SumCalculator {

    private static final int MAX_NUMBER = 100000000;
    private static final int THREAD_COUNT = 100;

    public static void main(String[] args) throws InterruptedException {

        int sum = 0;
        List<SumThread> threads = new ArrayList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < THREAD_COUNT; i++) {
            SumThread thread = new SumThread(i * (MAX_NUMBER / THREAD_COUNT) + 1, (i + 1) * (MAX_NUMBER / THREAD_COUNT));
            threads.add(thread);
            thread.start();
        }


        for (SumThread thread : threads) {
            thread.join();
            sum += thread.getSum();
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("The sum is: " + sum);
        System.out.println("Execution time: " + duration + " milliseconds");
    }

    private static class SumThread extends Thread {

        private int start;
        private int end;
        private int sum;

        public SumThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        }

        public int getSum() {
            return sum;
        }
    }
}
