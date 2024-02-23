package boletinJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestFridge {


    @ParameterizedTest
    @ValueSource(strings = {"manzana", "plátano", "naranja"})
    public void testPut(String item) {
        Fridge fridge = new Fridge();

        assertTrue(fridge.put(item));
        assertTrue(fridge.contains(item));
    }


    @ParameterizedTest
    @MethodSource("provideItemsForTake")
    public void testTake(String item, boolean expectedException) {
        Fridge fridge = new Fridge();

        if (expectedException) {
            assertThrows(NoSuchItemException.class, () -> fridge.take(item));
        } else {
            fridge.put(item);
            assertDoesNotThrow(() -> fridge.take(item));
            assertFalse(fridge.contains(item));
        }
    }

    // Método fuente para testTake
    private static Stream<Arguments> provideItemsForTake() {
        return Stream.of(
            Arguments.of("manzana", false),
            Arguments.of("plátano", false),
            Arguments.of("inexistente", true)
        );
    }
}