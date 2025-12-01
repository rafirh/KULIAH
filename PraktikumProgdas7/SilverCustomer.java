public class SilverCustomer extends Customer {

  public SilverCustomer(String customerNumber, String name, double balance, String pin) {
    super(customerNumber, name, balance, pin);
  }

  @Override
  public double calculateCashback(double amount) {
    if (amount > 1000000) {
      return amount * 0.05;
    }
    return 0;
  }
}
