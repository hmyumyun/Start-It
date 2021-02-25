import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    double x = 8.3;
    double y = 14.5;
    //calculates distance between (x,y) to (0,0)
    double result = Math.sqrt(x * x + y * y);
    System.out.println(result);
  }
}
