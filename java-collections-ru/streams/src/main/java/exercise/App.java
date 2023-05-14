package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    public static Integer getCountOfFreeMails(List<String> emailsList) {
        Integer freeDomainsNumber = emailsList.stream()
                .filter(str -> str.contains("@gmail.com") || str.contains("@yandex.ru") || str.contains("hotmail.com"))
                    .count();
            return freeDomainsNumber;
        }
    }
// END
