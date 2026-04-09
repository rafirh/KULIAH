public class SegiTiga extends BidangDatar {
  private final double alas;
  private final double tinggi;
  private final double sisiA;
  private final double sisiB;
  private final double sisiC;

  public SegiTiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
    this.alas = alas;
    this.tinggi = tinggi;
    this.sisiA = sisiA;
    this.sisiB = sisiB;
    this.sisiC = sisiC;
  }

  @Override
  public double hitungKeliling() {
    return sisiA + sisiB + sisiC;
  }

  @Override
  public double hitungLuas() {
    return 0.5 * alas * tinggi;
  }
}
