package collections;

import com.alibaba.fastjson.JSON;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/21 17:20
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class SetRelevant {

  private static final Object PRESENT = new Object();

  /**
   * HashSet测试基本用法
   */
  @Test
  public void testBasicUsage() {
    HashSet set = new HashSet();
    set.add(1);
    set.add(5);
    set.add(4);
    set.add(7);
    set.add(3);
    set.add(5);
    System.out.println(set.size());
    System.out.println(set.isEmpty());
    System.out.println(set);

    TreeSet treeSet = new TreeSet();
    LinkedHashSet linkedHashSet = new LinkedHashSet();
  }

  @Test
  public void testHashSetTime() {
    Random rand = new Random(47);
    Set<Integer> intset = new HashSet<>();
    DateTime hashSetStartTime = new DateTime();
    for (int i = 0; i < 1000000000; i++) {
      intset.add(rand.nextInt(30));
    }
    DateTime hashSetEndTime = new DateTime();
    System.out
        .println("HashSet用时:" + (hashSetEndTime.getMillis() - hashSetStartTime.getMillis()) + "ms");
    System.out.println(JSON.toJSONString(intset));
  }

  @Test
  public void testHashMapTime() {
    Random rand = new Random(47);
    Map<Integer, Object> map = new HashMap<>();
    DateTime hashMaptStartTime = new DateTime();
    for (int i = 0; i < 1000000000; i++) {
      map.put(rand.nextInt(30), PRESENT);
    }
    DateTime hashMapEndTime = new DateTime();
    System.out.println(
        "HashMap用时:" + (hashMapEndTime.getMillis() - hashMaptStartTime.getMillis()) + "ms");
    System.out.println(JSON.toJSONString(map));
  }
}
