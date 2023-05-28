package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, Object> difference = new LinkedHashMap<>();
        Set<String, Object> keys = new TreeSet<>(data1.keySet());
        keys.addAll(data2.keySet());

        for (String key : keys) {
            if (!data1.containsKey(key)) {
                difference.put(key, "added");
            } else if (!data2.containsKey(key)) {
                difference.put(key, "deleted");
            } else if (data1.get(key).equals(data2.get(key))) {
                difference.put(key, "unchanged");
            } else {
                difference.put(key, "changed");
            }
        }
        return difference;
    }
}
//END
