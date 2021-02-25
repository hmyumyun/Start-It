import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int firstnumber = 0;
    int secondNumber = 1;
    for (int i = 1; i <= number; i++) {
      System.out.print(firstnumber + " ");
      int sum = firstnumber + secondNumber;
      firstnumber = secondNumber;
      secondNumber = sum;
    }
  }
}
