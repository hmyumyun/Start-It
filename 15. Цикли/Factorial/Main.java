import java.io.*;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.nextLine());
    long result = 1L;
    while (number < 0) {
      System.out.println("Input new number please!");
      number = Integer.parseInt(sc.nextLine());
    }
    int size = number;
    for (int i = 0; i < size; i++) {
      result *= number--;
    }
    System.out.println(result);
  }
}