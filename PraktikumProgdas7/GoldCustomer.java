public class GoldCustomer extends Customer {

  public GoldCustomer(String customerNumber, String name, double balance, String pin) {
    super(customerNumber, name, balance, pin);
  }

  @Override
  public double calculateCashback(double amount) {
    if (amount > 1000000) {
      return amount * 0.07;
    } else {
      return amount * 0.02;
    }
  }
}
