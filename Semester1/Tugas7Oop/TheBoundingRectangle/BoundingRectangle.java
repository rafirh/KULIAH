// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package Tugas7Oop.TheBoundingRectangle;

public class BoundingRectangle {

    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < minX) minX = points[i][0];
            if (points[i][0] > maxX) maxX = points[i][0];
            if (points[i][1] < minY) minY = points[i][1];
            if (points[i][1] > maxY) maxY = points[i][1];
        }

        double width = maxX - minX;
        double height = maxY - minY;
        double centerX = minX + width / 2;
        double centerY = minY + height / 2;

        return new MyRectangle2D(centerX, centerY, width, height);
    }
}

