import java.io.*;
import java.util.*;
import java.util.Collections;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {

    ArrayList<Integer> iArr = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    int number;
    int result = 0;
    while (flag) {
      number = sc.nextInt();
      if (number != 0) {
        iArr.add(number);
      } else {
        flag = false;
      }
    }
    for (int i = 0; i < iArr.size(); i++) {
      result += iArr.get(i);
    }
    System.out.println(result);
  }
}
