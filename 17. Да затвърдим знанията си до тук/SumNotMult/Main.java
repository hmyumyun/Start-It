import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int firstNumber = sc.nextInt();
    int secondNumber = sc.nextInt();
    int result = 0;
    for (int i = 0; i < secondNumber; i++) {
      result += firstNumber;
    }
    System.out.println(result);
  }
}
