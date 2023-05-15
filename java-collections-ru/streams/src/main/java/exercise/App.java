package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    public static long getCountOfFreeEmails(List<String> emailsList) {
        long freeDomains = emailsList.stream()
                .filter(str -> str.contains("@yandex.ru") || str.contains("@gmail.com") || str.contains("hotmail.com"))
                .count();
        return freeDomains;
    }
}
// END
