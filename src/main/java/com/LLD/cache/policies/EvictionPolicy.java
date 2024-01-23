package com.LLD.cache.policies;

public interface EvictionPolicy<Key> {

    void keyAccessed(Key key);

    Key evictKey();
}