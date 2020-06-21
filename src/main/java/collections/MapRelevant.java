package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/13 22:21
 * @description： Map相关代码
 * @modified By：
 * @version: 1.0
 */
public class MapRelevant {


  @Test
  public void testHashMapPut() throws InterruptedException {
    Map<Integer, String> map = new HashMap<>(16);

    ExecutorService pool = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MICROSECONDS,
        new LinkedBlockingQueue<Runnable>(1024), Executors.defaultThreadFactory(),
        new AbortPolicy());
    for (int i = 1; i <= 10; i++) {
      final int nowValue = i;
      pool.submit(() -> {
        map.put(nowValue, "value:" + nowValue);
      });
    }
    TimeUnit.SECONDS.sleep(2);
    System.out.println(map);
    System.out.println(map.size());

  }
}
