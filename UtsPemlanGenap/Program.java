public class Program {
  public static void main(String[] args) {
    BidangDatar[] daftarBidang = new BidangDatar[] {
        new Lingkaran(7),
        new Persegi(6),
        new SegiTiga(8, 5, 8, 6, 7)
    };

    for (BidangDatar bidang : daftarBidang) {
      System.out.println("Jenis: " + bidang.getClass().getSimpleName());
      System.out.printf("Keliling: %.2f%n", bidang.hitungKeliling());
      System.out.printf("Luas: %.2f%n", bidang.hitungLuas());
      System.out.println();
    }
  }
}
