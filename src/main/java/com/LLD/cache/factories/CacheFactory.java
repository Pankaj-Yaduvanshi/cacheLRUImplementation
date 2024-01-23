package com.LLD.cache.factories;

import com.LLD.cache.policies.LRUEvictionPolicy;
import com.LLD.cache.cache.Cache;
import com.LLD.cache.storage.HashMapBasedStorage;

public class CacheFactory<Key, Value> {

    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<Key, Value>(new LRUEvictionPolicy<Key>(),
                new HashMapBasedStorage<Key, Value>(capacity));
    }
}
