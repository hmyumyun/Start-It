import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    double height = 171.0;
    double weight = 80.0;
    // calculate body mass index
    double result = weight / ((height / 100) * (height / 100));
    if (result >= 25) {
      System.out.println("more training, less eating");
    } else {
      System.out.println("you rock!");
    }

  }
}
