import java.util.Scanner;

public class CVLabkomdas {
    private static final int HARGA_A = 100000;
    private static final int HARGA_B = 125000;
    private static final int HARGA_C = 175000;

    private static final int DISKON_A = 95000;
    private static final int DISKON_B = 120000;
    private static final int DISKON_C = 160000;

    public static int hitungHargaJaketA(int jumlah) {
        return jumlah > 100 ? DISKON_A : HARGA_A;
    }

    public static int hitungHargaJaketB(int jumlah) {
        return jumlah > 100 ? DISKON_B : HARGA_B;
    }

    public static int hitungHargaJaketC(int jumlah) {
        return jumlah > 100 ? DISKON_C : HARGA_C;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jaket A: ");
        int jumlahA = input.nextInt();

        System.out.print("Masukkan jumlah jaket B: ");
        int jumlahB = input.nextInt();

        System.out.print("Masukkan jumlah jaket C: ");
        int jumlahC = input.nextInt();

        int hargaA = hitungHargaJaketA(jumlahA);
        int hargaB = hitungHargaJaketB(jumlahB);
        int hargaC = hitungHargaJaketC(jumlahC);

        int totalA = jumlahA * hargaA;
        int totalB = jumlahB * hargaB;
        int totalC = jumlahC * hargaC;

        int totalSemua = totalA + totalB + totalC;

        System.out.println("Total harga jaket A: Rp " + totalA);
        System.out.println("Total harga jaket B: Rp " + totalB);
        System.out.println("Total harga jaket C: Rp " + totalC);
        System.out.println("Total keseluruhan: Rp " + totalSemua);

        input.close();
    }
}
