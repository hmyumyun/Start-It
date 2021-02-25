import java.io.*;
import java.util.*;
import java.util.Collections;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    ArrayList<Integer> iArr = new ArrayList<Integer>();
    Collections.addAll(iArr, 1, 4, 6, 2, 10, 5);
    Scanner sc = new Scanner(System.in);
    int myNumber = sc.nextInt();
    System.out.println(iArr.indexOf(myNumber));


  }
}
