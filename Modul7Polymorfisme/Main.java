public class Main {
  public static void main(String[] args) {
    Kue[] daftarKue = new Kue[20];

    daftarKue[0] = new KuePesanan("Brownies", 50000, 1.2);
    daftarKue[1] = new KueJadi("Donat", 4000, 12);
    daftarKue[2] = new KuePesanan("Lapis Legit", 85000, 0.8);
    daftarKue[3] = new KueJadi("Pukis", 3500, 20);
    daftarKue[4] = new KuePesanan("Bolu Kukus", 30000, 1.5);
    daftarKue[5] = new KueJadi("Nastar", 2500, 30);
    daftarKue[6] = new KuePesanan("Cheesecake", 95000, 1.0);
    daftarKue[7] = new KueJadi("Klepon", 2000, 25);
    daftarKue[8] = new KuePesanan("Red Velvet", 90000, 1.1);
    daftarKue[9] = new KueJadi("Lemper", 3000, 18);
    daftarKue[10] = new KuePesanan("Tiramisu", 100000, 0.9);
    daftarKue[11] = new KueJadi("Onde-onde", 2500, 22);
    daftarKue[12] = new KuePesanan("Black Forest", 88000, 1.3);
    daftarKue[13] = new KueJadi("Dadar Gulung", 2800, 16);
    daftarKue[14] = new KuePesanan("Sponge Cake", 45000, 1.7);
    daftarKue[15] = new KueJadi("Risoles", 3200, 19);
    daftarKue[16] = new KuePesanan("Carrot Cake", 70000, 1.0);
    daftarKue[17] = new KueJadi("Pastel", 3500, 15);
    daftarKue[18] = new KuePesanan("Pandan Cake", 60000, 1.4);
    daftarKue[19] = new KueJadi("Bika Ambon", 5000, 10);

    double totalHargaSemua = 0;
    double totalHargaPesanan = 0;
    double totalBeratPesanan = 0;
    double totalHargaJadi = 0;
    double totalJumlahJadi = 0;

    Kue kueTermahal = daftarKue[0];

    System.out.println("=== DAFTAR SEMUA KUE ===");
    for (Kue kue : daftarKue) {
      System.out.println(kue);

      double hargaAkhir = kue.hitungHarga();
      totalHargaSemua += hargaAkhir;

      if (kue instanceof KuePesanan) {
        KuePesanan pesanan = (KuePesanan) kue;
        totalHargaPesanan += hargaAkhir;
        totalBeratPesanan += pesanan.getBerat();
      } else if (kue instanceof KueJadi) {
        KueJadi jadi = (KueJadi) kue;
        totalHargaJadi += hargaAkhir;
        totalJumlahJadi += jadi.getJumlah();
      }

      if (hargaAkhir > kueTermahal.hitungHarga()) {
        kueTermahal = kue;
      }
    }

    System.out.println("\n=== RINGKASAN ===");
    System.out.println("Total harga semua kue: " + totalHargaSemua);
    System.out.println("Total harga KuePesanan: " + totalHargaPesanan);
    System.out.println("Total berat KuePesanan: " + totalBeratPesanan);
    System.out.println("Total harga KueJadi: " + totalHargaJadi);
    System.out.println("Total jumlah KueJadi: " + totalJumlahJadi);

    System.out.println("\nKue dengan harga akhir terbesar:");
    System.out.println(kueTermahal);
  }
}
