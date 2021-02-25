Студент изпитва затруднения с изчисляването на резултата по следната формула:
F = Gm1m2 / r2. Но в неговата програма има проблем:

```java
public class LawOfGravity {
  public static void main(String[] args) {
    double G = 6.6742E-11;
    double mass1 = 10;
    double mass2 = 10;
    double r = 2.3;
    double force = G * mass1 * mass2 / r * r;
    System.out.println(force);
  }
}
```

Дайте правилното решение на програмата.

Подсказка: май някъде трябва да се използват скоби!

[За любителите на физика.](https://bg.wikipedia.org/wiki/%D0%97%D0%B0%D0%BA%D0%BE%D0%BD_%D0%B7%D0%B0_%D0%B2%D1%81%D0%B5%D0%BE%D0%B1%D1%89%D0%BE%D1%82%D0%BE_%D0%BF%D1%80%D0%B8%D0%B2%D0%BB%D0%B8%D1%87%D0%B0%D0%BD%D0%B5)
