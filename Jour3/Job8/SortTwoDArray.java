package Jour3.Job8;

import java.util.Arrays;

public class SortTwoDArray {
    public static void main(String[] args) {
        int[][] array = {{5,9,3},
                        {7,2,8},
                        {1,6,4}};
        System.out.println("Array: " + Arrays.deepToString(array));
        int[] temp = new int[array.length * array[0].length];
        int index = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                temp[index] = anInt;
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] > temp[j]) {
                    int swap = temp[i];
                    temp[i] = temp[j];
                    temp[j] = swap;
                }
            }
        }
        index = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                ints[j] = temp[index];
                index++;
            }
        }
        System.out.println("Sorted array: " + Arrays.deepToString(array));
    }
}
