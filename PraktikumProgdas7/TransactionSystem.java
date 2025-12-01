import java.util.HashMap;
import java.util.Map;

public class TransactionSystem {
  private Map<String, Customer> customers;

  public TransactionSystem() {
    this.customers = new HashMap<>();
  }

  public void registerCustomer(Customer customer) {
    customers.put(customer.getCustomerNumber(), customer);
  }

  public Customer getCustomer(String customerNumber) {
    return customers.get(customerNumber);
  }

  public boolean authenticate(String customerNumber, String pin) {
    Customer customer = customers.get(customerNumber);

    if (customer == null) {
      return false;
    }

    return customer.validatePin(pin);
  }

  public String processPurchase(String customerNumber, String pin, double amount) {
    if (amount <= 0) {
      return "Jumlah pembelian tidak valid!";
    }

    Customer customer = customers.get(customerNumber);

    if (customer == null) {
      return "Nomor pelanggan tidak ditemukan!";
    }

    if (customer.isFrozen()) {
      return "Akun Anda telah diblokir karena 3x kesalahan autentifikasi!";
    }

    if (!customer.validatePin(pin)) {
      int remainingAttempts = 3 - customer.getFailedAttempts();
      if (customer.isFrozen()) {
        return "PIN salah! Akun Anda telah diblokir!";
      }
      return "PIN salah! Sisa percobaan: " + remainingAttempts;
    }

    double cashback = customer.calculateCashback(amount);
    double balanceBefore = customer.getBalance();

    if (customer.purchase(amount)) {
      double balanceAfter = customer.getBalance();
      StringBuilder result = new StringBuilder();
      result.append("\n=== TRANSAKSI BERHASIL ===\n");
      result.append("Jumlah pembelian: Rp " + String.format("%,.0f", amount) + "\n");
      result.append("Cashback: Rp " + String.format("%,.0f", cashback) + "\n");
      result.append("Saldo sebelum: Rp " + String.format("%,.0f", balanceBefore) + "\n");
      result.append("Saldo sesudah: Rp " + String.format("%,.0f", balanceAfter) + "\n");
      result.append("==========================");
      return result.toString();
    } else {
      return "Transaksi gagal! Saldo tidak mencukupi (minimal saldo Rp 10.000 setelah transaksi).";
    }
  }

  public String processTopUp(String customerNumber, String pin, double amount) {
    if (amount <= 0) {
      return "Jumlah top up tidak valid!";
    }

    Customer customer = customers.get(customerNumber);

    if (customer == null) {
      return "Nomor pelanggan tidak ditemukan!";
    }

    if (customer.isFrozen()) {
      return "Akun Anda telah diblokir karena 3x kesalahan autentifikasi!";
    }

    if (!customer.validatePin(pin)) {
      int remainingAttempts = 3 - customer.getFailedAttempts();
      if (customer.isFrozen()) {
        return "PIN salah! Akun Anda telah diblokir!";
      }
      return "PIN salah! Sisa percobaan: " + remainingAttempts;
    }

    double balanceBefore = customer.getBalance();
    customer.topUp(amount);
    double balanceAfter = customer.getBalance();

    StringBuilder result = new StringBuilder();
    result.append("\n=== TOP UP BERHASIL ===\n");
    result.append("Jumlah top up: Rp " + String.format("%,.0f", amount) + "\n");
    result.append("Saldo sebelum: Rp " + String.format("%,.0f", balanceBefore) + "\n");
    result.append("Saldo sesudah: Rp " + String.format("%,.0f", balanceAfter) + "\n");
    result.append("=======================");
    return result.toString();
  }

  public String checkBalance(String customerNumber, String pin) {
    Customer customer = customers.get(customerNumber);

    if (customer == null) {
      return "Nomor pelanggan tidak ditemukan!";
    }

    if (customer.isFrozen()) {
      return "Akun Anda telah diblokir karena 3x kesalahan autentifikasi!";
    }

    if (!customer.validatePin(pin)) {
      int remainingAttempts = 3 - customer.getFailedAttempts();
      if (customer.isFrozen()) {
        return "PIN salah! Akun Anda telah diblokir!";
      }
      return "PIN salah! Sisa percobaan: " + remainingAttempts;
    }

    StringBuilder result = new StringBuilder();
    result.append("\n=== INFORMASI AKUN ===\n");
    result.append("Nomor Pelanggan: " + customer.getCustomerNumber() + "\n");
    result.append("Nama: " + customer.getName() + "\n");
    result.append("Tipe: " + customer.getCustomerType() + "\n");
    result.append("Saldo: Rp " + String.format("%,.0f", customer.getBalance()) + "\n");
    result.append("======================");
    return result.toString();
  }
}
