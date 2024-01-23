package com.LLD.cache.storage;

import com.LLD.cache.exceptions.NotFoundException;
import com.LLD.cache.exceptions.StorageFullException;

public interface Storage<Key, Value> {
    public void add(Key key, Value value) throws StorageFullException;

    void remove(Key key) throws NotFoundException;

    Value get(Key key) throws NotFoundException;
}
