import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    long number = -8589935681L;
    if (number % 17 == 0) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
