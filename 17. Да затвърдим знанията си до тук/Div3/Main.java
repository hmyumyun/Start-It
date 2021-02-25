import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    for (int i = 1; i <= 40; i++) {
      if (i % 3 == 0) {
        System.out.println(i);
      }
    }
  }
}
