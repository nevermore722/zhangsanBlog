package designPattern;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/8/30 23:01
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Singleton1 {

  private static Singleton1 instance;

  private Singleton1() {
  }

  public static Singleton1 getInstance() {
    if (instance == null) {
      instance = new Singleton1();
    }
    return instance;
  }

}
