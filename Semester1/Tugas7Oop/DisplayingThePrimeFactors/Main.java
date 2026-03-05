// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package Tugas7Oop.DisplayingThePrimeFactors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers(20);

        PrimeFactorization.factorize(number, stack);

        System.out.print("Prime factors in decreasing order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        input.close();
    }
}

