package MethodString;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan email: ");
        String email = input.nextLine();

        if (isValidEmail(email)) {
            System.out.println(email + "VALID");
        } else {
            System.out.println(email + "INVALID");
        }
    }

    public static boolean isValidEmail(String email) {
        if (!email.contains("@")) return false;

        if (!email.contains(".")) return false;

        if (email.contains("@.")) return false;

        if (email.startsWith("@") || email.startsWith(".")) return false;

        if (!(email.endsWith(".com") || email.endsWith(".org"))) return false;

        if (email.contains(" ")) return false;

        if (!email.equals(email.toLowerCase())) return false;

        return true;
    }
}
