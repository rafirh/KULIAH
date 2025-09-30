// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package Tugas4Method;

import java.util.Scanner;

public class ConvertMillis {

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;

        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;

        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan waktu dalam milidetik: ");
        long millis = input.nextLong();

        String result = convertMillis(millis);
        System.out.println("Hasil konversi: " + result);

        input.close();
    }
}
