package Modul2ConstructorDanInstance;

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
    Buku t1 = new Buku(1, "Pemrograman Java", "Teknologi",
        "Buku ini membahas konsep dasar pemrograman Java untuk pemula hingga mahir dalam bahasa pemrograman modern.");
    t1.tambahPenulis(p1);

    Buku t2 = new Buku(2, "Dasar Database", "Teknologi",
        "Panduan lengkap mengenai sistem database relasional dan manajemen data untuk aplikasi bisnis yang efisien.");
    t2.tambahPenulis(p2);

    Buku t3 = new Buku(3, "Machine Learning", "Teknologi",
        "Eksplorasi algoritma machine learning dan penerapannya dalam berbagai kasus nyata di industri teknologi terkini.");
    t3.tambahPenulis(p3);

    Buku t4 = new Buku(4, "Artificial Intelligence", "Teknologi",
        "Membahas perkembangan kecerdasan buatan dan implementasinya dalam solusi teknologi masa depan yang inovatif dan canggih.");
    t4.tambahPenulis(p4);

    Buku t5 = new Buku(5, "Cloud Computing", "Teknologi",
        "Penjelasan mendalam tentang teknologi cloud computing dan arsitektur sistem terdistribusi untuk infrastruktur modern yang scalable.");
    t5.tambahPenulis(p5);

    // =====================
    // KATEGORI FILSAFAT
    // =====================
    Buku f1 = new Buku(6, "Filsafat Barat", "Filsafat",
        "Kajian mendalam tentang pemikiran filsafat Barat dari era kuno hingga modern dengan analisis kritis yang komprehensif.");
    f1.tambahPenulis(p1);

    Buku f2 = new Buku(7, "Etika Filsafat", "Filsafat",
        "Pembahasan tentang prinsip-prinsip etika dan moral dalam kehidupan manusia berdasarkan berbagai perspektif filosofis yang beragam.");
    f2.tambahPenulis(p2);

    Buku f3 = new Buku(8, "Logika", "Filsafat",
        "Pengenalan logika formal dan informal sebagai dasar penalaran yang benar dalam berpikir kritis dan argumentasi ilmiah.");
    f3.tambahPenulis(p3);

    Buku f4 = new Buku(9, "Metafisika", "Filsafat",
        "Eksplorasi pertanyaan fundamental tentang realitas, eksistensi, dan hakikat alam semesta dari sudut pandang filosofis yang mendalam.");
    f4.tambahPenulis(p4);

    Buku f5 = new Buku(10, "Filsafat Timur", "Filsafat",
        "Penjelasan tentang tradisi pemikiran filsafat Timur termasuk pemikiran Buddha, Tao, dan Hindu dalam konteks budaya Asia.");
    f5.tambahPenulis(p5);

    // =====================
    // KATEGORI SEJARAH
    // =====================
    Buku s1 = new Buku(11, "Sejarah Dunia", "Sejarah",
        "Perjalanan peradaban manusia dari zaman kuno hingga modern dengan peristiwa penting yang membentuk dunia seperti sekarang ini.");
    s1.tambahPenulis(p1);

    Buku s2 = new Buku(12, "Sejarah Indonesia", "Sejarah",
        "Kronologi lengkap perjalanan bangsa Indonesia dari masa kerajaan, kolonialisme, hingga kemerdekaan dan perkembangan negara modern Indonesia.");
    s2.tambahPenulis(p2);

    Buku s3 = new Buku(13, "Perang Dunia", "Sejarah",
        "Analisis komprehensif tentang Perang Dunia I dan II beserta dampaknya terhadap politik global dan geopolitik dunia.");
    s3.tambahPenulis(p3);

    Buku s4 = new Buku(14, "Sejarah Asia", "Sejarah",
        "Pembahasan mendalam tentang sejarah peradaban Asia dari dinasti kuno hingga perkembangan negara-negara modern di kawasan Asia.");
    s4.tambahPenulis(p4);

    Buku s5 = new Buku(15, "Sejarah Eropa", "Sejarah",
        "Perjalanan sejarah benua Eropa mulai dari zaman Renaissance, revolusi industri, hingga pembentukan Uni Eropa yang modern.");
    s5.tambahPenulis(p5);

    // =====================
    // KATEGORI AGAMA
    // =====================
    Buku a1 = new Buku(16, "Ilmu Tafsir", "Agama",
        "Panduan memahami Al-Quran melalui ilmu tafsir dengan pendekatan metodologi yang komprehensif dan kontekstual dalam kehidupan modern.");
    a1.tambahPenulis(p1);

    Buku a2 = new Buku(17, "Hadits Pilihan", "Agama",
        "Kumpulan hadits shahih pilihan beserta penjelasan dan pemahamannya untuk pedoman kehidupan sehari-hari umat muslim yang baik.");
    a2.tambahPenulis(p2);

    Buku a3 = new Buku(18, "Fiqih Dasar", "Agama",
        "Penjelasan komprehensif tentang hukum Islam dan praktik ibadah sehari-hari sesuai dengan Al-Quran dan Sunnah Rasulullah.");
    a3.tambahPenulis(p3);

    Buku a4 = new Buku(19, "Aqidah", "Agama",
        "Pembahasan mendalam tentang landasan keimanan Islam dan prinsip-prinsip tauhid yang menjadi fondasi utama dalam beragama Islam.");
    a4.tambahPenulis(p4);

    Buku a5 = new Buku(20, "Sejarah Islam", "Agama",
        "Penelusuran perjalanan Islam dari masa Nabi Muhammad SAW hingga perkembangan peradaban Islam di berbagai belahan dunia saat ini.");
    a5.tambahPenulis(p5);

    // =====================
    // KATEGORI PSIKOLOGI
    // =====================
    Buku psk1 = new Buku(21, "Psikologi Umum", "Psikologi",
        "Pengantar komprehensif tentang dasar-dasar psikologi yang mencakup berbagai aspek perilaku manusia dan proses mental secara mendalam.");
    psk1.tambahPenulis(p1);

    Buku psk2 = new Buku(22, "Psikologi Sosial", "Psikologi",
        "Kajian tentang bagaimana individu berinteraksi dalam masyarakat dan pengaruh lingkungan sosial terhadap perilaku manusia sehari-hari.");
    psk2.tambahPenulis(p2);

    Buku psk3 = new Buku(23, "Psikologi Anak", "Psikologi",
        "Pembahasan tentang perkembangan psikologis anak dari bayi hingga remaja beserta faktor-faktor yang mempengaruhi pertumbuhan mental mereka.");
    psk3.tambahPenulis(p3);

    Buku psk4 = new Buku(24, "Psikologi Pendidikan", "Psikologi",
        "Eksplorasi proses belajar mengajar dan aplikasi prinsip psikologi dalam dunia pendidikan untuk meningkatkan efektivitas pembelajaran siswa.");
    psk4.tambahPenulis(p4);

    Buku psk5 = new Buku(25, "Psikologi Kepribadian", "Psikologi",
        "Analisis berbagai teori kepribadian dan faktor-faktor yang membentuk karakter unik setiap individu dalam kehidupan sosial mereka.");
    psk5.tambahPenulis(p5);

    // =====================
    // KATEGORI POLITIK
    // =====================
    Buku pol1 = new Buku(26, "Ilmu Politik", "Politik",
        "Pengenalan konsep dasar ilmu politik modern termasuk teori negara, kekuasaan, dan sistem pemerintahan dalam konteks global saat ini.");
    pol1.tambahPenulis(p1);

    Buku pol2 = new Buku(27, "Sistem Pemerintahan", "Politik",
        "Perbandingan berbagai sistem pemerintahan di dunia mulai dari demokrasi, monarki, hingga republik dengan analisis kelebihan dan kekurangannya.");
    pol2.tambahPenulis(p2);

    Buku pol3 = new Buku(28, "Demokrasi", "Politik",
        "Pembahasan mendalam tentang konsep demokrasi, sejarah perkembangannya, dan implementasinya di berbagai negara dengan budaya yang beragam.");
    pol3.tambahPenulis(p3);

    Buku pol4 = new Buku(29, "Geopolitik", "Politik",
        "Analisis hubungan antara geografi, kekuatan politik, dan strategi internasional dalam membentuk tatanan dunia dan konflik global modern.");
    pol4.tambahPenulis(p4);

    Buku pol5 = new Buku(30, "Politik Global", "Politik",
        "Kajian tentang dinamika politik internasional, organisasi dunia, dan isu-isu global yang mempengaruhi hubungan antar negara di era globalisasi.");
    pol5.tambahPenulis(p5);

    // =====================
    // KATEGORI FIKSI
    // =====================
    Buku fk1 = new Buku(31, "Petualangan Ajaib", "Fiksi",
        "Kisah petualangan seru di dunia penuh misteri dan keajaiban yang mengajak pembaca menjelajahi imajinasi tanpa batas waktu.");
    fk1.tambahPenulis(p1);

    Buku fk2 = new Buku(32, "Dunia Fantasi", "Fiksi",
        "Cerita tentang dunia fantasi yang menakjubkan dengan makhluk ajaib dan pertarungan epik antara kebaikan dan kejahatan.");
    fk2.tambahPenulis(p2);

    Buku fk3 = new Buku(33, "Cerita Misteri", "Fiksi",
        "Kumpulan cerita misteri menegangkan yang penuh teka-teki dan plot twist mengejutkan yang akan membuat pembaca penasaran sampai akhir.");
    fk3.tambahPenulis(p3);

    Buku fk4 = new Buku(34, "Legenda Nusantara", "Fiksi",
        "Kumpulan legenda dan cerita rakyat dari berbagai daerah di Nusantara yang sarat dengan nilai budaya dan pesan moral.");
    fk4.tambahPenulis(p4);

    Buku fk5 = new Buku(35, "Kisah Masa Depan", "Fiksi",
        "Novel fiksi ilmiah yang mengisahkan kehidupan manusia di masa depan dengan teknologi canggih dan tantangan baru yang futuristik.");
    fk5.tambahPenulis(p5);

    // Menambahkan semua buku ke list
    Buku[] semuaBuku = { t1, t2, t3, t4, t5, f1, f2, f3, f4, f5, s1, s2, s3, s4, s5,
        a1, a2, a3, a4, a5, psk1, psk2, psk3, psk4, psk5,
        pol1, pol2, pol3, pol4, pol5, fk1, fk2, fk3, fk4, fk5 };

    for (Buku b : semuaBuku) {
      b.tampilkanInfo();
    }

    // =====================
    // DEMONSTRASI METHOD BARU
    // =====================
    System.out.println("\n========== DEMONSTRASI METHOD BARU ==========\n");

    // 1. Demonstrasi hitungKataSinopsis
    System.out.println("1. Jumlah kata sinopsis buku '" + t1.judul + "': " + t1.hitungKataSinopsis() + " kata");
    System.out.println("   Sinopsis: " + t1.sinopsis + "\n");

    // 2. Demonstrasi cekKesamaan
    Buku bukuTest1 = new Buku(1, "Pemrograman Java", "Teknologi",
        "Buku ini membahas konsep dasar pemrograman Java untuk pemula hingga mahir dalam bahasa pemrograman modern.");
    bukuTest1.tambahPenulis(p1);

    Buku bukuTest2 = new Buku(2, "Dasar Database", "Teknologi",
        "Panduan lengkap mengenai sistem database relasional dan manajemen data untuk aplikasi bisnis yang efisien.");

    System.out.println("2. Kesamaan antara buku t1 dan bukuTest1: " + t1.cekKesamaan(bukuTest1) + "%");
    System.out.println("   Kesamaan antara buku t1 dan t2: " + t1.cekKesamaan(t2) + "%\n");

    // 3. Demonstrasi copy
    Buku bukuCopy = t1.copy();
    System.out.println("3. Copy buku '" + t1.judul + "':");
    System.out.println("   Original - ID: " + t1.idBuku + ", Judul: " + t1.judul);
    System.out.println("   Copy     - ID: " + bukuCopy.idBuku + ", Judul: " + bukuCopy.judul);
    System.out.println("   Kesamaan antara original dan copy: " + t1.cekKesamaan(bukuCopy) + "%");

  }
}

