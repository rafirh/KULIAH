package PraktikumProgdas2;

import java.util.Scanner;

public class MenghitungUpahKerja {
  public static void main(String[] args) {
    // Menampilkan judul program
    System.out.println("== PROGRAM MENGHITUNG UPAH KERJA ==\n");

    // Instansiasi objek Scanner untuk membaca input dari user
    Scanner input = new Scanner(System.in);

    // Membaca jumlah jam kerja dari user
    System.out.print("Masukkan jumlah jam kerja dalam seminggu: ");
    int jamKerja = input.nextInt();
    // Inisialisasi variabel upah, lembur, denda, dan batasan
    int upahPerJam = 5000;
    int upahPerJamLembur = 6000;
    int batasKerjaMaksimal = 60;
    int batasKerjaMinimal = 50;
    int dendaPerJam = 1000;
    int upah = 0, lembur = 0, denda = 0;

    // Proses perhitungan upah, lembur, dan denda
    if (jamKerja > batasKerjaMaksimal) {
      // Jika jam kerja melebihi batas maksimal, hitung lembur
      int jamLembur = jamKerja - batasKerjaMaksimal;
      lembur = jamLembur * upahPerJamLembur;
      upah = batasKerjaMaksimal * upahPerJam;
    } else if (jamKerja < batasKerjaMinimal) {
      // Jika jam kerja kurang dari batas minimal, hitung denda
      int jamKurang = batasKerjaMinimal - jamKerja;
      denda = jamKurang * dendaPerJam;
      upah = jamKerja * upahPerJam;
    } else {
      // Jika jam kerja normal
      upah = jamKerja * upahPerJam;
    }

    // Menghitung total upah yang diterima
    int totalUpah = upah + lembur - denda;

    // Menampilkan rincian hasil perhitungan upah kerja
    System.out.printf("\n+------------------------------------+");
    System.out.printf("\n|        RINCIAN PERHITUNGAN         |");
    System.out.printf("\n+------------------------------------+");
    System.out.printf("\n| %-16s | %-15s |", "Keterangan", "Jumlah (Rp)");
    System.out.printf("\n+------------------+-----------------+");
    System.out.printf("\n| %-16s | Rp %,-12d |", "Upah Kerja", upah);
    System.out.printf("\n| %-16s | Rp %,-12d |", "Upah Lembur", lembur);
    System.out.printf("\n| %-16s | Rp %,-12d |", "Denda", denda);
    System.out.printf("\n+------------------+-----------------+");
    System.out.printf("\n| %-16s | Rp %,-12d |", "Total Upah", totalUpah);
    System.out.printf("\n+------------------+-----------------+\n");

    // Menutup objek Scanner
    input.close();
  }
}
