import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Should not throw any exception with valid args")
    void validArgTest() {
        String[] args = {"input.txt", "UniqueWord"};
        assertDoesNotThrow( ()-> App.main(args));
    }

    @Test
    @DisplayName("Should throw an exception with invalid args")
    void invalidArgsTest() {
        String[] args = {""};
        String expectedMessage = "Usage: java -jar PatternCounter-1.0.jar <filename>, <PatternName> >> \n" +
                "Example  : java -jar PatternCounter-1.0.jar input.txt UniqueNumber";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> App.main(args),
                "Usage: java  <filename>, <PatternName> >> \nUsage: java -cp . App.java input.txt UniqueNumber");
        assertEquals(expectedMessage, exception.getMessage());
    }

}