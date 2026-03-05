package PraktikumProgdas3;

public class NamaVertikal {
  public static void main(String[] args) {
    String nama = "RAFI";

    for (char c : nama.toCharArray()) {
      switch (Character.toUpperCase(c)) {
        case 'R':
          printR();
          break;
        case 'A':
          printA();
          break;
        case 'F':
          printF();
          break;
        case 'I':
          printI();
          break;
        default:
          System.out.println(c + " (belum ada pola)");
      }
      System.out.println();
    }
  }

  public static void printR() {
    System.out.println("RRRR ");
    System.out.println("R   R");
    System.out.println("RRRR ");
    System.out.println("R  R ");
    System.out.println("R   R");
  }

  public static void printA() {
    System.out.println("  A  ");
    System.out.println(" A A ");
    System.out.println("AAAAA");
    System.out.println("A   A");
    System.out.println("A   A");
  }

  public static void printF() {
    System.out.println("FFFFF");
    System.out.println("F    ");
    System.out.println("FFFFF");
    System.out.println("F    ");
    System.out.println("F    ");
  }

  public static void printI() {
    System.out.println("IIIII");
    System.out.println("  I  ");
    System.out.println("  I  ");
    System.out.println("  I  ");
    System.out.println("IIIII");
  }
}
