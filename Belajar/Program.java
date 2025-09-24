package Belajar;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Masukkan nama: ");
      String nama = input.nextLine();

      System.out.print("Masukkan NIM: ");
      int nim = input.nextInt();

      System.out.println(nama);
      System.out.println(nim);
    }
}
