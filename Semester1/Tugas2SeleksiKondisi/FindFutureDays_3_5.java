package Tugas2SeleksiKondisi;

import java.util.Scanner;

public class FindFutureDays_3_5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    System.out.print("Enter today's day: ");
    int today = input.nextInt();

    System.out.print("Enter the number of days elapsed since today: ");
    int elapsedDays = input.nextInt();

    int futureDay = (today + elapsedDays) % 7;

    System.out.println("Today is " + days[today] + " and the future day is " + days[futureDay]);

    input.close();
  }
}
