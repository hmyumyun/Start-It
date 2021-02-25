import java.io.*;
import java.util.*;
import java.util.Collections;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {

    ArrayList<Integer> iArr = new ArrayList<Integer>();
    Collections.addAll(iArr, 1, 10, 15);
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> iArr2 = new ArrayList<Integer>();
    for (int i = 0; i < 3; i++) {
      iArr2.add(sc.nextInt());
    }
    System.out.println(iArr.equals(iArr2));
  }
}
