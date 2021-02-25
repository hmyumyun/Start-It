import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    double result;
    double firstArgument = 40.0;
    double secondArgument = 60.0;
    //conversion from degrees to radians
    firstArgument = Math.toRadians(firstArgument);
    secondArgument = Math.toRadians(secondArgument);
    result = Math.sin(firstArgument) + Math.sin(secondArgument);
    System.out.println(result);
  }
}
