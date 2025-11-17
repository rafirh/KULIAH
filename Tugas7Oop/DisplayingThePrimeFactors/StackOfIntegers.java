// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

package Tugas7Oop.DisplayingThePrimeFactors;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    public void push(int value) {
        if (size >= elements.length) {
            // Resize if needed
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

