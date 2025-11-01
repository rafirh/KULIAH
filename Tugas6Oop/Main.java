// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Current Date ===");
        DateInfo currentDate = new DateInfo();
        currentDate.displayDate();

        System.out.println("\n=== Date for 1234567898765L Milliseconds ===");
        DateInfo specificDate = new DateInfo(1234567898765L);
        specificDate.displayDate();
    }
}
