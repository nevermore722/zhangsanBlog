package designPattern;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/8/30 23:51
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Singleton4 {

  private static Singleton4 instance = new Singleton4();

  private Singleton4() {
  }

  public static Singleton4 getInstance() {
    return instance;
  }
}
