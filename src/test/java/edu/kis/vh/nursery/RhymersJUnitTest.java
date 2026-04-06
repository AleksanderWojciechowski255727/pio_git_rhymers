package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

/**
 * Zadaniem tej klasy jest testowanie poszczególnych metod z klasy DefaultCountingOutRhymer
 */
public class RhymersJUnitTest {
    // Projekt przechodzi testy jednostkowe

    /**
     * Metoda sprawdza poprawność działania metody countIn, odpowiadającej za dodawanie elementów do
     * stosu
     */
    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }
    /**
     * Metoda sprawdza poprawność działania metody callCheck, odpowiadającej za sprawdzanie, czy stos jest pusty
     */
    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }
    /**
     * Metoda sprawdza poprawność działania metody isFull, odpowiadającej za sprawdzanie, czy stos jest pełny
     */
    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }
    /**
     * Metoda sprawdza poprawność działania metody peekaboo, odpowiadającej za zwracanie wartości z końca
     * stosu bez usuwania jej
     */
    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }
    /**
     * Metoda sprawdza poprawność działania metody countOut, odpowiadającej za zwracanie wartości z końca
     * stosu i usunięcie jej
     */
    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
