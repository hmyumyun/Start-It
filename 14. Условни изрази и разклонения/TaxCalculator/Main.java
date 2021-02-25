import java.io.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double number = sc.nextDouble();

    double totalTax = 0.0;
    double firstTax = 0.0;
    double secondTax = 0.0;
    double thirdTax = 0.0;
    double twentyK = 20000.0;
    boolean flag = true;

    while (flag) {
      if (number <= 20000) {
        totalTax = 0.0;
        break;
      }
      if (number > 20000 && number < 40000) {
        number = number - twentyK;
        totalTax = number * 0.1;
        break;
      }
      number = number - twentyK;
      //first 20000
      if (number > 2 * twentyK) {
        firstTax = twentyK * 0.1;
      } else {
        number = number - twentyK;
        firstTax = number * 0.1;
        secondTax = number * 0.2;
        break;
      }
      //getSecond 20000
      number = number - twentyK;
      if (number >= twentyK) {
        secondTax = twentyK * 0.2;
      } else {
        secondTax = number * 0.2;
        flag = false;
      }

      if (number >= twentyK) {
        number = number - twentyK;
        thirdTax = number * 0.3;
        flag = false;
      }
    }
    totalTax = totalTax + firstTax + secondTax + thirdTax;
    System.out.printf("%.2f%n", totalTax);


  }
}
