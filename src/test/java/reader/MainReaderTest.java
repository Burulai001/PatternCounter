package reader;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainReaderTest {

    @Test
    @DisplayName("Should throw an exception with invalid file path")
    void readTest() {
        String path = "invalid.txt";
        Exception exception = assertThrows(RuntimeException.class, () -> new MainReader().read(path));
        assertEquals("Check if the file path is valid", exception.getMessage());
    }
}