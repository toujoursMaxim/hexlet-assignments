package exercise;

import java.util.Arrays;
import java.utils.stream.Stream;

// BEGIN
pubcli class App {
public static String[][] enlargeArrayImage(String[][] image) {
        String[][] result = Arrays.stream(image)
                .map(row -> Arrays.stream(row)
                        .flatMap(symbol -> Stream.of(symbol, symbol))
                        .toArray(String[]::new))
                .flatMap(row -> Stream.of(row, row))
                .toArray(String[][]::new);
        return result;
    }
}
// END
