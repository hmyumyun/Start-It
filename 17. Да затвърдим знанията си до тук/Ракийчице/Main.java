import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {

    int counter = 1;
    double input = 0.9;
    double output = 0.1;
    while (input > output) {
      input = input - input * 0.1;
      output = output - output * 0.01;
      counter++;
    }
    System.out.println(counter);
  }
}
