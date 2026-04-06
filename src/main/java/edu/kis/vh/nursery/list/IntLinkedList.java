package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentuje listę powiązanąprzechowującą liczby całkowite
 * Pozwala ona na usuwanie i dodawanie elementów z końca listy
 * Wykorzystuje klasę Node jako listę dwukierunkową
 */
public class IntLinkedList {
    /**
     * Wartość zwraca w przypadku operacji na pustej liście
     */
    private static final int DEFAULT_RETURN_VALUE = -1;
    /**
     * Referencja do ostatniego elementu listy
     */
    private Node last;

    /**
     * Metoda dodaje nowy element na koniec listy
     * @param i wartość która ma zostać dodana
     */
    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Metoda służąca do sprawdzania czy lista jest pusta
     * @return true, jeśli lista nie zawiera elementów, false jeśli zawiera
     */
    private boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy lista jest pełna
     * @return false, ponieważ w tej implementacji nie ma ograniczeń na ilość elementów
     */
    private boolean isFull() {
        return false;
    }

    /**
     * Zwraca ostatnią wartość z listy bez jego usuwania
     * @return Ostatnią wartość z listy, w przypadku gdy lista jest pusta zwraca DEFAULT_RETURN_VALUE
     */
    private int top() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        return last.getValue();
    }

    /**
     * Zwraca ostatnią wartość z listy i ją z niej usuwa
     * @return Ostatnią wartość z listy, w przypadku gdy lista jest pusta zwraca DEFAULT_RETURN_VALUE
     */
    private int pop() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;

        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}

/**
 *  Klasa reprezentuje pojedyńczy węzeł w strukturze danych.
 *  Przechowuje ona wartość int w węźle oraz referencje na następny i poprzedni węzeł.
 */
class Node {
    /**
     * Wartość którą przechowuje aktualny węzeł
     */
    private final int value;
    /**
     * Referencja na poprzedni węzeł.
     */
    private Node prev;
    /**
     * Referencja na następny węzeł.
     */
    private Node next;

    /**
     * Konstruktor który tworzy nowy węzeł z wartością.
     * @param i wartość jaka ma być ustawiona w węźle.
     */
    protected Node(int i) {
        value = i;
    }

    /**
     * Metoda służy do zwracania wartości przechowywanej w węźle.
     * @return wartość int przechowywaną w węźle
     */
    public int getValue() {
        return value;
    }

    /**
     * Metoda służy do zwracania referencji do poprzedniego węzła
     * @return poprzedni węzeł
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Metoda służy do ustawienia referencji do poprzedniego węzła
     * @param prev węzeł, który ma być ustawiony jako poprzedni
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Metoda służy do zwracania referencji do następnego węzła
     * @return następny węzeł
     */
    public Node getNext() {
        return next;
    }

    /**
     * Metoda służy do ustawienia referencji do następnego węzła
     * @param next węzeł, który ma być ustawiony jako następny
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
