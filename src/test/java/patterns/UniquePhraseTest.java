package patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniquePhraseTest {

    @Test
    @DisplayName("Counts occurrences of each unique number for given list")
    void countUniquePhrases() {
        List<String> input = List.of("1000 a big surprise 2000 hello is a big surprise 1000");
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("1000 a big",1);
        expected.put("a big surprise",2);
        expected.put("big surprise 2000",1);
        expected.put("surprise 2000 hello",1);
        expected.put("2000 hello is",1);
        expected.put("hello is a",1);
        expected.put("is a big",1);
        expected.put("big surprise 1000",1);
        assertEquals(expected, new UniquePhrase().findPattern(input));
    }

}