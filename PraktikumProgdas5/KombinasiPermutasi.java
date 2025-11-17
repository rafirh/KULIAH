// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package PraktikumProgdas5;

import java.util.Scanner;

public class KombinasiPermutasi {
    public static long faktorial(int x) {
        long hasil = 1;
        for (int i = 1; i <= x; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static long permutasi(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }

    public static long kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(n - r) * faktorial(r));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        while (true) {
            System.out.println("\nProgram Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = input.nextInt();
            
            if (pilihan == 3) {
                break;
            }
            
            System.out.print("Masukkan nilai n : ");
            int n = input.nextInt();
            System.out.print("Masukkan nilai r : ");
            int r = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    long hasilP = permutasi(n, r);
                    System.out.println("         n");
                    System.out.println("nPr = ------- = " + hasilP);
                    System.out.println("       (n-r)!");
                    System.out.println("Maka Hasil Permutasinya adalah : " + hasilP);
                    break;
                case 2:
                    long hasilC = kombinasi(n, r);
                    System.out.println("           n");
                    System.out.println("nCr = ----------- = " + hasilC);
                    System.out.println("      (n-r)! x r!");
                    System.out.println("Maka Hasil Kombinasinya adalah : " + hasilC);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }
        
        System.out.println("Program selesai...");
    }
}
