package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

/**
 * Klasa demonstrująca pokazująca działanie różnych typów stosów
 * Tworzy ona stos normalny, fałszywy, FIFO i Hanoi, dodaje do każdej z nich elementy a potem je wyświetla
 */
class RhymersDemo {
    /**
     * Punkt wejścia programu, tworzy fabrykę po czym wysyła ją do metody testRhymers
     * @param args argumenty wiersza poleceń
     */
    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();

        testRhymers(factory);

    }

    /**
     * Testuje działanie różnych rodzajów stosów
     * @param factory fabryka tworząca różne implementacje różnych stosów
     */
    private static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }

}