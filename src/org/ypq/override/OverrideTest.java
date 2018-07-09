package org.ypq.override;

public class OverrideTest {

    public static void main(String[] args) {
        KeySetView keySetView = new KeySetView(23, 10000);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(keySetView);
        KeySet keySet = concurrentHashMap.keySet();
    }
}
