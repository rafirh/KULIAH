package Modul4Encapsulation;

public class Main {
  public static void main(String[] args) {
    Akun silver = AkunFactory.buatAkun("3812345678", "Budi Santoso", 500000, "1234");
    Akun gold = AkunFactory.buatAkun("5698765432", "Siti Rahayu", 2000000, "5678");
    Akun platinum = AkunFactory.buatAkun("7411223344", "Andi Wijaya", 5000000, "9999");

    System.out.println("\n========== DEMO SILVER ==========");
    silver.infoAkun();
    silver.beli("3812345678", "1234", 1500000);
    silver.infoAkun();

    System.out.println("\n========== DEMO GOLD ==========");
    gold.infoAkun();
    gold.beli("5698765432", "5678", 800000);
    gold.infoAkun();
    gold.beli("5698765432", "5678", 1200000);
    gold.infoAkun();

    System.out.println("\n========== DEMO PLATINUM ==========");
    platinum.infoAkun();
    platinum.beli("7411223344", "9999", 2000000);
    platinum.infoAkun();

    System.out.println("\n========== DEMO TOP UP ==========");
    silver.topUp("3812345678", "1234", 300000);
    silver.infoAkun();

    System.out.println("\n========== DEMO BLOKIR AKUN ==========");
    for (int i = 1; i <= 3; i++) {
      silver.beli("3812345678", "salah", 100000);
    }
    silver.beli("3812345678", "1234", 100000);

    System.out.println("\n========== DEMO SALDO TIDAK CUKUP ==========");
    Akun akunKecil = AkunFactory.buatAkun("3800000001", "Pelanggan Miskin", 15000, "0000");
    akunKecil.beli("3800000001", "0000", 10000);
    akunKecil.infoAkun();
  }
}
