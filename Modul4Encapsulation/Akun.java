package Modul4Encapsulation;

public abstract class Akun {
  private String nomorPelanggan;
  private String nama;
  private double saldo;
  private String pin;
  private boolean diblokir;
  private int percobaan;

  private static final double SALDO_MINIMAL = 10000;
  private static final double BATAS_CASHBACK = 1000000;

  public Akun(String nomorPelanggan, String nama, double saldo, String pin) {
    this.nomorPelanggan = nomorPelanggan;
    this.nama = nama;
    this.saldo = saldo;
    this.pin = pin;
    this.diblokir = false;
    this.percobaan = 0;
  }

  public String getNomorPelanggan() {
    return nomorPelanggan;
  }

  public String getNama() {
    return nama;
  }

  public double getSaldo() {
    return saldo;
  }

  public boolean isDiblokir() {
    return diblokir;
  }

  protected double getBatasTransaksi() {
    return BATAS_CASHBACK;
  }

  protected double getSaldoMinimal() {
    return SALDO_MINIMAL;
  }

  protected void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public boolean autentikasi(String inputNomor, String inputPin) {
    if (diblokir) {
      System.out.println("Akun Anda telah diblokir. Hubungi customer service.");
      return false;
    }
    if (inputNomor.equals(nomorPelanggan) && inputPin.equals(pin)) {
      percobaan = 0;
      return true;
    } else {
      percobaan++;
      System.out.println("Nomor pelanggan atau PIN salah. Percobaan ke-" + percobaan);
      if (percobaan >= 3) {
        diblokir = true;
        System.out.println("Akun Anda telah diblokir karena 3x kesalahan autentikasi.");
      }
      return false;
    }
  }

  public void topUp(String inputNomor, String inputPin, double jumlah) {
    if (!autentikasi(inputNomor, inputPin))
      return;
    saldo += jumlah;
    System.out.printf("Top up berhasil. Saldo sekarang: Rp%.2f%n", saldo);
  }

  public abstract void beli(String inputNomor, String inputPin, double totalBelanja);

  protected void prosesBelanja(double totalBelanja, double persen) {
    double cashback = 0;
    if (totalBelanja > getBatasTransaksi()) {
      cashback = totalBelanja * persen;
    }
    double tagihan = totalBelanja - cashback;
    if (saldo - tagihan < getSaldoMinimal()) {
      System.out.println("Transaksi gagal. Saldo tidak mencukupi batas minimal Rp10.000.");
      return;
    }
    saldo -= tagihan;
    System.out.printf("Transaksi berhasil. Total belanja: Rp%.2f | Cashback: Rp%.2f | Saldo sekarang: Rp%.2f%n",
        totalBelanja, cashback, saldo);
  }

  public void infoAkun() {
    System.out.println("=== Info Akun ===");
    System.out.println("Nama           : " + nama);
    System.out.println("Nomor Pelanggan: " + nomorPelanggan);
    System.out.printf("Saldo          : Rp%.2f%n", saldo);
    System.out.println("Status         : " + (diblokir ? "Diblokir" : "Aktif"));
  }
}
