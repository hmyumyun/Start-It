import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    double x = 3.0;
    double y = 4.0;
    //calculates r and theta polar coordinates
    double r = Math.sqrt(x * x + y * y);
    double theta = Math.atan2(y, x);
    System.out.println("r     = " + r);
    System.out.println("theta = " + theta);
  }
}
