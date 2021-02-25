import java.io.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String value = "7DEDEDE1";
    int number = Integer.parseInt(value, 16);
    // print in binary number format
    String binary = Integer.toBinaryString(number);
    System.out.println("0b" + binary);
    //print in octal number format
    String octa = Integer.toOctalString(number);
    System.out.println("0" + octa);
    //print in 10-base number format
    System.out.println(number);
    //print in hexadecimal number format
    System.out.println("0x" + value.toLowerCase());
    // print in 36-base number format
    Integer thirtySix = Integer.valueOf(number);
    String toThirtySix = thirtySix.toString(number, 36);
    System.out.println(toThirtySix.toUpperCase());
  }
}

