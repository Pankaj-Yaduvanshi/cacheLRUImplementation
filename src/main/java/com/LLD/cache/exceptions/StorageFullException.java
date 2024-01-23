package com.LLD.cache.exceptions;

public class StorageFullException extends RuntimeException {
    public StorageFullException(String s) {
        super(s);
    }
}
