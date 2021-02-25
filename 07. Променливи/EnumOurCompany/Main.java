import java.io.*;

// винаги използвайте клас Main, инак ще получите грешка при компилиране!
public class Main {

  enum OurCompany {ИВАН, СТОЯН, ПЕТЪР, МИЛЕН, ОГНЯН}

  public static void main(String[] args) {
    OurCompany ivan = OurCompany.ИВАН;
    OurCompany stoyan = OurCompany.СТОЯН;
    OurCompany petar = OurCompany.ПЕТЪР;
    OurCompany milen = OurCompany.МИЛЕН;
    OurCompany oqnyan = OurCompany.ОГНЯН;

    System.out.println(ivan);
    System.out.println(stoyan);
    System.out.println(petar);
    System.out.println(milen);
    System.out.println(oqnyan);

  }
}
