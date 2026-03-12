import java.util.ArrayList;
import java.util.Scanner;

class Penerbangan {
    private String kodeFligh;
    private String maskapai;
    private String kotaAsal;
    private String kotaTujuan;
    private String jamKeberangkatan;
    private String jamKedatangan;
    private String status;

    public Penerbangan(String kodeFligh, String maskapai, String kotaAsal, String kotaTujuan,
                       String jamKeberangkatan, String jamKedatangan, String status) {
        this.kodeFligh = kodeFligh;
        this.maskapai = maskapai;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
        this.jamKeberangkatan = jamKeberangkatan;
        this.jamKedatangan = jamKedatangan;
        this.status = status;
    }

    public String getKodeFligh() { return kodeFligh; }
    public String getMaskapai() { return maskapai; }
    public String getKotaAsal() { return kotaAsal; }
    public String getKotaTujuan() { return kotaTujuan; }
    public String getJamKeberangkatan() { return jamKeberangkatan; }
    public String getJamKedatangan() { return jamKedatangan; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public void tampilkanInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("Kode Flight      : " + kodeFligh);
        System.out.println("Maskapai         : " + maskapai);
        System.out.println("Kota Asal        : " + kotaAsal);
        System.out.println("Kota Tujuan      : " + kotaTujuan);
        System.out.println("Jam Keberangkatan: " + jamKeberangkatan);
        System.out.println("Jam Kedatangan   : " + jamKedatangan);
        System.out.println("Status           : " + status);
        System.out.println("--------------------------------------------------");
    }
}

public class JadwalPenerbangan {
    static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void tambahPenerbangan() {
        System.out.print("Kode Flight      : ");
        String kode = scanner.nextLine();
        System.out.print("Maskapai         : ");
        String maskapai = scanner.nextLine();
        System.out.print("Kota Asal        : ");
        String asal = scanner.nextLine();
        System.out.print("Kota Tujuan      : ");
        String tujuan = scanner.nextLine();
        System.out.print("Jam Keberangkatan: ");
        String berangkat = scanner.nextLine();
        System.out.print("Jam Kedatangan   : ");
        String datang = scanner.nextLine();
        System.out.print("Status           : ");
        String status = scanner.nextLine();

        Penerbangan p = new Penerbangan(kode, maskapai, asal, tujuan, berangkat, datang, status);
        daftarPenerbangan.add(p);
        System.out.println("Data penerbangan berhasil ditambahkan.");
    }

    public static void tampilkanSemua() {
        if (daftarPenerbangan.isEmpty()) {
            System.out.println("Tidak ada data penerbangan.");
            return;
        }
        System.out.println("\n===== DAFTAR JADWAL PENERBANGAN =====");
        for (Penerbangan p : daftarPenerbangan) {
            p.tampilkanInfo();
        }
    }

    public static void cariPenerbangan() {
        System.out.print("Masukkan kode flight yang dicari: ");
        String kode = scanner.nextLine();
        boolean ditemukan = false;
        for (Penerbangan p : daftarPenerbangan) {
            if (p.getKodeFligh().equalsIgnoreCase(kode)) {
                p.tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Penerbangan dengan kode " + kode + " tidak ditemukan.");
        }
    }

    public static void updateStatus() {
        System.out.print("Masukkan kode flight yang akan diupdate: ");
        String kode = scanner.nextLine();
        boolean ditemukan = false;
        for (Penerbangan p : daftarPenerbangan) {
            if (p.getKodeFligh().equalsIgnoreCase(kode)) {
                System.out.print("Masukkan status baru: ");
                String statusBaru = scanner.nextLine();
                p.setStatus(statusBaru);
                System.out.println("Status berhasil diperbarui.");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Penerbangan dengan kode " + kode + " tidak ditemukan.");
        }
    }

    public static void hapusPenerbangan() {
        System.out.print("Masukkan kode flight yang akan dihapus: ");
        String kode = scanner.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            if (daftarPenerbangan.get(i).getKodeFligh().equalsIgnoreCase(kode)) {
                daftarPenerbangan.remove(i);
                System.out.println("Data penerbangan berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Penerbangan dengan kode " + kode + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        daftarPenerbangan.add(new Penerbangan("GA-101", "Garuda Indonesia", "Jakarta", "Surabaya", "06:00", "07:10", "On Time"));
        daftarPenerbangan.add(new Penerbangan("QG-202", "Citilink", "Surabaya", "Bali", "09:30", "10:20", "Delayed"));
        daftarPenerbangan.add(new Penerbangan("JT-303", "Lion Air", "Bali", "Lombok", "13:00", "13:45", "On Time"));

        int pilihan;
        do {
            System.out.println("\n====== APLIKASI JADWAL PENERBANGAN ======");
            System.out.println("1. Tambah Penerbangan");
            System.out.println("2. Tampilkan Semua Penerbangan");
            System.out.println("3. Cari Penerbangan");
            System.out.println("4. Update Status Penerbangan");
            System.out.println("5. Hapus Penerbangan");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1: tambahPenerbangan(); break;
                case 2: tampilkanSemua(); break;
                case 3: cariPenerbangan(); break;
                case 4: updateStatus(); break;
                case 5: hapusPenerbangan(); break;
                case 0: System.out.println("Program selesai."); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
