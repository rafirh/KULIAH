public abstract class Customer {
  private String customerNumber;
  private String name;
  private double balance;
  private String pin;
  private boolean isFrozen;
  private int failedAttempts;

  public Customer(String customerNumber, String name, double balance, String pin) {
    this.customerNumber = customerNumber;
    this.name = name;
    this.balance = balance;
    this.pin = pin;
    this.isFrozen = false;
    this.failedAttempts = 0;
  }

  public abstract double calculateCashback(double amount);

  public String getCustomerNumber() {
    return customerNumber;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public boolean isFrozen() {
    return isFrozen;
  }

  public int getFailedAttempts() {
    return failedAttempts;
  }

  public boolean validatePin(String inputPin) {
    if (isFrozen) {
      return false;
    }

    if (pin.equals(inputPin)) {
      failedAttempts = 0;
      return true;
    } else {
      failedAttempts++;
      if (failedAttempts >= 3) {
        isFrozen = true;
      }
      return false;
    }
  }

  public boolean purchase(double amount) {
    if (isFrozen) {
      return false;
    }

    double cashback = calculateCashback(amount);
    double finalBalance = balance - amount + cashback;

    if (finalBalance < 10000) {
      return false;
    }

    balance = finalBalance;
    return true;
  }

  public boolean topUp(double amount) {
    if (isFrozen) {
      return false;
    }

    balance += amount;
    return true;
  }

  public String getCustomerType() {
    String prefix = customerNumber.substring(0, 2);
    switch (prefix) {
      case "38":
        return "Silver";
      case "56":
        return "Gold";
      case "74":
        return "Platinum";
      default:
        return "Unknown";
    }
  }
}
