package patterns;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UniquePhrase implements FindPatternStrategy {

    @Override
    public Map<String, Integer> findPattern(List<String> input) {

//        System.out.println(this.getClass().getName());
        Map<String, Integer> phraseCount = new LinkedHashMap<>(); // map to store phrase count

        for (String line : input) {
            String[] tokens = line.split("\\s+"); // split line into tokens by whitespace
            for (int i = 0; i < tokens.length - 2; i++) {
                String phrase = tokens[i] + " " + tokens[i + 1] + " " + tokens[i + 2]; // build phrase
                int count = phraseCount.getOrDefault(phrase, 0); // get current count or default to 0
                phraseCount.put(phrase, count + 1); // increment count and put in map
            }
        }
        return phraseCount;
    }
}
