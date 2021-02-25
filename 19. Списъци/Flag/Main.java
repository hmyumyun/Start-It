import java.io.*;
import java.util.Arrays;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {

    char c = '\u2588';
    int[] arr = new int[10];
    Arrays.fill(arr, c);
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print((char) arr[i] + "");
      }
      System.out.println();
    }
  }
}
