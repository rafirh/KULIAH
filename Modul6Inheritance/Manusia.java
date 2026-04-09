public class Manusia {
  private String nama;
  private boolean jenisKelamin; // true = laki-laki, false = perempuan
  private String nik;
  private boolean menikah;

  public Manusia() {
  }

  public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
    this.nik = nik;
    this.menikah = menikah;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public boolean isJenisKelamin() {
    return jenisKelamin;
  }

  public void setJenisKelamin(boolean jenisKelamin) {
    this.jenisKelamin = jenisKelamin;
  }

  public String getNik() {
    return nik;
  }

  public void setNik(String nik) {
    this.nik = nik;
  }

  public boolean isMenikah() {
    return menikah;
  }

  public void setMenikah(boolean menikah) {
    this.menikah = menikah;
  }

  public double getTunjangan() {
    if (!menikah) {
      return 15.0;
    }
    return jenisKelamin ? 25.0 : 20.0;
  }

  public double getPendapatan() {
    return getTunjangan();
  }

  @Override
  public String toString() {
    return "Nama: " + nama
        + "\nNIK: " + nik
        + "\nJenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan")
        + "\nPendapatan: $" + String.format("%.2f", getPendapatan());
  }
}
