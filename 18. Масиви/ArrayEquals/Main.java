import java.io.*;
import java.util.Scanner;


// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    int[] myArray = {1, 10, 15};
    int[] newArray = new int[3];
    Scanner myScanner = new Scanner(System.in);
    int number;
    for (int i = 0; i < myArray.length; i++) {
      number = myScanner.nextInt();
      newArray[i] = number;
    }
    boolean flag = true;
    for (int i = 0; i < myArray.length; i++) {
      if (newArray[i] != myArray[i]) {
        flag = false;
        break;
      }
    }
    System.out.println(flag);
  }
}