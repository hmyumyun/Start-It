import java.io.*;
import java.util.Scanner;


// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sentence;
    String symbol;
    // read the sentence
    Character s;
    sentence = sc.nextLine();
    // read the symbol
    symbol = sc.next();
    char[] strChar = symbol.toCharArray();
    int counter = 0;
    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) == strChar[0]) {
        counter++;
      }
    }
    System.out.println(counter);
  }
}
