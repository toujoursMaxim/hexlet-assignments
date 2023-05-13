package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> criteria) {
        List<Map<String, String>> resultList = new ArrayList<>();

        for (Map<String, String> book : books) {
            boolean match = true;
            for (Map.Entry<String, String> serchBooks : criteria.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!book.containsKey(key) || !book.get(key).equals(value)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                resultList.add(book);
            }
        }

        return resultList;
    }
}
//END
