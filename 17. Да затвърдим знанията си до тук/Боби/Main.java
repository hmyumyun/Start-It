import java.util.*;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;
    boolean flag = true;
    while (flag) {
      str = sc.nextLine();
      if (str.equals(".")) {
        break;
      }
      if (str.isEmpty()) {
        System.out.println("Хубаво деее");
      } else {

        boolean question = str.charAt(str.length() - 1) == '?';
        boolean isUppercase = str.equals(str.toUpperCase());
        if (question && isUppercase) {
          System.out.println("Спокоооо, знам к'во правя!");
        } else if (question) {
          System.out.println("Добре.");
        } else if (isUppercase) {
          System.out.println("Споко бе, ман!");
        } else {
          System.out.println("Ахъ.");
        }
      }
    }

  }
}