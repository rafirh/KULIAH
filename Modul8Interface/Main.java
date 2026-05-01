public class Main {
  public static void main(String[] args) {
    Invoice[] invoicesAndi = {
        new Invoice("Beras 5kg", 2, 65000),
        new Invoice("Minyak Goreng", 3, 25000),
        new Invoice("Sabun Mandi", 5, 8000)
    };

    Invoice[] invoicesBudi = {
        new Invoice("Gula Pasir 1kg", 4, 15000),
        new Invoice("Kopi Sachet", 10, 3000)
    };

    Payable[] payables = {
        new Employee(1001, "Andi Saputra", 5000000, invoicesAndi),
        new Employee(1002, "Budi Santoso", 4500000, invoicesBudi)
    };

    for (Payable payable : payables) {
      Employee emp = (Employee) payable;
      System.out.println("============================================================");
      System.out.println("No. Registrasi : " + emp.getRegistrationNumber());
      System.out.println("Nama Karyawan  : " + emp.getName());
      System.out.printf("Gaji Pokok     : Rp%,d%n", emp.getSalaryPerMonth());
      System.out.println("------------------------------------------------------------");
      System.out.println("Detail Belanja Koperasi:");
      for (Payable inv : emp.getInvoices()) {
        System.out.println(inv.toString());
      }
      System.out.println("------------------------------------------------------------");
      System.out.printf("Total Belanja  : Rp%,d%n", emp.getTotalInvoice());
      System.out.printf("Gaji Bersih    : Rp%,d%n", payable.getPayableAmount());
    }
    System.out.println("============================================================");
  }
}
