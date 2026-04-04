import java.util.Scanner;

public class TabunganBank {
    private static double saldo = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Akun Tabungan Bank ===");
            System.out.println("1. Tambah Saldo");
            System.out.println("2. Kurangi Saldo");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");

            pilihan = 0;
            try {
                pilihan = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka 1-4.");
                continue;
            }

            switch (pilihan) {
                case 1:
                    tambahSaldo();
                    break;
                case 2:
                    kurangiSaldo();
                    break;
                case 3:
                    cekSaldo();
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    private static void tambahSaldo() {
        try {
            System.out.print("Masukkan jumlah yang ingin ditambahkan: ");
            double jumlah = Double.parseDouble(scanner.nextLine().trim());
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0.");
                return;
            }
            saldo += jumlah;
            System.out.printf("Berhasil menambahkan Rp%.2f. Saldo sekarang: Rp%.2f%n", jumlah, saldo);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Masukkan angka yang benar.");
        }
    }

    private static void kurangiSaldo() {
        try {
            System.out.print("Masukkan jumlah yang ingin dikurangi: ");
            double jumlah = Double.parseDouble(scanner.nextLine().trim());
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0.");
                return;
            }
            if (jumlah > saldo) {
                System.out.println("Saldo tidak mencukupi.");
                return;
            }
            saldo -= jumlah;
            System.out.printf("Berhasil mengurangi Rp%.2f. Saldo sekarang: Rp%.2f%n", jumlah, saldo);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Masukkan angka yang benar.");
        }
    }

    private static void cekSaldo() {
        System.out.printf("Saldo saat ini: Rp%.2f%n", saldo);
    }
}