import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number > 0 && number <= 30) {
      for (int i = 0; i < number; i++) {
        for (int j = 0; j < number; j++) {
          if (j >= i) {
            System.out.print("#" + " ");
          }
        }
        System.out.println();
        for (int x = 0; x <= i; x++) {
          System.out.print("  ");
        }
      }
    } else {
      System.out.println("Invalid input!");
    }
  }

}