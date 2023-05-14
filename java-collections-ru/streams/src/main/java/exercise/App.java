package exercise;

import java.util.List;
// BEGIN
class App {

    public static long getCountOfFreeMails(List<String> emailsList) {
        List<String> freeDomainsNumber = List.of("@gmail.com", "@yandex.ru", "hotmail.com");
        return emailsList.stream()
                .map(emails -> emails.slpit("@")[1])
                .filter(emails -> emailsList.contains(emails))
                .count();
    }
}
// END
