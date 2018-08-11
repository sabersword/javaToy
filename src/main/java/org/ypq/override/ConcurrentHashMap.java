package org.ypq.override;

public class ConcurrentHashMap extends Map {

    public ConcurrentHashMap(KeySetView keySetView) {
        this.keySetView = keySetView;
    }

    @Override
    public KeySetView keySet() {
        return this.keySetView;
    }
}
