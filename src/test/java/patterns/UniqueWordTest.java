package patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordTest {

    @Test
    @DisplayName("Counts occurrences of each unique number for given list")
    void countUniqueWords() {
        List<String> input = List.of("1000 a big surprise 2000 hello is a big surprise 1000");
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("a",2);
        expected.put("big", 2);
        expected.put("surprise",2);
        expected.put("hello",1);
        expected.put("is", 1);

        assertEquals(expected, new UniqueWord().findPattern(input));
    }

}