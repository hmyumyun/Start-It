import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str += " ";
    char[] ch = str.toCharArray();
    char chNumber = ch[0];
    if ((int) ch[0] >= 97 && (int) ch[0] <= 122) {
      ch[0] = Character.toUpperCase(chNumber);
    }
    if ((int) ch[ch.length - 2] == 46 || (int) ch[ch.length - 2] == 33
        || (int) ch[ch.length - 2] == 63) {

    } else {
      ch[ch.length - 1] = (char) 46;
    }
    System.out.println(ch);
  }
}
