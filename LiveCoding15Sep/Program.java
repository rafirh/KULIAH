package LiveCoding15Sep;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    // Instansiasi objek Scanner untuk membaca input dari user
    Scanner input = new Scanner(System.in);

    // Membaca bilangan bulat N dari user
    int N = input.nextInt();

    // String untuk menyimpan hasil output
    String hasil = "";

    // Mengecek kelipatan 2 dan menambahkan "Bum" jika benar
    if (N % 2 == 0) {
      hasil += "Bum";
    }

    // Mengecek kelipatan 3 dan menambahkan "Cak" jika benar
    if (N % 3 == 0) {
      hasil += "Cak";
    }

    // Mengecek kelipatan 5 dan menambahkan "Ces" jika benar
    if (N % 5 == 0) {
      hasil += "Ces";
    }

    // Mengecek kelipatan 7 dan menambahkan "Pak" jika benar
    if (N % 7 == 0) {
      hasil += "Pak";
    }

    // Mengecek kelipatan 11 dan menambahkan "Dum" jika benar
    if (N % 11 == 0) {
      hasil += "Dum";
    }

    // Jika tidak ada kelipatan yang sesuai (hasil masih kosong)
    // maka cetak angka itu sendiri
    if (hasil.isEmpty()) {
      System.out.println(N);
    } else {
      // Jika ada kelipatan yang sesuai, cetak hasil gabungan
      System.out.println(hasil);
    }

    // Menutup objek Scanner
    input.close();
  }
}
