import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    int number;
    while (flag) {
      number = sc.nextInt();
      if (number == 0) {
        System.out.println("Пльок Пляс Пльос");
        flag=false;
      }
      if (number % 3 == 0) {
        System.out.print("Пльок ");
      }
      if (number % 5 == 0) {
        System.out.print("Пляс ");
      }
      if (number % 7 == 0) {
        System.out.print("Пльос ");
      }
      if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
        System.out.print(number);

      }
      System.out.println();
    }
  }
}
