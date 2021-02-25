import java.io.*;
import java.util.*;
import java.util.Collections;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    ArrayList<Integer> iArr = new ArrayList<>();
    ArrayList<Integer> iArr2 = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    int number;
    while (flag) {
      number = sc.nextInt();
      if (number != 0) {
        iArr.add(number);
      } else {
        flag = false;
      }
    }
    int resultNumber = sc.nextInt();
    for (int i = 0; i < iArr.size() - 1; i++) {
      for (int j = i; j < iArr.size() - 1; j++) {
        if (resultNumber == (iArr.get(i) + iArr.get(j + 1))) {
          Collections.addAll(iArr2, iArr.get(i), iArr.get(j + 1));
        }
      }
    }

    for (int i = 0; i < iArr2.size(); i += 2) {
      System.out.print(iArr2.get(i) + " " + iArr2.get(i + 1) + "\n");

    }
  }
}
