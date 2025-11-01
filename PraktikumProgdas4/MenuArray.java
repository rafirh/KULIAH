// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package PraktikumProgdas4;
import java.util.Scanner;

public class MenuArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {
            "1. Input Data",
            "2. Lihat Data",
            "3. Average",
            "4. Sum",
            "5. Max",
            "6. Min",
            "7. Keluar"
        };

        int[] data = new int[999];
        int count = 0;
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            for (String m : menu) {
                System.out.println(m);
            }
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    if (count < data.length) {
                        System.out.print("Masukkan angka (pisahkan dengan spasi): ");
                        String line = scanner.nextLine();
                        String[] parts = line.split(" ");

                        for (String p : parts) {
                            if (count < data.length) {
                                try {
                                    data[count] = Integer.parseInt(p);
                                    count++;
                                } catch (NumberFormatException e) {
                                    System.out.println("Input \"" + p + "\" bukan angka, dilewati.");
                                }
                            } else {
                                System.out.println("Array penuh! Sisa data tidak disimpan.");
                                break;
                            }
                        }
                        System.out.println("Data berhasil ditambahkan!");
                    } else {
                        System.out.println("Array penuh!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Data kosong!");
                    } else {
                        System.out.print("Data: ");
                        for (int i = 0; i < count; i++) {
                            System.out.print(data[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("Data kosong!");
                    } else {
                        double sumAvg = 0;
                        for (int i = 0; i < count; i++) {
                            sumAvg += data[i];
                        }
                        double avg = sumAvg / count;
                        System.out.println("Rata-rata: " + avg);
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("Data kosong!");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < count; i++) {
                            sum += data[i];
                        }
                        System.out.println("Jumlah: " + sum);
                    }
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("Data kosong!");
                    } else {
                        int max = data[0];
                        for (int i = 1; i < count; i++) {
                            if (data[i] > max) {
                                max = data[i];
                            }
                        }
                        System.out.println("Nilai maksimum: " + max);
                    }
                    break;

                case 6:
                    if (count == 0) {
                        System.out.println("Data kosong!");
                    } else {
                        int min = data[0];
                        for (int i = 1; i < count; i++) {
                            if (data[i] < min) {
                                min = data[i];
                            }
                        }
                        System.out.println("Nilai minimum: " + min);
                    }
                    break;

                case 7:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 7);

        scanner.close();
    }
}
