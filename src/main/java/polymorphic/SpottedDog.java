package polymorphic;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/12/13 20:57
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class SpottedDog extends Animal {

  public String colour = "spott";

  public SpottedDog() {
    System.out.println("我是" + colour + "小狗");
    colour = super.colour;
  }

  @Override
  public void eat() {
    System.out.println("我的颜色是：" + colour + ",我爱吃狗粮");
  }
}
