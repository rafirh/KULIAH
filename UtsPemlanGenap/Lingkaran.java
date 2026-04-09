public class Lingkaran extends BidangDatar {
  private final double jariJari;

  public Lingkaran(double jariJari) {
    this.jariJari = jariJari;
  }

  @Override
  public double hitungKeliling() {
    return 2 * Math.PI * jariJari;
  }

  @Override
  public double hitungLuas() {
    return Math.PI * jariJari * jariJari;
  }
}
