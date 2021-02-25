import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  public static void main(String[] args) {
    double height = 171.0;
    double weight = 80.0;
    //formula to calculate body mass index(BMI)
    double bmi = weight / ((height / 100) * (height / 100));
    System.out.println(bmi);
  }
}
