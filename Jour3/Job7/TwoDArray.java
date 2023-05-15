package Jour3.Job7;


import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrice1 = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        int[][] matrice2 = {{10,20,30},
                            {40,50,60},
                            {70,80,90}};

        System.out.println("Matrice 1:" + Arrays.deepToString(matrice1));

        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                matrice1[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        System.out.println("Matrice 1:" + Arrays.deepToString(matrice1));
    }
}
