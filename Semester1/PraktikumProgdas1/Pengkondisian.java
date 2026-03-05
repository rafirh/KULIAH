package PraktikumProgdas1;

public class Pengkondisian {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a < b) {
            System.out.println("a lebih kecil dari b");
        } else {
            System.out.println("a lebih besar dari atau sama dengan b");
        }

        System.out.println(b > 0 ? "b bernilai true" : "b bernilai false");
    }
}
