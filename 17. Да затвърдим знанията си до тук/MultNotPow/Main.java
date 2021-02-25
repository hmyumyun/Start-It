import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int powNumber = sc.nextInt();
    int result = 1;
    for (int i = 0; i < powNumber; i++) {
      result *= number;
    }
    System.out.println(result);

  }
}
