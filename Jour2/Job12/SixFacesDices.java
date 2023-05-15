package Jour2.Job12;

public class SixFacesDices {
    public static void main(String[] args) {

        int[] faces = {1, 2, 3, 4, 5, 6};
        int count = 0;

        for (int face : faces) {
            for (int i : faces) {
                for (int j : faces) {
                    System.out.println(face + " " + i + " " + j);
                    count++;
                }
            }
        }
        System.out.println("Le nombre total de combinaisons est : " + count);
    }
}
