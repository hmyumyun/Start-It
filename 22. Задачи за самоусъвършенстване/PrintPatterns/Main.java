import java.io.*;
import java.util.Scanner;


public class Main {

  public static void printFigureA(int n) {
    for (int i = 1; i <= n / 2 + 1; i++) {
      for (int j = 1; j <= n; j++) {
        if (j >= i && j <= n - i + 1) {
          System.out.print("#" + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void printFigureB(int n) {
    for (int i = 1; i <= n / 2 + 1; i++) {
      for (int j = 1; j <= n; j++) {
        if (j >= (n / 2 + 1) - i + 1 && j <= (n / 2 + 1) + i - 1) {
          System.out.print("#" + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void printFigureC(int n) {
    printFigureB(n);
    for (int i = 2; i <= n / 2 + 1; i++) {
      for (int j = 1; j <= n; j++) {
        if (j >= i && j <= n - i + 1) {
          System.out.print("#" + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    String figure = sc.next();
    int number = sc.nextInt();
    if (figure.equals("a")) {
      printFigureA(number);
    } else if (figure.equals("b")) {
      printFigureB(number);
    } else if (figure.equals("c")) {
      printFigureC(number);
    } else {
      System.out.println("Please, select correct figure!");
      System.exit(1);
    }

  }
}