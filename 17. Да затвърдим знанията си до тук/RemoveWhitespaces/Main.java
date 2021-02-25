import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // remove whitespaces, tabulations
    String newStr = str.replaceAll("\\s", "");
    System.out.println(newStr);

  }
}
