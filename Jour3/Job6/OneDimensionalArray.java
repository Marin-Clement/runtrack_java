package Jour3.Job6;

import java.util.Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Array: " + Arrays.toString(array));
    }
}
