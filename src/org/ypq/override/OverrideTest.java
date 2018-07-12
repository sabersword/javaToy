package org.ypq.override;


/**
 * 重写返回值类型必须一致，那么Java重写返回值类型必须一样吗？
 * java 5或者以前，必须一样，java 7 java 8可以不同，但是必须是父类返回值的派生类。
 */
public class OverrideTest {

    public static void main(String[] args) {
        KeySetView keySetView = new KeySetView(23, 10000);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(keySetView);
        KeySet keySet = concurrentHashMap.keySet();
    }
}
