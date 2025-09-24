package PraktikumProgdas2;

import java.util.Scanner;

public class KalkulatorBMI {
    public static void main(String[] args) {
        // Instansiasi objek Scanner dan disimpan ke variabel input
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan berat badan dalam kilogram
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        // Meminta user memasukkan tinggi badan dalam meter
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = input.nextDouble();

        // Menghitung nilai BMI dengan rumus berat/(tinggi*tinggi)
        double bmi = berat / (tinggi * tinggi);
        // Menampilkan hasil BMI dengan 2 angka di belakang koma
        System.out.printf("\nIndeks Massa Tubuh (BMI): %.2f%n", bmi);

        // Menentukan kategori BMI berdasarkan nilai yang didapat
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Kegemukan");
        }

        // Menutup objek Scanner
        input.close();
    }
}
