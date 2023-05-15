package Jour4.Job3;

import Jour4.Job2.RandomStringGenerator;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGeneratorThread {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the random string to generate : ");
        int length = scanner.nextInt();

        long startTime = System.nanoTime();

        // Create two threads
        int halfLength = length / 2;
        Thread generatorThread1 = new Thread(() -> {
            String randomString1 = generateRandomString(halfLength);
            synchronized (RandomStringGenerator.class) {
                try {
                    FileWriter writer = new FileWriter("output.txt", false);
                    writer.write(randomString1);
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the file");
                    e.printStackTrace();
                }
            }
        });

        Thread generatorThread2 = new Thread(() -> {
            String randomString2 = generateRandomString(length - halfLength);
            synchronized (RandomStringGenerator.class) {
                try {
                    FileWriter writer = new FileWriter("output.txt", true);
                    writer.write(randomString2);
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the file");
                    e.printStackTrace();
                }
            }
        });

        // Start the threads
        generatorThread1.start();
        generatorThread2.start();

        // Wait for both threads to complete
        generatorThread1.join();
        generatorThread2.join();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // conversion en millisecondes

        System.out.println("The program took " + duration + " milliseconds to run");

        scanner.close();
    }

    private static String generateRandomString(int length) {
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}

// Compare to the not threaded version this one is much faster for large strings