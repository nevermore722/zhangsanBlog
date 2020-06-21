package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.junit.jupiter.api.Test;

/**
 * @author ：ZouJiaHui
 * @date ：Created in 2020/6/6 20:58
 * @description： ArrayListAndLinkedList相关代码
 * @modified By：
 * @version: 1.0
 */
public class ArrayListAndLinkedList {

  public static void main(String[] args) {

  }

  @Test
  public void testArrayListAddTime1() {
    List<Integer> arrayList = new ArrayList<Integer>();
    DateTime arrayListStartTime = new DateTime();
    for (int i = 0; i < 10000000; i++) {
      arrayList.add(i);
    }
    DateTime arrayListEndTime1 = new DateTime();
    System.out.println(
        "arrayList用时:" + (arrayListEndTime1.getMillis() - arrayListStartTime.getMillis()) + "ms");
  }

  @Test
  public void testLinkedListAddTime1() {
    List<Integer> linkedList = new LinkedList<Integer>();
    DateTime linkedListStartTime = new DateTime();
    for (int i = 0; i < 10000000; i++) {
      linkedList.add(i);
    }
    DateTime linkedListEndTime = new DateTime();
    System.out
        .println("linkedList用时:" + (linkedListEndTime.getMillis() - linkedListStartTime.getMillis())
            + "ms");
  }

  @Test
  public void testArrayListAddTime2() {
    List<Integer> arrayList = new ArrayList<Integer>();
    DateTime arrayListStartTime = new DateTime();
//    for (int i = 0; i < 500000; i++) {
//      arrayList.add(0, i);
//    }
//    for (int i = 0; i < 500000; i++) {
//      if (i < 99999) {
//        arrayList.add(0, i);
//      } else {
//        arrayList.add(i - 99999, i);
//      }
//    }
    DateTime arrayListEndTime1 = new DateTime();
    System.out.println(
        "arrayList用时:" + (arrayListEndTime1.getMillis() - arrayListStartTime.getMillis()) + "ms");
  }

  @Test
  public void testLinkedListAddTime2() {
    List<Integer> linkedList = new LinkedList<Integer>();
    DateTime linkedListStartTime = new DateTime();
//    for (int i = 0; i < 500000; i++) {
//      linkedList.add(0, i);
//    }
//    for (int i = 0; i < 500000; i++) {
//      if (i < 180000) {
//        linkedList.add(0, i);
//      } else {
//        linkedList.add(i - 180000, i);
//      }
//    }
    for (int i = 0; i < 500000; i++) {
      linkedList.add(i / 2, i);
    }
    DateTime linkedListEndTime = new DateTime();
    System.out
        .println("linkedList用时:" + (linkedListEndTime.getMillis() - linkedListStartTime.getMillis())
            + "ms");
  }

  @Test
  public void testArrayListRemoveTime() {
    List<Integer> arrayList = new ArrayList<Integer>();
    for (int i = 0; i < 500000; i++) {
      arrayList.add(i);
    }

    DateTime arrayListStartTime = new DateTime();
    for (int i = 499999; i >= 0; i--) {
      arrayList.remove(i);
    }
    DateTime arrayListEndTime1 = new DateTime();
    System.out.println(
        "arrayList用时:" + (arrayListEndTime1.getMillis() - arrayListStartTime.getMillis()) + "ms");
  }

  @Test
  public void testLinkedListRemoveTime() {
    List<Integer> linkedList = new LinkedList<Integer>();
    for (int i = 0; i < 500000; i++) {
      linkedList.add(i);
    }

    DateTime linkedListStartTime = new DateTime();
    for (int i = 499999; i >= 0; i--) {
      linkedList.remove(i);
    }
    DateTime linkedListEndTime1 = new DateTime();
    System.out.println(
        "arrayList用时:" + (linkedListEndTime1.getMillis() - linkedListStartTime.getMillis()) + "ms");
  }

  @Test
  public void testArrayListRemoveTime2() {
    List<Integer> arrayList = new ArrayList<Integer>();
    for (int i = 0; i < 500000; i++) {
      arrayList.add(i);
    }

    DateTime arrayListStartTime = new DateTime();
    for (int i = 499999; i >= 0; i--) {

      if (i > 200000) {
        arrayList.remove(i - 200000);
      } else {
        arrayList.remove(0);
      }
    }
    DateTime arrayListEndTime1 = new DateTime();
    System.out.println(
        "arrayList用时:" + (arrayListEndTime1.getMillis() - arrayListStartTime.getMillis()) + "ms");
  }

  @Test
  public void testLinkedListRemoveTime2() {
    List<Integer> linkedList = new LinkedList<Integer>();
    for (int i = 0; i < 500000; i++) {
      linkedList.add(i);
    }

    DateTime linkedListStartTime = new DateTime();
    for (int i = 499999; i >= 0; i--) {
      if (i > 200000) {
        linkedList.remove(i - 200000);
      } else {
        linkedList.remove(0);
      }
    }
    DateTime linkedListEndTime1 = new DateTime();
    System.out.println(
        "arrayList用时:" + (linkedListEndTime1.getMillis() - linkedListStartTime.getMillis()) + "ms");
  }
}
