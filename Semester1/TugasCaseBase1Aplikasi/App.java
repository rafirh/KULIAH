package TugasCaseBase1Aplikasi;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Daftar produk
    String[] produk = {
        "Nasi Goreng", "Mie Goreng", "Ayam Geprek",
        "Soto Ayam", "Es Teh", "Es Jeruk", "Air Mineral"
    };

    int[] harga = { 15000, 12000, 18000, 14000, 5000, 6000, 3000 };

    while (true) {
      System.out.println("\n+-----------------------------+");
      System.out.println("|           Menu              |");
      System.out.println("+----+----------------+-------+");
      System.out.printf("| %-2s | %-14s | %-5s |\n", "No", "Produk", "Harga");
      System.out.println("+----+----------------+-------+");

      for (int i = 0; i < produk.length; i++) {
        System.out.printf("| %-2d | %-14s | %-5d |\n", (i + 1), produk[i], harga[i]);
      }
      System.out.println("+----+----------------+-------+");
      System.out.println("|  0 | Keluar         |       |");
      System.out.println("+----+----------------+-------+");

      System.out.print("Pilih nomor produk (0 untuk keluar): ");
      int pilihan = sc.nextInt();

      if (pilihan == 0) {
        System.out.println("Terima kasih sudah berbelanja di Warung Makan!");
        break;
      }

      if (pilihan < 1 || pilihan > produk.length) {
        System.out.println("Pilihan tidak valid. Coba lagi.");
        continue;
      }

      System.out.print("Masukkan jumlah: ");
      int jumlah = sc.nextInt();

      int total = harga[pilihan - 1] * jumlah;
      System.out.println("\nAnda membeli: " + produk[pilihan - 1] + " x" + jumlah);
      System.out.println("Total harga: Rp " + total + "\n");

      System.out.print("Masukkan uang yang dibayar: Rp ");
      int bayar = sc.nextInt();

      if (bayar < total) {
        System.out.println("Uang tidak cukup. Transaksi dibatalkan.");
      } else {
        int kembalian = bayar - total;
        System.out.println("\nKembalian: Rp " + kembalian);
        System.out.println("Transaksi berhasil. Terima kasih!");
      }
    }

    sc.close();
  }
}
