package problem_04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class FileReaderVsInputStreamReaderTest {

    private static final String TEST_FILE = "src/main/resources/sample100mb.txt";

    @Test
    void testFileReaderPerformance() {
        assertDoesNotThrow(() -> DemoFileReader.checkPerformance(TEST_FILE));
    }

    @Test
    void testInputStreamReaderPerformance() {
        assertDoesNotThrow(() -> DemoInputStreamReader.checkPerformance(TEST_FILE));
    }
}
