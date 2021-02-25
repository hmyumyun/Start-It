import java.io.*;
import java.util.Scanner;


// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int number = myScanner.nextInt();
    if (number % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}