package patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberTest {

    @Test
    @DisplayName("Counts occurrences of each unique number for given list")
    void countUniqueNumbers() {
        List<String> input = List.of("1000 a big surprise 2000 hello is a big surprise 1000");
        Map<Integer, Integer> expected = new LinkedHashMap<>();
        expected.put(1000,2);
        expected.put(2000,1);
        assertEquals(expected, new UniqueNumber().findPattern(input));
    }

}