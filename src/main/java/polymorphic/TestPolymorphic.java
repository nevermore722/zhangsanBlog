package polymorphic;

import org.junit.jupiter.api.Test;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/12/9 23:07
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class TestPolymorphic {

  @Test
  public void testWhiteCat() {
    Animal animal = new WhiteCat();
    System.out.println(animal.colour);
    System.out.println(animal.letsNumber);
    animal.eat();
    ((WhiteCat) animal).play();
  }

  @Test
  public void testBlackCat() {
    Animal animal = new BlackCat();
    System.out.println(animal.colour);
    System.out.println(animal.letsNumber);
    animal.eat();
  }

  @Test
  public void testOrangeCat() {
    Animal animal = new OrangeCat();
    System.out.println(animal.colour);
    System.out.println(animal.letsNumber);
    animal.eat();
  }

  @Test
  public void testSpottedDog() {
    Animal animal = new SpottedDog();
    System.out.println(animal.colour);
    animal.eat();
  }
}
