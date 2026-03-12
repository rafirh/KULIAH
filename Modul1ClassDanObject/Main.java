package Modul1ClassDanObject;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Penulis p1 = new Penulis(1, "Budi");
    Penulis p2 = new Penulis(2, "Andi");
    Penulis p3 = new Penulis(3, "Siti");
    Penulis p4 = new Penulis(4, "Dewi");
    Penulis p5 = new Penulis(5, "Rudi");

    ArrayList<Buku> daftarBuku = new ArrayList<>();

    // =====================
    // KATEGORI TEKNOLOGI
    // =====================
    Buku t1 = new Buku(1, "Pemrograman Java", "Teknologi");
    t1.tambahPenulis(p1);

    Buku t2 = new Buku(2, "Dasar Database", "Teknologi");
    t2.tambahPenulis(p2);

    Buku t3 = new Buku(3, "Machine Learning", "Teknologi");
    t3.tambahPenulis(p3);

    Buku t4 = new Buku(4, "Artificial Intelligence", "Teknologi");
    t4.tambahPenulis(p4);

    Buku t5 = new Buku(5, "Cloud Computing", "Teknologi");
    t5.tambahPenulis(p5);

    // =====================
    // KATEGORI FILSAFAT
    // =====================
    Buku f1 = new Buku(6, "Filsafat Barat", "Filsafat");
    f1.tambahPenulis(p1);

    Buku f2 = new Buku(7, "Etika Filsafat", "Filsafat");
    f2.tambahPenulis(p2);

    Buku f3 = new Buku(8, "Logika", "Filsafat");
    f3.tambahPenulis(p3);

    Buku f4 = new Buku(9, "Metafisika", "Filsafat");
    f4.tambahPenulis(p4);

    Buku f5 = new Buku(10, "Filsafat Timur", "Filsafat");
    f5.tambahPenulis(p5);

    // =====================
    // KATEGORI SEJARAH
    // =====================
    Buku s1 = new Buku(11, "Sejarah Dunia", "Sejarah");
    s1.tambahPenulis(p1);

    Buku s2 = new Buku(12, "Sejarah Indonesia", "Sejarah");
    s2.tambahPenulis(p2);

    Buku s3 = new Buku(13, "Perang Dunia", "Sejarah");
    s3.tambahPenulis(p3);

    Buku s4 = new Buku(14, "Sejarah Asia", "Sejarah");
    s4.tambahPenulis(p4);

    Buku s5 = new Buku(15, "Sejarah Eropa", "Sejarah");
    s5.tambahPenulis(p5);

    // =====================
    // KATEGORI AGAMA
    // =====================
    Buku a1 = new Buku(16, "Ilmu Tafsir", "Agama");
    a1.tambahPenulis(p1);

    Buku a2 = new Buku(17, "Hadits Pilihan", "Agama");
    a2.tambahPenulis(p2);

    Buku a3 = new Buku(18, "Fiqih Dasar", "Agama");
    a3.tambahPenulis(p3);

    Buku a4 = new Buku(19, "Aqidah", "Agama");
    a4.tambahPenulis(p4);

    Buku a5 = new Buku(20, "Sejarah Islam", "Agama");
    a5.tambahPenulis(p5);

    // =====================
    // KATEGORI PSIKOLOGI
    // =====================
    Buku psk1 = new Buku(21, "Psikologi Umum", "Psikologi");
    psk1.tambahPenulis(p1);

    Buku psk2 = new Buku(22, "Psikologi Sosial", "Psikologi");
    psk2.tambahPenulis(p2);

    Buku psk3 = new Buku(23, "Psikologi Anak", "Psikologi");
    psk3.tambahPenulis(p3);

    Buku psk4 = new Buku(24, "Psikologi Pendidikan", "Psikologi");
    psk4.tambahPenulis(p4);

    Buku psk5 = new Buku(25, "Psikologi Kepribadian", "Psikologi");
    psk5.tambahPenulis(p5);

    // =====================
    // KATEGORI POLITIK
    // =====================
    Buku pol1 = new Buku(26, "Ilmu Politik", "Politik");
    pol1.tambahPenulis(p1);

    Buku pol2 = new Buku(27, "Sistem Pemerintahan", "Politik");
    pol2.tambahPenulis(p2);

    Buku pol3 = new Buku(28, "Demokrasi", "Politik");
    pol3.tambahPenulis(p3);

    Buku pol4 = new Buku(29, "Geopolitik", "Politik");
    pol4.tambahPenulis(p4);

    Buku pol5 = new Buku(30, "Politik Global", "Politik");
    pol5.tambahPenulis(p5);

    // =====================
    // KATEGORI FIKSI
    // =====================
    Buku fk1 = new Buku(31, "Petualangan Ajaib", "Fiksi");
    fk1.tambahPenulis(p1);

    Buku fk2 = new Buku(32, "Dunia Fantasi", "Fiksi");
    fk2.tambahPenulis(p2);

    Buku fk3 = new Buku(33, "Cerita Misteri", "Fiksi");
    fk3.tambahPenulis(p3);

    Buku fk4 = new Buku(34, "Legenda Nusantara", "Fiksi");
    fk4.tambahPenulis(p4);

    Buku fk5 = new Buku(35, "Kisah Masa Depan", "Fiksi");
    fk5.tambahPenulis(p5);

    // Menambahkan semua buku ke list
    Buku[] semuaBuku = { t1, t2, t3, t4, t5, f1, f2, f3, f4, f5, s1, s2, s3, s4, s5,
        a1, a2, a3, a4, a5, psk1, psk2, psk3, psk4, psk5,
        pol1, pol2, pol3, pol4, pol5, fk1, fk2, fk3, fk4, fk5 };

    for (Buku b : semuaBuku) {
      b.tampilkanInfo();
    }

  }
}

// =========================
// CLASS BUKU
// =========================
class Buku {

  int idBuku;
  String judul;
  String kategori;
  ArrayList<Penulis> daftarPenulis = new ArrayList<>();

  Buku(int idBuku, String judul, String kategori) {
    this.idBuku = idBuku;
    this.judul = judul;
    this.kategori = kategori;
  }

  void tambahPenulis(Penulis p) {
    daftarPenulis.add(p);
  }

  void tampilkanInfo() {
    System.out.println("ID Buku : " + idBuku);
    System.out.println("Judul   : " + judul);
    System.out.println("Kategori: " + kategori);
    System.out.print("Penulis : ");

    for (Penulis p : daftarPenulis) {
      System.out.print(p.nama + " ");
    }

    System.out.println("\n--------------------------");
  }
}

// =========================
// CLASS PENULIS
// =========================
class Penulis {

  int id;
  String nama;

  Penulis(int id, String nama) {
    this.id = id;
    this.nama = nama;
  }

}
