package PraktikumProgdas1;

import java.util.Scanner;

public class Suhu {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan suhu dalam Celcius: ");
    double celcius = input.nextDouble();

    double fahrenheit = (celcius * 9/5) + 32;
    System.out.printf("Suhu dalam Fahrenheit: %.2f%n", fahrenheit);

    input.close();
  }
}
