package LiveCoding18Sep;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Baris 1: Gaji Pokok
        int gajiPokok = Integer.parseInt(input.nextLine().trim());

        // Baris 2: input = true / input = false
        String menikahStr = input.nextLine().trim();
        boolean menikah = Boolean.parseBoolean(menikahStr.split("=")[1].trim());

        int totalGaji = gajiPokok;

        if (menikah) {
            // Tunjangan istri 15% dari gaji pokok
            totalGaji += (int) (0.15 * gajiPokok);

            // Baris 3: input = jumlah anak
            String anakStr = input.nextLine().trim();
            int jumlahAnak = Integer.parseInt(anakStr.split("=")[1].trim());

            // Hitung tunjangan anak (5% per anak, max 3 anak)
            int anakDapatTunjangan = Math.min(jumlahAnak, 3);
            totalGaji += (int) (anakDapatTunjangan * 0.05 * gajiPokok);
        }

        System.out.println(totalGaji);
        input.close();
    }
}
