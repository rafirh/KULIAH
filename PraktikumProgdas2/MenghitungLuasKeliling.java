package PraktikumProgdas2;

import java.util.Scanner;

public class MenghitungLuasKeliling {
  public static void main(String[] args) {
    // Menampilkan judul dan menu pilihan bangun datar
    System.out.println("== PROGRAM MENGHITUNG LUAS DAN KELILING BANGUN ==\n");
    System.out.println("+----------------------+");
    System.out.println("| PILIHAN BANGUN DATAR |");
    System.out.println("+----------------------+");
    System.out.println("| 1. Persegi           |");
    System.out.println("| 2. Lingkaran         |");
    System.out.println("| 3. Segitiga          |");
    System.out.println("+----------------------+");

    // Instansiasi objek Scanner untuk membaca input dari user
    Scanner input = new Scanner(System.in);

    // Membaca pilihan bangun datar dari user
    System.out.print("Masukkan pilihan bangun (1-3): ");
    int pilihan = input.nextInt();

    // Proses perhitungan berdasarkan pilihan user
    switch (pilihan) {
      case 1:
        // Jika user memilih persegi
        System.out.print("Masukkan sisi persegi: ");
        double sisi = input.nextDouble();

        // Menghitung luas dan keliling persegi
        double luasPersegi = sisi * sisi;
        double kelilingPersegi = 4 * sisi;

        // Menampilkan hasil luas dan keliling persegi
        System.out.printf("\nLuas Persegi: %.2f%n", luasPersegi);
        System.out.printf("Keliling Persegi: %.2f%n", kelilingPersegi);

        break;
      case 2:
        // Jika user memilih lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Menghitung luas dan keliling lingkaran
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        // Menampilkan hasil luas dan keliling lingkaran
        System.out.printf("\nLuas Lingkaran: %.2f%n", luasLingkaran);
        System.out.printf("Keliling Lingkaran: %.2f%n", kelilingLingkaran);

        break;
      case 3:
        // Jika user memilih segitiga
        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan sisi miring segitiga: ");
        double sisiMiring = input.nextDouble();

        // Menghitung luas dan keliling segitiga
        double luasSegitiga = 0.5 * alas * tinggi;
        double kelilingSegitiga = alas + tinggi + sisiMiring;

        // Menampilkan hasil luas dan keliling segitiga
        System.out.printf("\nLuas Segitiga: %.2f%n", luasSegitiga);
        System.out.printf("Keliling Segitiga: %.2f%n", kelilingSegitiga);

        break;
      default:
        // Jika pilihan tidak valid
        System.out.println("Pilihan tidak valid. Silakan pilih antara 1-3.");
    }

    // Menutup objek Scanner
    input.close();
  }
}
