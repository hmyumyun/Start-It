import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    String myString = myScanner.nextLine();
    double number;
    number = Double.parseDouble(myString);
    double result = Math.sqrt(number);
    System.out.printf("%8.5f", result);
  }
}
