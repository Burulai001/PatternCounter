package patterns;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    @DisplayName("Document contains at least 3 words")
    void validateDocumentAtLeast3Word() {
        List<String> document = List.of("   1000 a ", "  big  ");
        assertDoesNotThrow(()-> new Counter(null).validateDocument(document));
    }
    @Test
    @DisplayName("Document does not contain at least 3 words")
    void validateDocumentLessThan3Word() {
        List<String> document = List.of("  1000   a ");
        Exception exception = assertThrows(IllegalArgumentException.class, ()->new Counter(null).validateDocument(document));
        assertEquals("Document should contain at least 3 words", exception.getMessage());
    }
}