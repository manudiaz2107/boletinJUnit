package boletinJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestPila {

    @Test
    public void testPush() {
        Pila pila = new Pila();
        pila.push(5);
        assertFalse(pila.isEmpty());
    }

    @Test
    public void testPop() {
        Pila pila = new Pila();
        pila.push(5);
        assertEquals(5, (int) pila.pop());
        assertTrue(pila.isEmpty());
    }

    @Test
    public void testTop() {
        Pila pila = new Pila();
        pila.push(5);
        assertEquals(5, (int) pila.top());
        assertFalse(pila.isEmpty());
    }
}
