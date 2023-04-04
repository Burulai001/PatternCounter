package output;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import patterns.UniqueWord;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SeparatorWithCommaTest {

    @Test
    @DisplayName("Should display result with valid format")
    void formatTest() {
        Map<String, Integer> input = new LinkedHashMap<>();
        input.put("key1", 5);
        input.put("key2", 10);
        String expected = "key1, 5\n" +
                "key2, 10\n";

        assertEquals(expected, new SeparatorWithComma().format(input));
    }
}