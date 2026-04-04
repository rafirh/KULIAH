import java.util.Scanner;

public class OperasiPecahan {
    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    public static double pengurangan(double a, double b) {
        return a - b;
    }

    public double perkalian(double a, double b) {
        return a * b;
    }

    public double pembagian(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
        return a / b;
    }

    public String sederhana(int pembilang, int penyebut) {
        if (penyebut == 0) {
            return "Penyebut tidak boleh nol";
        }

        int a = Math.abs(pembilang);
        int b = Math.abs(penyebut);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        int fpb = a;
        int hasilPembilang = pembilang / fpb;
        int hasilPenyebut = penyebut / fpb;

        if (hasilPenyebut < 0) {
            hasilPembilang *= -1;
            hasilPenyebut *= -1;
        }

        return hasilPembilang + "/" + hasilPenyebut;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OperasiPecahan kalkulator = new OperasiPecahan();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Penjumlahan: " + penjumlahan(angka1, angka2));
        System.out.println("Pengurangan: " + pengurangan(angka1, angka2));
        System.out.println("Perkalian: " + kalkulator.perkalian(angka1, angka2));

        try {
            System.out.println("Pembagian: " + kalkulator.pembagian(angka1, angka2));
        } catch (ArithmeticException e) {
            System.out.println("Pembagian: " + e.getMessage());
        }

        System.out.print("Masukkan pembilang pecahan: ");
        int pembilang = input.nextInt();

        System.out.print("Masukkan penyebut pecahan: ");
        int penyebut = input.nextInt();

        System.out.println("Hasil sederhana: " + kalkulator.sederhana(pembilang, penyebut));

        input.close();
    }
}
