// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package Tugas5Array;

import java.util.Scanner;

public class QuadraticEquation_7_25 {
    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return 0;
        } else if (discriminant == 0) {
            roots[0] = -b / (2 * a);
            return 1;
        } else {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double[] eqn = {a, b, c};
        double[] roots = new double[2];

        int numberOfRoots = solveQuadratic(eqn, roots);

        System.out.println("The number of real roots is: " + numberOfRoots);

        if (numberOfRoots == 1) {
            System.out.println("The root is " + roots[0]);
        } else if (numberOfRoots == 2) {
            System.out.println("The roots are " + roots[0] + " and " + roots[1]);
        } else {
            System.out.println("No real roots.");
        }

        input.close();
    }
}
