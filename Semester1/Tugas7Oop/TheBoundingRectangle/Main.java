// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package Tugas7Oop.TheBoundingRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        MyRectangle2D rectangle = BoundingRectangle.getRectangle(points);

        System.out.printf(
            "The bounding rectangle's center (%.1f, %.1f), width %.1f, height %.1f\n",
            rectangle.getX(),
            rectangle.getY(),
            rectangle.getWidth(),
            rectangle.getHeight()
        );

        input.close();
    }
}

