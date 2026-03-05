// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package Tugas5Array;

import java.util.Scanner;

public class MarkovMatrix_8_25 {
    public static boolean isMarkovMatrix(double[][] m) {
        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] < 0) {
                    return false;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += m[i][j];
            }

            if (Math.abs(sum - 1.0) > 1e-6) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }

        input.close();
    }
}
