import java.io.*;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    // create an array of chars
    char[] characters = str.toCharArray();
    int size = characters.length;
    boolean result = true;
    for (int i = 0; i <= size / 2; i++) {
      //check for non-matched letters
      // example : mom  (m==m and o=o ) is a palindrom
      if (characters[i] != characters[size - i - 1]) {
        result = false;
        break;
      }
    }
    System.out.println(result);
  }
}