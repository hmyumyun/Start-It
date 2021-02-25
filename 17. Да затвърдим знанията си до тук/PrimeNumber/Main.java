import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    boolean flag = true;
    for (int i = 2; i <= number; i++) {
      if (number % i == 0) {
        flag = false;
        break;
      }
    }
    System.out.println(flag);
  }
}
