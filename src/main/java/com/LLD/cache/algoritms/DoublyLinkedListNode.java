package com.LLD.cache.algoritms;

import lombok.Getter;

@Getter
public class DoublyLinkedListNode<E> {
    DoublyLinkedListNode<E> next;
    DoublyLinkedListNode<E> prev;
    E element;
    public DoublyLinkedListNode(E element){
        this.next = null;
        this.prev = null;
        this.element = element;
    }
}
