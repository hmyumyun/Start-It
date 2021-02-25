import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number > 0 && number <= 30) {
      for (int i = number; i >= 0; i--) {
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
        }
        System.out.println();
      }
    } else {
      System.out.println("Invalid input");
    }
  }
}