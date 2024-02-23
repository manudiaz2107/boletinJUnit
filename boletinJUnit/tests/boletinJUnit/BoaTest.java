package boletinJUnit;

import static org.junit.Assert.assertEquals;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BoaTest {


    @ParameterizedTest
    @MethodSource("provideBoasForIsHealthy")
    public void testIsHealthy(Boa boa, boolean expectedResult) {
        assertEquals(expectedResult, boa.isHealthy());
    }


    @ParameterizedTest
    @MethodSource("provideBoasForFitsInCage")
    public void testFitsInCage(Boa boa, int cageLength, boolean expectedResult) {
        assertEquals(expectedResult, boa.fitsInCage(cageLength));
    }


    private static Stream<Arguments> provideBoasForIsHealthy() {
        return Stream.of(
            Arguments.of(new Boa("BoaSaludable", 8, "barras de chocolate"), true),
            Arguments.of(new Boa("BoaNoSaludable", 10, "ratones"), false)

        );
    }


    private static Stream<Arguments> provideBoasForFitsInCage() {
        return Stream.of(
            Arguments.of(new Boa("BoaPequeña", 6, "ratones"), 8, true),
            Arguments.of(new Boa("BoaGrande", 12, "conejos"), 10, false)
        );
    }
}