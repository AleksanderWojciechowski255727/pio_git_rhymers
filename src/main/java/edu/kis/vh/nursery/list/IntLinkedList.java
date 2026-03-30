package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int DEFAULT_RETURN_VALUE = -1;

    private Node last;
    private int size;

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        return last.value;
    }

    private int pop() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;

        int ret = last.value;
        last = last.prev;
        size--;
        return ret;
    }
}
