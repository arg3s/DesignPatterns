import java.util.stream.IntStream;

/**
 * Created by Konrad on 2017-05-23.
 */
public class Tests {
    public static void main(String[] args) {
        String word = "test string";
        StringBuilder stringBuilder = new StringBuilder(word);
        System.out.println(stringBuilder.reverse());
        IntStream intStream = stringBuilder.chars();
        intStream.forEach(System.out::println);
        System.out.println(intStream.toString());
        int x = 10;
        int y = new Tests().change(x);
        System.out.println(x+y);
    }

    public int change(int x){
        x = 12;
        return x;
    }
}
