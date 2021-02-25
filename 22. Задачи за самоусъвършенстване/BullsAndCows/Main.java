import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void readAndSavenumber(int number, int arr[]) {
    for (int i = arr.length - 1; i >= 0; i--) {
      arr[i] = number % 10;
      number /= 10;
    }

  }

  public static int countDigit(int number) {
    int counter = 0;
    while (number != 0) {
      number /= 10;
      counter++;
    }
    return counter;
  }

  public static int bullsAndCows(int enteredNumber, int sayedNumber) {
    int[] enteredNumberArr = new int[countDigit(enteredNumber)];
    readAndSavenumber(enteredNumber, enteredNumberArr);
    int[] sayedNumberArr = new int[countDigit(sayedNumber)];
    readAndSavenumber(sayedNumber, sayedNumberArr);
    int bullsCounter = 0;
    int cowsCounter = 0;
    for (int i = 0; i < enteredNumberArr.length; i++) {
      if (sayedNumberArr[i] == enteredNumberArr[i]) {
        bullsCounter++;
      } else {
        for (int j = 0; j < sayedNumberArr.length; j++) {
          if (sayedNumberArr[i] == enteredNumberArr[j]) {
            cowsCounter++;
          }
        }
      }
    }
    System.out.println(bullsCounter + " " + "бикове," + " " + cowsCounter + " " + "крави");
    return bullsCounter;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Тайно число: ");
    int enteredNumber = sc.nextInt();
    int sayedNumber;
    boolean flag = true;
    int counter;
    while (flag) {
      System.out.print("-> ");
      sayedNumber = sc.nextInt();
      if (countDigit(sayedNumber) < countDigit(enteredNumber)) {
        System.out.println("Невалиден опит!");
        continue;
      }
      counter = bullsAndCows(enteredNumber, sayedNumber);
      if (counter == countDigit(enteredNumber)) {
        flag = false;
      }

    }
  }
}
