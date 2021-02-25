import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    boolean flag = true;
    Scanner sc = new Scanner(System.in);
    double number;
    double sum = 0.0;

    List<Double> list = new ArrayList<Double>();
    do {
      System.out.print("Въведете положително число: ");
      number = Double.parseDouble(sc.next());

      if (number < 0 || number == 0) {
        break;
      }

      list.add(number);

    }
    while (flag);
    int size = list.size();
    Double[] array = new Double[size];

    for (int i = 0; i < size; i++) {
      array[i] = list.get(i);
    }

    for (int i = 0; i < size; i++) {
      sum += array[i];
    }
    double min = array[0];
    for (int i = 1; i < size; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    double max = array[0];
    for (int i = 1; i < size; i++) {
      if (max < array[i]) {
        max = array[i];
      }
    }
    System.out.printf("%.2f%n", sum);
    System.out.println(max);
    System.out.println(min);

  }
}