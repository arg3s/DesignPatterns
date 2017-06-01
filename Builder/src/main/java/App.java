/**
 * Chcemy zbudować obiekty {@link Building}, ale ich konstrukcja jest skomplikowana przez ilość parametrów, które {@link Building} potrzebuje.
 * Aby wspomóc użytkownika tworzymy klasę {@link Building.Builder}. {@link Building.Builder}
 * wymaga minimalną ilość parametrów, w tym przypadku tylko nazwę obiektu {@link Building} w swoim konstruktorze. Następnie możemy uzupełnić obiekt
 * {@link Building} dzięki interfejsowi {@link Building.Builder} o kolejne parametry. Kiedy użytkownik kończy "budować" swój {@link Building}
 * wywoływana jest metoda build(), która zwraca finałowy obiekt {@link Building}.
 */
public class App {
    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        Building building = new Building
                .Builder(Fundamentals.BETONOWE)
                .withWindows(Windows.PLASTIKOWE)
                .withWalls(Walls.BETON)
                .withRoof(Roof.BLACHA)
                .build();
        System.out.println(building.toString());
    }
}
