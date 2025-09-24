package Tugas2SeleksiKondisi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GameLottery_3_15 {
  public static void main(String[] args) {
    // Generate a lottery number
    // int lottery = (int) (Math.random() * 1000); // 0 - 999

    Random rand = new Random();
    int lottery = rand.nextInt(1000); // 0 - 999

    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();

    System.out.println("The lottery number is " + String.format("%03d", lottery));

    // Convert numbers to strings with leading zeros
    String lotteryStr = String.format("%03d", lottery);
    String guessStr = String.format("%03d", guess);

    if (guessStr.equals(lotteryStr)) {
      System.out.println("Exact match: you win $10,000");
    } else {
      // Convert to char arrays for checking digits
      char[] lotteryDigits = lotteryStr.toCharArray();
      char[] guessDigits = guessStr.toCharArray();

      System.out.println("Lottery digits: " + Arrays.toString(lotteryDigits));
      System.out.println("Guess digits: " + Arrays.toString(guessDigits));

      Arrays.sort(lotteryDigits);
      Arrays.sort(guessDigits);

      if (Arrays.equals(lotteryDigits, guessDigits)) {
        System.out.println("Match all digits: you win $3,000");
      } else {
        // Check if at least one digit matches
        boolean match = false;
        for (char g : guessStr.toCharArray()) {

          System.out.println("Checking digit: " + g);
          System.out.println("Lottery index: " + (lotteryStr.indexOf(g)));
          
          if (lotteryStr.indexOf(g) != -1) {
            match = true;
            break;
          }
        }
        if (match) {
          System.out.println("Match one digit: you win $1,000");
        } else {
          System.out.println("Sorry, no match");
        }
      }
    }

    input.close();
  }
}
