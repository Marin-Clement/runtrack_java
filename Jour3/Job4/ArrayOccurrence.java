package Jour3.Job4;


public class ArrayOccurrence {
    public static void main(String[] args) {
        int[] array = {3,7,3,9,8};
        int[] occurrence = new int[10];
        for (int j : array) {
            occurrence[j]++;
        }
        for (int i = 0; i < occurrence.length; i++)
        {
            if (occurrence[i] > 0)
            {
                System.out.println(i + " est présent " + occurrence[i] + " fois");
            }
        }
    }
}
