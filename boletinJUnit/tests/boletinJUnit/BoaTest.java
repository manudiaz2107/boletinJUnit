package boletinJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class BoaTest {

    @Test
    public void testIsHealthy() {
        Boa healthyBoa = new Boa("HealthyBoa", 8, "granola bars");
        assertTrue(healthyBoa.isHealthy());
    }

    @Test
    public void testIsNotHealthy() {
        Boa unhealthyBoa = new Boa("UnhealthyBoa", 10, "mice");
        assertFalse(unhealthyBoa.isHealthy());
    }

    @Test
    public void testFitsInCage() {
        Boa smallBoa = new Boa("SmallBoa", 6, "mice");
        assertTrue(smallBoa.fitsInCage(8));
    }

    @Test
    public void testDoesNotFitInCage() {
        Boa largeBoa = new Boa("LargeBoa", 12, "rabbits");
        assertFalse(largeBoa.fitsInCage(10));
    }
}
