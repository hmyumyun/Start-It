import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static int numberOfDigits(int digit) {
    int counter = 0;
    while (digit != 0) {
      digit /= 10;
      counter++;
    }
    return counter;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int digit = sc.nextInt();
    System.out.println(numberOfDigits(digit));

  }
}
