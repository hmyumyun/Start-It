import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;


// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {

    BigDecimal mySum;
    BigDecimal borrowSum = new BigDecimal("10000000");
    BigDecimal divident = new BigDecimal("0.105");
    BigDecimal one = new BigDecimal("1");
    BigDecimal twelve = new BigDecimal("12");
    BigDecimal monthly = divident.divide(twelve);
    int months = 120;

    BigDecimal numerator;
    BigDecimal denumerator;
    BigDecimal mejd;

    numerator = monthly.multiply((monthly.add(one).pow(months)));
    denumerator = (monthly.add(one).pow(months)).subtract(one);

    mejd = numerator.divide(denumerator, RoundingMode.HALF_UP);

    mySum = borrowSum.multiply(mejd);
    System.out.println(mySum.setScale(10, RoundingMode.HALF_UP));
  }
}