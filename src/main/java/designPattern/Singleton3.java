package designPattern;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/8/30 23:39
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Singleton3 {

  private volatile static Singleton3 singleton;

  private Singleton3() {
  }

  public static Singleton3 getSingleton() {
    if (singleton == null) {
      synchronized (Singleton3.class) {
        if (singleton == null) {
          singleton = new Singleton3();
        }
      }
    }
    return singleton;
  }
}
