import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    int month = 5;
    int day = 1;

    if (month == 3 && (day >= 20 && day <= 31)) {
      System.out.println("true");
    } else if (month == 4 && (day >= 1 && day <= 30)) {
      System.out.println("true");
    } else if (month == 5 && (day >= 1 && day <= 31)) {
      System.out.println("true");
    } else if (month == 6 && (day >= 1 && day <= 20)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
