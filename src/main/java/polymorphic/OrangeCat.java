package polymorphic;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/12/12 21:31
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class OrangeCat extends Animal {

  public String colour = "orange";

  @Override
  public void eat() {
    System.out.println(colour + "颜色的猫特别能吃猫粮...，它有" + letsNumber + "条腿");
  }
}
