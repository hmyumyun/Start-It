import java.util.Scanner;

public class Main {

  public static void say(String text) {
    int startIndex = 0;
    while (startIndex < text.length()) {

      String temp = text.substring(startIndex, Math.min(startIndex + 26, text.length()));
      startIndex += 26;
      System.out.printf("| %-26.26s | %n", temp);
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String cowSay = sc.nextLine();
    final String cow =
        "                              \\   ^__^\n" +
            "                               \\  (oo)\\_______\n" +
            "                                  (__)\\       )\\/\\\n" +
            "                                      ||----w |\n" +
            "                                      ||     ||";
    System.out.println("------------------------------");
    say(cowSay);
    System.out.println("------------------------------");
    System.out.println(cow);
  }
}
