package Modul4Encapsulation;

public class Gold extends Akun {
  public Gold(String nomorPelanggan, String nama, double saldo, String pin) {
    super(nomorPelanggan, nama, saldo, pin);
  }

  @Override
  public void beli(String inputNomor, String inputPin, double totalBelanja) {
    if (!autentikasi(inputNomor, inputPin))
      return;
    System.out.println("[Gold] Cashback 7% jika belanja > Rp1.000.000, selain itu 2%");
    double persen = totalBelanja > getBatasTransaksi() ? 0.07 : 0.02;
    double cashback = totalBelanja * persen;
    double tagihan = totalBelanja - cashback;
    if (getSaldo() - tagihan < getSaldoMinimal()) {
      System.out.println("Transaksi gagal. Saldo tidak mencukupi batas minimal Rp10.000.");
      return;
    }
    setSaldo(getSaldo() - tagihan + cashback);
    System.out.printf(
        "Transaksi berhasil. Total belanja: Rp%.2f | Cashback: Rp%.2f (kembali ke saldo) | Saldo sekarang: Rp%.2f%n",
        totalBelanja, cashback, getSaldo());
  }
}
