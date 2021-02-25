import java.io.*;

import java.util.*;
import java.util.Collections;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    ArrayList<String> iArr = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      iArr.add(sc.nextLine());
    }
    Collections.sort(iArr);
    System.out.println(iArr);

  }
}
