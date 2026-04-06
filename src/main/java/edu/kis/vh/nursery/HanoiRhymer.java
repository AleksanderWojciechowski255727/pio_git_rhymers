package edu.kis.vh.nursery;
/**
 * Klasa rozszerza klasę DefaultCountingOutRhymer i implementuje specjalny stos, który odrzuca i zlicza wartości
 * Wartość jest odrzucana, jeśli jest większa od aktualnej wartości na końcu stosu
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     * Liczba odrzuconych wartości
     */
    private int totalRejected = 0;

    /**
     * Metoda która zwraca ilość odrzuconych wartości
     * @return ilość odrzuconych wartości
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Metoda która dodaje wartość do stosu.
     * Jeśli wartość jest większa od wartości na końcu stosu, to nie jest ona dodawana oraz zwiększany jest
     * licznik wartości odrzuconych
     * W przeciwnym wypadku jest ona normalnie dodawana na stos.
     * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
