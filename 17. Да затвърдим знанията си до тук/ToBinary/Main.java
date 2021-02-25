import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    String str = new String();
    while (number != 0) {
      if (number % 2 == 0) {
        str += "0";
        number /= 2;
      } else {
        str += "1";
        number /= 2;
      }
    }

    char[] binaryNumber = str.toCharArray();

    for (int i = 0; i < binaryNumber.length; i++) {
      System.out.print(binaryNumber[i]);
    }
  }
}
