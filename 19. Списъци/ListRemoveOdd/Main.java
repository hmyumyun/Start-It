import java.io.*;
import java.util.*;
import java.util.Collections;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {

    ArrayList<Integer> iArr = new ArrayList<Integer>();
    Collections.addAll(iArr, 1, 4, 6, 2, 10, 5);
    int size = iArr.size();
    ArrayList<Integer> iArr2 = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      if (i % 2 != 0) {
        iArr2.add(iArr.get(i));
      }
    }
    System.out.println(iArr2);
  }
}
