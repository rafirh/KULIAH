public class Persegi extends BidangDatar {
  private final double sisi;

  public Persegi(double sisi) {
    this.sisi = sisi;
  }

  @Override
  public double hitungKeliling() {
    return 4 * sisi;
  }

  @Override
  public double hitungLuas() {
    return sisi * sisi;
  }
}
