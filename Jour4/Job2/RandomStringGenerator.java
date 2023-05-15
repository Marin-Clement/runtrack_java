package Jour4.Job2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the random string to generate : ");
        int length = scanner.nextInt();

        long startTime = System.nanoTime();

        String randomString = generateRandomString(length);

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(randomString);
            writer.close();
            System.out.println("The random string has been written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

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
