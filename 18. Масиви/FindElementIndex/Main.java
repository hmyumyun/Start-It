import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    int[] myArray = {1, 4, 6, 2, 10, 5};
    Scanner myScanner = new Scanner(System.in);
    int number = myScanner.nextInt();
    int result = -1;
    for (int i = 0; i < myArray.length; i++) {
      if (number == myArray[i]) {
        result = i;
        break;
      }
    }
    System.out.println(result);
  }
}