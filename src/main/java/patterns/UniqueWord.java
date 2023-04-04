package patterns;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UniqueWord implements FindPatternStrategy {

    @Override
    public Map<String, Integer> findPattern(List<String> input) {

//        System.out.println(this.getClass().getName());

        String[] words = String.join(" ", input)
                .replaceAll("\\d+", "").trim().split("\\s+");
        System.out.println("words for unique word = " + Arrays.toString(words));
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}
