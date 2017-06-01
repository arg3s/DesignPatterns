/**
 * Created by Konrad on 2017-05-18.
 */

/**
 * Singleton zapewnia, że w aplikacji istnieje tylko jedna instancja klasy {@link SingletonClass}
 * i dostarcza globalny dostęp do jej obiektu.
 * Wzorzec ten sprawdza się w przypadku stałych klas o jednym globalnym przeznaczeniu, np łączenie do
 * danej bazy danych.
 *
 */
public class App {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();

        System.out.println(singletonClass + ", " + singletonClass1);
    }
}
