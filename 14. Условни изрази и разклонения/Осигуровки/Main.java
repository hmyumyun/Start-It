import java.io.*;

import java.util.Scanner;

public class Main {


  public static double findPercent(double percent) {
    return percent / 100.0;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double salary = sc.nextDouble();
    double workerTax = 0.0;
    double employerTax = 0.0;
    int years = sc.nextInt();
    if (salary < 3000.0) {
      if (years <= 55) {
        workerTax = findPercent(20) * salary;
        employerTax = findPercent(17) * salary;
      } else if (years > 55 && years <= 60) {
        workerTax = findPercent(13) * salary;
        employerTax = findPercent(13) * salary;
      } else if (years > 60 && years <= 65) {
        workerTax = findPercent(7.5) * salary;
        employerTax = findPercent(9) * salary;
      } else if (years > 65) {
        workerTax = findPercent(5) * salary;
        employerTax = findPercent(7.5) * salary;
      }
    } else {
      workerTax = findPercent(20) * 3000.0;
      employerTax = findPercent(20) * 3000.0;
    }
    System.out.printf("%.2f%n", workerTax);
    System.out.printf("%.2f%n", employerTax);


  }
}