// =========================
// CLASS BUKU
// =========================
class Buku {

  int idBuku;
  String judul;
  String kategori;
  String sinopsis;
  ArrayList<Penulis> daftarPenulis = new ArrayList<>();

  Buku(int idBuku, String judul, String kategori, String sinopsis) {
    this.idBuku = idBuku;
    this.judul = judul;
    this.kategori = kategori;
    this.sinopsis = sinopsis;
  }

  void tambahPenulis(Penulis p) {
    daftarPenulis.add(p);
  }

  void tampilkanInfo() {
    System.out.println("ID Buku : " + idBuku);
    System.out.println("Judul   : " + judul);
    System.out.println("Kategori: " + kategori);
    System.out.println("Sinopsis: " + sinopsis);
    System.out.print("Penulis : ");

    for (Penulis p : daftarPenulis) {
      System.out.print(p.nama + " ");
    }

    System.out.println("\n--------------------------");
  }

  // Method untuk menghitung jumlah kata pada sinopsis
  int hitungKataSinopsis() {
    if (sinopsis == null || sinopsis.trim().isEmpty()) {
      return 0;
    }
    String[] kata = sinopsis.trim().split("\\s+");
    return kata.length;
  }

  // Method untuk mengecek tingkat kesamaan dengan object lain (0-100%)
  double cekKesamaan(Buku lain) {
    if (lain == null) {
      return 0.0;
    }

    int totalAtribut = 5; // idBuku, judul, kategori, sinopsis, daftarPenulis
    int atributSama = 0;

    // Cek kesamaan idBuku
    if (this.idBuku == lain.idBuku) {
      atributSama++;
    }

    // Cek kesamaan judul
    if (this.judul != null && this.judul.equals(lain.judul)) {
      atributSama++;
    }

    // Cek kesamaan kategori
    if (this.kategori != null && this.kategori.equals(lain.kategori)) {
      atributSama++;
    }

    // Cek kesamaan sinopsis
    if (this.sinopsis != null && this.sinopsis.equals(lain.sinopsis)) {
      atributSama++;
    }

    // Cek kesamaan daftarPenulis (berdasarkan ukuran dan id penulis)
    if (this.daftarPenulis.size() == lain.daftarPenulis.size()) {
      boolean samaPengarang = true;
      for (int i = 0; i < this.daftarPenulis.size(); i++) {
        if (this.daftarPenulis.get(i).id != lain.daftarPenulis.get(i).id) {
          samaPengarang = false;
          break;
        }
      }
      if (samaPengarang) {
        atributSama++;
      }
    }

    return (atributSama * 100.0) / totalAtribut;
  }

  // Method untuk meng-copy object
  Buku copy() {
    Buku bukuBaru = new Buku(this.idBuku, this.judul, this.kategori, this.sinopsis);
    // Copy daftar penulis
    for (Penulis p : this.daftarPenulis) {
      bukuBaru.tambahPenulis(p);
    }
    return bukuBaru;
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
