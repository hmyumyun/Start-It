import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String firtsStr = input.nextLine();
    String secondStr = input.nextLine();
    double firstNumber = Double.parseDouble(firtsStr);
    double secondNumber = Double.parseDouble(secondStr);
    if (firstNumber >= secondNumber) {
      System.out.println(firstNumber);
    } else {
      System.out.println(secondNumber);
    }
  }
}
