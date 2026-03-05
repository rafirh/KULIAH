// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package Tugas4Method;

import java.util.Scanner;

public class PentagonArea_6_35 {
    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double result = area(side);
        System.out.println("The area of the pentagon is " + result);

        input.close();
    }
}
