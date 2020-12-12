package polymorphic;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/12/12 20:31
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class BlackCat extends Animal {
  public String colour = "black";

  @Override
  public void eat() {
    System.out.println("黑猫吃猫粮...");
  }
}
