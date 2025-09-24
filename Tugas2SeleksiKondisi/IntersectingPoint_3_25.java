package Tugas2SeleksiKondisi;

import java.util.Scanner;

public class IntersectingPoint_3_25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Input koordinat
    System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();
    double x4 = input.nextDouble();
    double y4 = input.nextDouble();

    // Koefisien untuk persamaan linear
    double a = y1 - y2;
    double b = -(x1 - x2);
    double c = (((y1 - y2) * x1) - ((x1 - x2) * y1));

    double d = y3 - y4;
    double e = -(x3 - x4);
    double f = (((y3 - y4) * x3) - ((x3 - x4) * y3));

    // Determinan
    double denominator = (a * e) - (b * d);

    if (denominator == 0) {
      System.out.println("The two lines are parallel");
    } else {
      double x = ((c * e) - (b * f)) / denominator;
      double y = ((a * f) - (c * d)) / denominator;

      System.out.println("The intersecting point is at (" + x + ", " + y + ")");
    }

    input.close();
  }
}
