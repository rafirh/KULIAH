package Modul4Encapsulation;

public class Silver extends Akun {
  public Silver(String nomorPelanggan, String nama, double saldo, String pin) {
    super(nomorPelanggan, nama, saldo, pin);
  }

  @Override
  public void beli(String inputNomor, String inputPin, double totalBelanja) {
    if (!autentikasi(inputNomor, inputPin))
      return;
    System.out.println("[Silver] Cashback 5% jika belanja > Rp1.000.000");
    prosesBelanja(totalBelanja, 0.05);
  }
}
