package edu.kis.vh.nursery;

/**
 * Klasa implementuje mechanizm przechowywania liczb w strukturze działającej jak stos
 */
public class DefaultCountingOutRhymer {
    /**
     * Maksymalna pojemność struktury
     */
    private static final int CAPACITY = 12;
    /**
     * Wartość oznaczająca pustą strukturę
     */
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    /**
     * Wartość zwracana w przypadku operacji na pustej strukturze
     */
    private static final int DEFAULT_RETURN_VALUE = -1;
    /**
     * Tablica przechowująca elementy
     */
    private final int[] numbers = new int[CAPACITY];
    /**
     * Indeks ostatniego elementu w strukturze
     */
    private int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Metoda odpowiada za dodanie eleemntu do struktury
     * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Metoda służy do sprawdzania, czy struktura jest pusta
     * @return true jeśli jest pusta, false jeśli nie jest
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Metoda służy do sprawdzania, czy struktura jest pełna
     * @return true jeśli jest pełna, false jeśli nie jest
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    /**
     * Metoda służy do zwrócenia ostatniej wartości ze struktury bez usuwania jej
     * @return ostatnią wartość, lub DEFAULT_RETURN_VALUE jeśli struktura jest pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }
    /**
     * Metoda służy do zwrócenia ostatniej wartości ze struktury i usunięcia jej
     * @return ostatnią wartość, lub DEFAULT_RETURN_VALUE jeśli struktura jest pusta
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

    /**
     * Metoda zwraca indeks ostatniego elementu struktury
     * @return indeks ostatniego elementu struktury
     */
    public int getTotal() {
        return total;
    }

    /**
     * Metoda służy do ustawienia nowego indeksu
     * @param total nowa wartość indeksu
     */
    public void setTotal(int total) {
        this.total = total;
    }
}