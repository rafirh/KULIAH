import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    TransactionSystem system = new TransactionSystem();
    Scanner scanner = new Scanner(System.in);

    SilverCustomer silver1 = new SilverCustomer("3812345678", "Budi Santoso", 5000000, "1234");
    GoldCustomer gold1 = new GoldCustomer("5687654321", "Siti Nurhaliza", 10000000, "5678");
    PlatinumCustomer platinum1 = new PlatinumCustomer("7411223344", "Ahmad Dahlan", 20000000, "9012");

    system.registerCustomer(silver1);
    system.registerCustomer(gold1);
    system.registerCustomer(platinum1);

    while (true) {
      System.out.println("\n╔════════════════════════════════════════╗");
      System.out.println("║   SISTEM TRANSAKSI SWALAYAN TINY       ║");
      System.out.println("╚════════════════════════════════════════╝");
      System.out.println("1. Pembelian");
      System.out.println("2. Top Up");
      System.out.println("3. Cek Saldo");
      System.out.println("4. Keluar");
      System.out.print("\nPilih menu: ");

      int choice = 0;
      try {
        choice = scanner.nextInt();
        scanner.nextLine();
      } catch (Exception e) {
        scanner.nextLine();
        System.out.println("Input tidak valid!");
        continue;
      }

      if (choice == 4) {
        System.out.println("\nTerima kasih telah menggunakan layanan kami!");
        break;
      }

      System.out.print("Masukkan nomor pelanggan (10 digit): ");
      String customerNumber = scanner.nextLine();

      if (customerNumber.length() != 10) {
        System.out.println("Nomor pelanggan harus 10 digit!");
        continue;
      }

      System.out.print("Masukkan PIN: ");
      String pin = scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Masukkan jumlah pembelian: Rp ");
          try {
            double purchaseAmount = scanner.nextDouble();
            scanner.nextLine();
            String purchaseResult = system.processPurchase(customerNumber, pin, purchaseAmount);
            System.out.println(purchaseResult);
          } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Jumlah tidak valid!");
          }
          break;

        case 2:
          System.out.print("Masukkan jumlah top up: Rp ");
          try {
            double topUpAmount = scanner.nextDouble();
            scanner.nextLine();
            String topUpResult = system.processTopUp(customerNumber, pin, topUpAmount);
            System.out.println(topUpResult);
          } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Jumlah tidak valid!");
          }
          break;

        case 3:
          String balanceResult = system.checkBalance(customerNumber, pin);
          System.out.println(balanceResult);
          break;

        default:
          System.out.println("Menu tidak valid!");
      }
    }

    scanner.close();
  }
}
