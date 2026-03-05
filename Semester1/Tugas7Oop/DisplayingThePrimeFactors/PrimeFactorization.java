// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package Tugas7Oop.DisplayingThePrimeFactors;

public class PrimeFactorization {

    public static void factorize(int number, StackOfIntegers stack) {
        int divisor = 2;

        while (number > 1) {
            if (number % divisor == 0) {
                stack.push(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }
    }
}

