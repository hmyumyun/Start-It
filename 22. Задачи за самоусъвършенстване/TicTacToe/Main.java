import java.io.*;

import java.util.Scanner;

public class Main {

  public static Scanner sc = new Scanner(System.in);
  public static int firstPlayer = 0;
  public static int secondPlayer = 0;
  public static int counter = 1;
  public static boolean playFlag = true;
  public static char chX = 'X';
  public static char chO = 'O';
  public static char[][] arr = {{'1', '2', '3'},
      {'4', '5', '6'},
      {'7', '8', '9'}};


  public static void play() {

    while (playFlag) {

      if (counter % 2 != 0) {
        System.out.print("Играч 1: ");
        firstPlayer = sc.nextInt();
        playHelper(firstPlayer);

      } else {
        System.out.print("Играч 2: ");
        secondPlayer = sc.nextInt();
        playHelper(secondPlayer);

      }
      counter++;
      if (counter == 10) {
        playFlag = false;
        System.out.println("Няма победител играта приключи");
      }
    }

  }

  public static boolean checkForWin() {
    for (int r = 0; r < arr.length; r++) {
      if (arr[r][0] == arr[r][1] && arr[r][1] == arr[r][2]) {
        return true;
      }
    }
    for (int c = 0; c < arr.length; c++) {
      if (arr[0][c] == arr[1][c] && arr[1][c] == arr[2][c]) {
        return true;
      }

    }
    if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
      return true;
    }
    if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
      return true;
    }
    return false;
  }

  public static void playHelper(int number) {
    char firstPlace = ' ';
    char secondPlace = ' ';
    if (counter % 2 != 0) {
      firstPlace = chO;
      secondPlace = chX;
    } else {
      firstPlace = chX;
      secondPlace = chO;
    }
    if (number >= 1 && number <= 9) {
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
          int numberChar = Character.getNumericValue(arr[i][j]);
          if (numberChar == number && arr[i][j] != firstPlace) {
            arr[i][j] = secondPlace;
            printArr(arr);
            if (checkForWin()) {
              playFlag = false;
              System.out.println("Победа!");
            }
            return;
          }
        }
      }
    }
    System.out.println("Изберете нова позиция");
    play();
  }

  // method for printing Array
  public static void printArr(char[][] arr) {
    int size = arr.length;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    printArr(arr);
    play();
  }
}
