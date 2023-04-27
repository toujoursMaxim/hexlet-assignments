package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        if (sentence.length() == 0) {
            return wordCount;
        }

        for (String word : words) {
            int count = 0;
            for (String value : words) {
                if (word.equals(value)) {
                    count++;
                }
            }
            wordCount.put(word, count);
        }

        return wordCount;

    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{" + "\n");

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            sb.append("  " + pair.getKey() + ": " + pair.getValue() + "\n");
        }
        sb.append("}" + "\n");
        return sb.toString();
    }
}
//END
