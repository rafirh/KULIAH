package PraktikumProgdas3;

import java.util.Scanner;

public class HitungVolumeBangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double p = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double l = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double t = input.nextDouble();
                    double volumeBalok = p * l * t;
                    System.out.println("Volume Balok = " + volumeBalok);
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari bola: ");
                    double rBola = input.nextDouble();
                    double volumeBola = (4.0 / 3.0) * Math.PI * Math.pow(rBola, 3);
                    System.out.println("Volume Bola = " + volumeBola);
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double rKerucut = input.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tKerucut = input.nextDouble();
                    double volumeKerucut = (1.0 / 3.0) * Math.PI * Math.pow(rKerucut, 2) * tKerucut;
                    System.out.println("Volume Kerucut = " + volumeKerucut);
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari silinder: ");
                    double rSilinder = input.nextDouble();
                    System.out.print("Masukkan tinggi silinder: ");
                    double tSilinder = input.nextDouble();
                    double volumeSilinder = Math.PI * Math.pow(rSilinder, 2) * tSilinder;
                    System.out.println("Volume Silinder = " + volumeSilinder);
                    break;

                case 5:
                    System.out.print("Masukkan alas segitiga: ");
                    double a = input.nextDouble();
                    System.out.print("Masukkan tinggi segitiga alas: ");
                    double tAlas = input.nextDouble();
                    System.out.print("Masukkan tinggi limas: ");
                    double tLimas = input.nextDouble();
                    double luasAlas = 0.5 * a * tAlas;
                    double volumeLimas = (1.0 / 3.0) * luasAlas * tLimas;
                    System.out.println("Volume Limas Segitiga = " + volumeLimas);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();
        } while (pilihan != 0);

        input.close();
    }
}
