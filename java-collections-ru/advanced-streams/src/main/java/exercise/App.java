package exercise;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String environmentVar) {
        return Stream.of(environmentVar.split("\n"))
                .filter(x -> x.startsWith("environment"))
                .map(x -> x.replaceAll("environment=", ""))
                .map(x -> x.replaceAll("\"", ""))
                .flatMap(s -> Stream.of(s.split(",")))
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
