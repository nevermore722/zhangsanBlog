package polymorphic;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/12/9 23:03
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Animal {

  public String colour = "white";
  public int letsNumber = 4;

  public Animal() {
    System.out.println("我要白色的动物");
  }

  public void eat() {
    System.out.println("动物吃食物...");
  }
}
