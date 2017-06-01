/**
 * Created by Konrad on 2017-05-18.
 */

/**
 * Wzorzec projektowy "Fasada" jest często używany, kiedy system jest bardzo złożony i ciężki do zrozumienia
 * przez wiele wzajemnie zależnych ze sobą klas lub, kiedy nie posiadamy kodu źródłowego projektu. Wzorzec ten ukrywa
 * złożoność systemu i udostępnia prosty interfejs klientowi.
 *
 * <p>
 *     W Tym przypadku używamy {@link DwarvenGoldmineFacade}, czyli symulujemy pracę krasnoludów w kopalni.
 * </p>
 */
public class App {
    /**
     *
     * @param args parametry main
     */
    public static void main(String[] args) {
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
