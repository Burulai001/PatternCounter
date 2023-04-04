package patterns;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumber implements FindPatternStrategy {

    @Override
    public Map<Integer, Integer> findPattern(List<String> input) {

//        System.out.println(this.getClass().getName());

        Map<Integer, Integer> numberCount = new LinkedHashMap<>(); // map to store number count

        input.forEach(line -> {
            String[] tokens = line.replaceAll("\\D+", ",").split(","); // remove non-digits, split line into tokens by whitespace
            for (String token : tokens) {
                int number = Integer.parseInt(token); // parse token as integer
                int count = numberCount.getOrDefault(number, 0); // get current count or default to 0
                numberCount.put(number, count + 1); // increment count and put in map
            }
        });

        return numberCount;
    }
}
