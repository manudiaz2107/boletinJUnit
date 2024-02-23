package boletinJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestOperadorAritmetico {

    @Test
    public void testSuma() {
        assertEquals(5, OperadorAritmetico.suma(2, 3));
    }

    @Test
    public void testDivision() throws Exception {
        assertEquals(2, OperadorAritmetico.division(6, 3));
    }

    @Test
    public void testDivisionByZero() throws Exception {
        OperadorAritmetico.division(6, 0);
    }
}
