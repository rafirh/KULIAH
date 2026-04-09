import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    System.out.println("===== 1. Manusia =====");
    Manusia manusia1 = new Manusia("Budi", true, "3501010101010001", true);
    Manusia manusia2 = new Manusia("Siti", false, "3501010101010002", true);
    Manusia manusia3 = new Manusia("Andi", true, "3501010101010003", false);

    System.out.println("\na. Laki-laki telah menikah");
    System.out.println(manusia1);
    System.out.println("\nb. Perempuan telah menikah");
    System.out.println(manusia2);
    System.out.println("\nc. Belum menikah");
    System.out.println(manusia3);

    System.out.println("\n===== 2. Mahasiswa FILKOM =====");
    String nimContoh = "225150400111111"; // Angkatan 2022, kode prodi ke-7 = 4 (Sistem Informasi)

    MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("Rafi", true, "3501010101011001", false, nimContoh, 2.80);
    MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("Rafi", true, "3501010101011002", false, nimContoh, 3.20);
    MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("Rafi", true, "3501010101011003", false, nimContoh, 3.80);

    System.out.println("\na. IPK < 3");
    System.out.println(mhs1);
    System.out.println("\nb. IPK 3 - 3.5");
    System.out.println(mhs2);
    System.out.println("\nc. IPK 3.5 - 4");
    System.out.println(mhs3);

    System.out.println("\n===== 3. Pekerja =====");
    Pekerja pekerja1 = new Pekerja("Dono", true, "3501010101012001", true,
        3000, LocalDate.now().minusYears(2), 2);
    Pekerja pekerja2 = new Pekerja("Dini", false, "3501010101012002", true,
        3000, LocalDate.now().minusYears(9), 0);
    Pekerja pekerja3 = new Pekerja("Joko", true, "3501010101012003", true,
        3000, LocalDate.now().minusYears(20), 10);

    System.out.println("\na. Lama bekerja 2 tahun, anak 2");
    System.out.println(pekerja1);
    System.out.println("\nb. Lama bekerja 9 tahun");
    System.out.println(pekerja2);
    System.out.println("\nc. Lama bekerja 20 tahun, anak 10");
    System.out.println(pekerja3);

    System.out.println("\n===== 4. Manager =====");
    Manager manager = new Manager("Rina", false, "3501010101013001", true,
        7500, LocalDate.now().minusYears(15), 0, "Human Resource");
    System.out.println("Manager, lama bekerja 15 tahun dengan gaji $7500");
    System.out.println(manager);
  }
}
