package Jour3.Job5;

public class UniqueValueArray {
    public static void main(String[] args) {
        int[] array = {3,3,3,4,2};
        int[] unique = new int[array.length];
        int index = 0;
        for (int j : array) {
            boolean found = false;
            for (int k : unique) {
                if (j == k) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Unique value found: " + j);
                unique[index] = j;
                index++;
            }
        }
    }
}
