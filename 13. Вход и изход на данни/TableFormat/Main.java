import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    StringBuilder mariyka = new StringBuilder(20);
    mariyka.append("Марийка");
    StringBuilder mariykaGrade = new StringBuilder(2);
    mariykaGrade.append("6");
    StringBuilder ivancho = new StringBuilder(20);
    ivancho.append("Иванчо");
    StringBuilder ivanchoGrade = new StringBuilder(2);
    ivanchoGrade.append("2");
    StringBuilder pencho = new StringBuilder(20);
    pencho.append("Пенчо");
    StringBuilder penchoGrade = new StringBuilder(2);
    penchoGrade.append("4");
    StringBuilder bigPetko = new StringBuilder(20);
    bigPetko.append("Голям Петко");
    StringBuilder bitPetkoGrade = new StringBuilder(2);
    bitPetkoGrade.append("5");

    System.out.printf("%-20s", ivancho);
    System.out.printf("%2s  %n", ivanchoGrade);
    System.out.printf("%-20s", mariyka);
    System.out.printf("%2s  %n", mariykaGrade);
    System.out.printf("%-20s", pencho);
    System.out.printf("%2s  %n", pencho);
    System.out.printf("%-20s", bigPetko);
    System.out.printf("%2s  %n", bitPetkoGrade);

  }
}
