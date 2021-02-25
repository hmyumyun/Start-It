import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static int sum(int number) {
    if (number > 0) {
      return number + sum(number - 1);
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int digit = sc.nextInt();
    System.out.println(sum(digit));

  }
}
