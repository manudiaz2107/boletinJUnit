package boletinJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestFridge {

    @Test
    public void testPutAndContains() {
        Fridge fridge = new Fridge();
        assertTrue(fridge.put("Apple"));
        assertTrue(fridge.contains("Apple"));
    }

    @Test
    public void testTake() throws NoSuchItemException {
        Fridge fridge = new Fridge();
        fridge.put("Orange");
        fridge.take("Orange");
        assertFalse(fridge.contains("Orange"));
    }

    @Test
    public void testTakeNonExistingItem() throws NoSuchItemException {
        Fridge fridge = new Fridge();
        fridge.take("Banana");
    }
}