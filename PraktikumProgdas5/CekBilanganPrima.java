// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package PraktikumProgdas5;

import java.util.Scanner;

public class CekBilanganPrima {
    public static boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();

        if (isPrima(angka)) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }

        System.out.println("\nBilangan prima dari 1 - 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
