import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static int computeMingap(int[] array) {
    int[] tempArray = new int[array.length - 1];

    for (int i = 0; i < array.length - 1; i++) {
      tempArray[i] = array[i + 1] - array[i];
    }
    int minNumber = tempArray[0];
    for (int i = 1; i < tempArray.length; i++) {
      if (minNumber > tempArray[i]) {
        minNumber = tempArray[i];
      }
    }
    return minNumber;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(computeMingap(arr));
  }
}
