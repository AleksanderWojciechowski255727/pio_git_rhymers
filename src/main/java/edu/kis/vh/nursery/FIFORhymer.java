package edu.kis.vh.nursery;

/**
 * Klasa rozszerza klasę DefaultCountingOutRhymer
 * Elementy dodawane są normalnie, ale zwracane są nie od końca, tylko od początku
 */
public class FIFORhymer extends DefaultCountingOutRhymer {
    /**
     * Tymczasowa struktura do odwracania kolejności elementów
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Metoda służąca do zwrócenia pierwszego elemntu i usunięcia go
     * @return Pierwszy element struktury, bądż -1 w przypadku pustej struktury
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }

    /**
     * Metoda służąca do zwrócenia tymczasowej struktury do odwracania kolejności elementów
     * @return tymczasową strukturę służącą do odwracania kolejności elementów
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
