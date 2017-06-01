import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Concurrencies {
    private static final Logger LOGGER = LoggerFactory.getLogger(Concurrencies.class);
    private int size = 1000000;
    private List<String> strings = new ArrayList<>(size);

    public Concurrencies() {
        fillList();
    }

    public static void main(String[] args) {

        Concurrencies conc = new Concurrencies();

        long t0 = System.nanoTime();
        long cnt = conc.strings
                .stream()
                .sorted()
                .count();
        long t1 = System.nanoTime();
        long result = conc.getTime(t1, t0);
        LOGGER.info("Liczba posortowanych elementów stream(): "+cnt + " w czasie: " + result + "ms");
        ////////////////
        t0 = System.nanoTime();
        int suma = conc.strings.stream().mapToInt(String::hashCode).sum();
        t1 = System.nanoTime();
        result = conc.getTime(t1, t0);
        LOGGER.info("Suma stream(): "+suma + " w czasie: " + result + "ms");
        ////////////////
        t0 = System.nanoTime();
        long cnt2 = conc.strings.parallelStream().sorted().count();
        t1 = System.nanoTime();
        result = conc.getTime(t1, t0);
        LOGGER.info("Liczba posortowanych elementów parallelstream(): "+cnt2 + " w czasie: " + result + "ms");
        ////////////////
        t0 = System.nanoTime();
        int suma2 = conc.strings.parallelStream().mapToInt(String::hashCode).sum();
        t1 = System.nanoTime();
        result = conc.getTime(t1, t0);
        LOGGER.info("Suma parallelstream(): "+suma + " w czasie: " + result + "ms");

    }
    private void fillList() {
        for (int i = 0; i < size; i++) {
            UUID uuid = UUID.randomUUID();
            strings.add(uuid.toString());
        }
    }
    private long getTime(long t1, long t0){
        return TimeUnit.NANOSECONDS.toMillis(t1 - t0);
    }
}