package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int DEFAULT_RETURN_VALUE = -1;

    private Node last;
    private int size;

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
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
        return last.getValue();
    }

    private int pop() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;

        int ret = last.getValue();
        last = last.getPrev();
        size--;
        return ret;
    }
}
