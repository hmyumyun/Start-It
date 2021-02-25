import java.io.*;
import java.util.Scanner;


// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  static int rows = 0;
  static int cols = 0;

  public static void printMatrix(int[][] arr, int[][] arr2) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%-4d", arr[i][j]);
      }
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%-4d", arr2[i][j]);
      }
      System.out.println();
    }
  }

  public static void printMatrixWith(int[][] arr, int[][] arr2) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%-4d", arr[i][j]);
      }
      System.out.print(" | ");
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%-4d", arr2[i][j]);
      }
      System.out.println();
    }
  }

  public static void sumMatrix(int[][] arr, int[][] arr2) {
    System.out.println("Сумата на матриците е:");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%-4d", arr[i][j] + arr2[i][j]);
      }
      System.out.println();
    }
  }

  public static void DirectSum(int[][] arr, int[][] arr2) {
    int[][] nullMatrix = new int[rows][cols];
    System.out.println("Директната сумата на матриците е:");
    for (int i = 0; i < nullMatrix.length; i++) {
      for (int j = 0; j < nullMatrix[i].length; j++) {
        nullMatrix[i][j] = 0;
      }
    }
    printMatrix(arr, nullMatrix);
    printMatrix(nullMatrix, arr2);

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Брой редове: ");
    rows = Integer.parseInt(sc.nextLine());
    while (rows < 0 || rows >= 10) {
      System.out.print("Брой редове: ");
      rows = Integer.parseInt(sc.nextLine());
    }
    System.out.print("Брой колони: ");
    cols = Integer.parseInt(sc.nextLine());
    while (cols < 0 || cols >= 10) {
      System.out.print("Брой колони: ");
      cols = Integer.parseInt(sc.nextLine());
    }
    System.out.println("Въведете матрица 1: ");
    int[][] arr = new int[rows][cols];
    int[][] arr2 = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print("Ред " + i + ", Колона " + j + " = ");
        arr[i][j] = Integer.parseInt(sc.nextLine());
      }
    }
    System.out.println("Въведете матрица 2: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print("Ред " + i + ", Колона " + j + " = ");
        arr2[i][j] = Integer.parseInt(sc.nextLine());
      }
    }
    printMatrixWith(arr, arr2);
    sumMatrix(arr, arr2);
    DirectSum(arr, arr2);

  }
}