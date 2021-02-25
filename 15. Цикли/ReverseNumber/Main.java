import java.io.*;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    //get only positives number
    if (number < 0) {
      number = Math.abs(number);
    }
    int result = 0;
    while (number != 0) {
      int remainder = number % 10;
      result = result * 10 + remainder;
      number = number / 10;
    }
    System.out.println(result);
  }

}

