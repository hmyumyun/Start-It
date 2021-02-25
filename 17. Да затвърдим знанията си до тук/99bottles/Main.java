import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    for (int i = 99; i >= 3; i--) {
      System.out
          .println(i + " " + "bottles of beer on the wall," + " " + i + " " + "bottles of beer.");
      System.out.println(
          "Take one down and pass it around, " + --i + " " + "bottles of beer on the wall.");
      System.out.println();
      i++;
      if (i == 3) {
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer.");
        System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.");
        System.out.println();
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
        System.out.println("Take it down and pass it around, no more bottles of beer on the wall.");
        System.out.println();
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
      }
    }
  }
}
