import java.io.*;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0;
    char[] vowels = str.toCharArray();
    for (int i = 0; i < vowels.length; i++) {
      if (vowels[i] == 'a' || vowels[i] == 'A') {
        count++;
      } else if (vowels[i] == 'e' || vowels[i] == 'E') {
        count++;
      } else if (vowels[i] == 'o' || vowels[i] == 'O') {
        count++;
      } else if (vowels[i] == 'u' || vowels[i] == 'U') {
        count++;
      } else if (vowels[i] == 'i' || vowels[i] == 'I') {
        count++;
      } else if (vowels[i] == 'y' || vowels[i] == 'Y') {
        count++;
      }
    }
    System.out.println(count);
  }

}