import java.io.*;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    // draw square with #
    if (number > 0 && number <= 30) {
      for (int i = 0; i < number; i++) {
        for (int j = 0; j < number; j++) {
          System.out.print("#" + " ");
        }
        System.out.println();
      }
    } else {
      System.out.println("Invalid input!");
    }
  }
}