import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner firstScan = new Scanner(System.in);
    String firstStr = firstScan.next().toUpperCase();
    String secondStr = firstScan.next().toUpperCase();
    char[] firstWord = firstStr.toCharArray();
    char[] secondWord = secondStr.toCharArray();
    Arrays.sort(firstWord);
    Arrays.sort(secondWord);
    boolean result = Arrays.equals(firstWord, secondWord);
    System.out.println(result);
  }
}