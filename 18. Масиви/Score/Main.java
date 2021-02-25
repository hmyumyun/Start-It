import java.io.*;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    System.out.print("Моля въведете брой на играчите: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    double racers;
    double allResults = 0.0;
    double minSpeed;
    double maxSpeed;
    double average;
    double standartDerivation = ;
    double standartDerivationHelper = 0.0;
    double[] arr = new double[number];
    for (int i = 0; i < number; i++) {
      System.out.print("Въведете резултат №" + (i) + ": ");
      racers = sc.nextDouble();
      arr[i] = racers;
    }

    for (int i = 0; i < arr.length; i++) {
      allResults += arr[i];

    }
    minSpeed = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (minSpeed > arr[i]) {
        minSpeed = arr[i];
      }
    }
    maxSpeed = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (maxSpeed < arr[i]) {
        maxSpeed = arr[i];
      }
    }
    average = allResults / arr.length;
    for (int i = 0; i < arr.length; i++) {
      standartDerivationHelper += (Math.abs(arr[i] - average)) * (Math.abs(arr[i] - average));
    }

    standartDerivation = Math.sqrt(standartDerivationHelper / arr.length);
    System.out.print("Min      = ");
    System.out.printf("%.3f%n", minSpeed);
    System.out.print("Max      = ");
    System.out.printf("%.3f%n", maxSpeed);
    System.out.print("Average  = ");
    System.out.printf("%.3f%n", average);
    System.out.print("StdDev   = ");
    System.out.printf("%.3f%n", standartDerivation);
  }
}
