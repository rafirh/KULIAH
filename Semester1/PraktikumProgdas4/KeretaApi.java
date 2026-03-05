// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package PraktikumProgdas4;
import java.util.Scanner;

public class KeretaApi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data kereta disimpan di array 2D
        // Kolom: 0=Jenis, 1=Harga, 2=Diskon, 3=AC, 4=Colokan
        String[][] kereta = {
            {"Ekonomi", "50000", "2%", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5%", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7%", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10%", "Ada", "Ada"}
        };

        // Array untuk menyimpan pesanan
        String[] namaPemesan = new String[100];
        String[] tanggal = new String[100];
        String[] jenisKereta = new String[100];
        int[] jumlahTiket = new int[100];
        int[] totalHarga = new int[100];
        int jumlahPesanan = 0;

        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Daftar Kereta Api ===");
                    tampilkanData(kereta);
                    break;

                case 2:
                    System.out.println("\n=== Kereta Api dengan AC ===");
                    for (String[] k : kereta) {
                        if (k[3].equalsIgnoreCase("Ada")) {
                            tampilkanBaris(k);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== Kereta Api dengan Colokan ===");
                    for (String[] k : kereta) {
                        if (k[4].equalsIgnoreCase("Ada")) {
                            tampilkanBaris(k);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n=== Pesan Tiket ===");
                    if (jumlahPesanan < 100) {
                        System.out.print("Masukkan Nama: ");
                        namaPemesan[jumlahPesanan] = scanner.nextLine();
                        System.out.print("Masukkan Tanggal (dd-mm-yyyy): ");
                        tanggal[jumlahPesanan] = scanner.nextLine();
                        System.out.print("Masukkan Jumlah Tiket: ");
                        jumlahTiket[jumlahPesanan] = scanner.nextInt();
                        scanner.nextLine(); // buang newline

                        // pilih kereta
                        System.out.println("Pilih Jenis Kereta (Ekonomi/Bisnis/Eksekutif/Pariwisata): ");
                        jenisKereta[jumlahPesanan] = scanner.nextLine();

                        // cari harga & diskon
                        int harga = 0;
                        int diskon = 0;
                        for (String[] k : kereta) {
                            if (k[0].equalsIgnoreCase(jenisKereta[jumlahPesanan])) {
                                harga = Integer.parseInt(k[1]);
                                diskon = Integer.parseInt(k[2].replace("%", ""));
                                break;
                            }
                        }

                        // hitung total harga dengan diskon
                        int hargaTotal = harga * jumlahTiket[jumlahPesanan];
                        int potongan = hargaTotal * diskon / 100;
                        totalHarga[jumlahPesanan] = hargaTotal - potongan;

                        System.out.println("Pesanan berhasil disimpan!");
                        System.out.println("Total Harga (setelah diskon): Rp " + totalHarga[jumlahPesanan]);

                        jumlahPesanan++;
                    } else {
                        System.out.println("Kapasitas pesanan penuh!");
                    }
                    break;

                case 5:
                    if (jumlahPesanan == 0) {
                        System.out.println("Belum ada pesanan tiket!");
                    } else {
                        System.out.println("\n=== Daftar Pesanan Tiket ===");
                        for (int i = 0; i < jumlahPesanan; i++) {
                            System.out.println("Pesanan ke-" + (i + 1));
                            System.out.println("Nama Pemesan : " + namaPemesan[i]);
                            System.out.println("Tanggal      : " + tanggal[i]);
                            System.out.println("Jenis Kereta : " + jenisKereta[i]);
                            System.out.println("Jumlah Tiket : " + jumlahTiket[i]);
                            System.out.println("Total Harga  : Rp " + totalHarga[i]);
                            System.out.println("---------------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        scanner.close();
    }

    // Method untuk menampilkan semua data kereta
    static void tampilkanData(String[][] data) {
        System.out.printf("%-12s %-10s %-8s %-10s %-10s\n",
                "Jenis", "Harga", "Diskon", "AC", "Colokan");
        for (String[] k : data) {
            tampilkanBaris(k);
        }
    }

    // Method untuk menampilkan 1 baris data kereta
    static void tampilkanBaris(String[] k) {
        System.out.printf("%-12s %-10s %-8s %-10s %-10s\n",
                k[0], k[1], k[2], k[3], k[4]);
    }
}
