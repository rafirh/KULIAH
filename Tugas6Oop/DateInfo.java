// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

import java.util.GregorianCalendar;

public class DateInfo {
    private GregorianCalendar calendar;

    // Constructor tanpa argumen → tanggal saat ini
    public DateInfo() {
        this.calendar = new GregorianCalendar();
    }

    // Constructor dengan parameter waktu dalam milidetik
    public DateInfo(long millis) {
        this.calendar = new GregorianCalendar();
        this.calendar.setTimeInMillis(millis);
    }

    // Method untuk menampilkan tanggal (Year, Month, Day)
    public void displayDate() {
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // bulan dimulai dari 0
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Year  : " + year);
        System.out.println("Month : " + month);
        System.out.println("Day   : " + day);
    }
}
