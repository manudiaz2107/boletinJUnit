package boletinJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestSubscripcion {

    @Test
    public void testPrecioPorMes() {
        Subscripcion subscripcion = new Subscripcion(1200, 12);
        assertEquals(100.0, subscripcion.precioPorMes(), 0.001);
    }

    @Test
    public void testCancel() {
        Subscripcion subscripcion = new Subscripcion(1200, 12);
        subscripcion.cancel();
        assertEquals(0, subscripcion.precioPorMes(), 0.001);
    }
}
