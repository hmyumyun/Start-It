import java.io.*;
import java.util.Scanner;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double value = sc.nextDouble();
    String from = sc.next();
    String to = sc.next();

    //first convert to meter
    if ("mm".equals(from)) {
      value /= 1000;
    } else if ("cm".equals(from)) {
      value /= 100;
    } else if ("mi".equals(from)) {
      value /= 0.000621371192;
    } else if ("in".equals(from)) {
      value /= 39.3700787;
    } else if ("km".equals(from)) {
      value /= 0.001;
    } else if ("ft".equals(from)) {
      value /= 3.2808399;
    } else if ("yd".equals(from)) {
      value /= 1.0936133;
    } else if (!"m".equals(from)) {
      System.out.println("Invalid input");
      return;
    }
    // converting from meter to corresponding metric unit
    if ("mm".equals(to)) {
      value *= 1000;
    } else if ("cm".equals(to)) {
      value *= 100;
    } else if ("mi".equals(to)) {
      value *= 0.000621371192;
    } else if ("in".equals(to)) {
      value *= 39.3700787;
    } else if ("km".equals(to)) {
      value *= 0.001;
    } else if ("ft".equals(to)) {
      value *= 3.2808399;
    } else if ("yd".equals(to)) {
      value *= 1.0936133;
    } else if (!"m".equals(to)) {
      System.out.println("Invalid input");
      return;
    }
    System.out.printf("%.5f%n", value);
  }
}
