package org.ypq.jvm;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 测试java的GC,产生大量垃圾,导致年轻代和老年代空间都满了
 */
public class EternalGen {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("availableProcessors=" + runtime.availableProcessors());
        System.out.println("maxMemory=" + runtime.maxMemory() / 1024.0 / 1024 + "M");
        System.out.println("totalMemory=" + runtime.totalMemory() / 1024.0 / 1024 + "M");
        Random random = new Random();
        String str = new String("abc");
        List<String> stringList = new LinkedList<String>();

        for(long i = 0; ;i++) {
//            System.out.println("i=" + i + ",str.length=" + str);
            stringList.add(str += String.valueOf(random.nextInt(9999999)));
//            str = String.valueOf(random.nextInt(999999999));
//            str.intern();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
