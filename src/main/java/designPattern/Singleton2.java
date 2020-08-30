package designPattern;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/8/30 23:32
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Singleton2 {

  private static Singleton2 instance;

  private Singleton2() {
  }

  public static synchronized Singleton2 getInstance() {
    if (instance == null) {
      instance = new Singleton2();
    }
    return instance;
  }
}

