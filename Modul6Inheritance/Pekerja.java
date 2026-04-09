import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
  private double gaji;
  private LocalDate tahunMasuk;
  private int jumlahAnak;

  public Pekerja() {
  }

  public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah,
      double gaji, LocalDate tahunMasuk, int jumlahAnak) {
    super(nama, jenisKelamin, nik, menikah);
    this.gaji = gaji;
    this.tahunMasuk = tahunMasuk;
    this.jumlahAnak = jumlahAnak;
  }

  public double getGajiPokok() {
    return gaji;
  }

  public void setGaji(double gaji) {
    this.gaji = gaji;
  }

  public LocalDate getTahunMasuk() {
    return tahunMasuk;
  }

  public void setTahunMasuk(LocalDate tahunMasuk) {
    this.tahunMasuk = tahunMasuk;
  }

  public int getJumlahAnak() {
    return jumlahAnak;
  }

  public void setJumlahAnak(int jumlahAnak) {
    this.jumlahAnak = jumlahAnak;
  }

  public double getBonus() {
    int lamaBekerja = 0;
    if (tahunMasuk != null) {
      lamaBekerja = Period.between(tahunMasuk, LocalDate.now()).getYears();
      if (lamaBekerja < 0) {
        lamaBekerja = 0;
      }
    }

    if (lamaBekerja <= 5) {
      return 0.05 * gaji;
    }
    if (lamaBekerja <= 10) {
      return 0.10 * gaji;
    }
    return 0.15 * gaji;
  }

  public double getGaji() {
    return gaji + getBonus();
  }

  @Override
  public double getTunjangan() {
    return super.getTunjangan() + (20.0 * jumlahAnak);
  }

  @Override
  public double getPendapatan() {
    return getTunjangan() + getGaji();
  }

  @Override
  public String toString() {
    return super.toString()
        + "\nTahun Masuk: " + tahunMasuk
        + "\nJumlah Anak: " + jumlahAnak
        + "\nGaji: $" + String.format("%.2f", getGaji());
  }
}
