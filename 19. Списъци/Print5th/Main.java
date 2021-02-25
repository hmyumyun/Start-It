import java.io.*;
import java.util.*;
import java.util.Collections;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    ArrayList<String> iArr = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    String s;
    String point = ".";
    while (flag) {
      s = sc.nextLine();
      if (!(s.equals(point))) {
        iArr.add(s);
      } else {
        flag = false;
      }
    }
    if (iArr.size() - 1 < 2) {
      System.out.println("Invalid index of array!");
    } else {

      System.out.println(iArr.get(2));
      Collections.sort(iArr);
      System.out.println(iArr);
    }
  }
}
