package UTP;

import java.util.Scanner;

public class AnalisisBuku {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int jumlahBuku = input.nextInt();
    input.nextLine();

    String[] judulBuku = new String[jumlahBuku];
    String[] formattedJudul = new String[jumlahBuku];

    for (int i = 0; i < jumlahBuku; i++) {
      judulBuku[i] = input.nextLine().trim();
    }

    String kataKunci = input.nextLine();

    for (int i = 0; i < jumlahBuku; i++) {
      String[] judul = judulBuku[i].split(" ");
      int jumlahKata = judul.length;
      String kalimat = "";

      System.out.print("Judul " + (i + 1) + ": ");

      for (int j = 0; j < judul.length; j++) {
        String kata = judul[j].substring(0, 1).toUpperCase() + judul[j].substring(1) + " ";
        kalimat += kata;
      }

      formattedJudul[i] = kalimat.trim();
      System.out.print(formattedJudul[i] + " ");

      System.out.print("(" + jumlahKata + " kata)");
      System.out.println();
    }

    int totalHurufVokal = 0;
    for (int i = 0; i < jumlahBuku; i++) {
      String judul = judulBuku[i].toLowerCase();
      for (int j = 0; j < judul.length(); j++) {
        char karakter = judul.charAt(j);
        if (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u') {
          totalHurufVokal++;
        }
      }
    }

    System.out.println("\nTotal huruf vokal: " + totalHurufVokal + "\n");

    System.out.println("Judul yang mengandung kata '" + kataKunci + "':");
    for (int i = 0; i < jumlahBuku; i++) {
      if (formattedJudul[i].toLowerCase().contains(kataKunci.toLowerCase())) {
        System.out.println("- " + formattedJudul[i]);
      }
    }
  }
}
