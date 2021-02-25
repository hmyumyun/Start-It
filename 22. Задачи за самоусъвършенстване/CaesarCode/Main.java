import java.io.*;

import java.util.Scanner;

public class Main {

  public static String crypt(String s, int n) {
    StringBuilder builder = new StringBuilder();
    char[] temp = s.toUpperCase().toCharArray();
    for (char ch : temp) {
      if (ch >= 'A' && ch <= 'Z') {
        ch = (char) (ch + n);
        if (ch > 'Z') {
          ch = (char) (ch - ('Z' - 'A' + 1));
        }
      }
      builder.append(ch);
    }
    return builder.toString();
  }

  public static String deCrypt(String s, int n) {
    StringBuilder builder = new StringBuilder();
    char[] temp = s.toUpperCase().toCharArray();
    for (char ch : temp) {
      if (ch <= 'Z' && ch >= 'A') {
        ch = (char) (ch - n);
        if (ch < 'A') {
          ch = (char) (ch + ('Z' - 'A' + 1));

        }
      }
      builder.append(ch);
    }
    return builder.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Въведете криптиране (1) или декриптиране (2): ");
    int number = Integer.parseInt(sc.nextLine());
    System.out.print("Въведете код (n): ");
    int value = Integer.parseInt(sc.nextLine());
    if (number == 1) {
      System.out.print("Въведете текст за криптиране: ");
      String str = sc.nextLine();
      String result = crypt(str, value);
      System.out.println(result);
    } else {
      System.out.print("Въведете текст за декриптиране: ");
      String str = sc.nextLine();
      System.out.println(deCrypt(str, value));
    }
  }
}
