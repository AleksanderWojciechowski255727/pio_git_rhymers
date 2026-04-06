package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Klasa odpowiada za tworzenie nowych implementacji obiektów typu CountingOutRhymer
 * Pozwala na używanie stosu zwykłego, FIFO(first in, first out), Hanoi lub "fałszywego"
 */
public class DefaultRhymersFactory implements RhymersFactory {

    /**
     * Metoda służąca do zwracania normalnego stosu
     * @return nowa instancja DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }
    /**
     * Metoda służąca do zwracania fałszywego stosu
     * W tym przypadku jest to taki sam obiekt jak stos normalny
     * @return nowa instancja DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }
    /**
     * Metoda służąca do zwracania stosu FIFO(first in, first out)
     * @return nowa instancja FIFORhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }
    /**
     * Metoda służąca do zwracania stosu Hanoi
     * @return nowa instancja HanoiRhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
