/**
 * Created by Konrad on 2017-05-18.
 */
public class App {
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
