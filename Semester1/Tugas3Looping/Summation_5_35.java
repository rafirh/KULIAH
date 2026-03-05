// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

public class Summation_5_35 {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i = 1; i <= 624; i++) {
            sum += 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }

        System.out.println("Hasil penjumlahan = " + sum);
    }
}
