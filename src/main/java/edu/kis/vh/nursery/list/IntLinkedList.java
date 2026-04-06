package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int DEFAULT_RETURN_VALUE = -1;

    private Node last;

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    private boolean isEmpty() {
        return last == null;
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
        return ret;
    }
}

class Node {

    private final int value;
    private Node prev;
    private Node next;

    protected Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
