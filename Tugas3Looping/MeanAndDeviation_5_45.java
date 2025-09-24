// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

import java.util.Scanner;

public class MeanAndDeviation_5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int N = 10; // jumlah angka yang dimasukkan user

        double[] numbers = new double[N];
        double sum = 0;
        double sumSquares = 0;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < N; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];                // sum(x)
            sumSquares += Math.pow(numbers[i], 2); // sum(x^2)
        }

        double mean = sum / N;
        double deviation = Math.sqrt((sumSquares - (Math.pow(sum, 2) / N)) / (N - 1));

        System.out.printf("The mean is %.2f%n", mean);
        System.out.printf("The standard deviation is %.5f%n", deviation);

        input.close();
    }
}
