package Modul4Encapsulation;

public class AkunFactory {
    public static Akun buatAkun(String nomorPelanggan, String nama, double saldo, String pin) {
        String kode = nomorPelanggan.substring(0, 2);
        switch (kode) {
            case "38": return new Silver(nomorPelanggan, nama, saldo, pin);
            case "56": return new Gold(nomorPelanggan, nama, saldo, pin);
            case "74": return new Platinum(nomorPelanggan, nama, saldo, pin);
            default:
                System.out.println("Kode jenis rekening tidak dikenal.");
                return null;
        }
    }
}
