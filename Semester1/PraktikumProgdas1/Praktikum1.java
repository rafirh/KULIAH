package PraktikumProgdas1;

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        // Instansiasi objek scanner dan disimpan dalam variabel input
        Scanner input = new Scanner(System.in);

        // Membaca input nama
        String nama = input.nextLine();
        // Membaca input NIM
        String nim = input.nextLine();
        // Membaca input angkatan
        int angkatan = input.nextInt();
        // Membersihkan buffer
        input.nextLine();
        // Membaca input program studi
        String prodi = input.nextLine();
        // Membaca input status aktif
        boolean aktif = input.nextBoolean();
        // Membaca input IPK
        double ipk = input.nextDouble();

        System.out.println(" == DATA MAHASISWA =="); 
        // Menampilkan nama
        System.out.println("Nama : " + nama);
        // Menampilkan NIM
        System.out.println("NIM : " + nim);
        // Menampilkan angkatan
        System.out.println("Angkatan : " + angkatan);
        // Menampilkan program studi
        System.out.println("Prodi : " + prodi);
        // Menampilkan status aktif
        System.out.println("Mahasiswa Aktif : " + aktif);
        // Menampilkan IPK dengan format 2 angka di belakang koma
        System.out.printf("IPK : %.2f%n", ipk);

        // Menutup Scanner
        input.close();
    }
}
