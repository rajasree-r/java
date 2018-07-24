package common;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A Factory class used to create {@link IBag} of type {@link String}
 */
public class BagFactoryTest {

    @Test
    public void createStringBag() {
        IBag<String> bag1 = BagFactory.createStringBag(5);
        assertNotEquals(null, bag1);
        assertEquals(0, bag1.getCurrentSize());
        assertThrows(IllegalArgumentException.class, () -> BagFactory.createStringBag(-1));
    }

    @Test
    public void initializeBag() {
        IBag<String> bag1 = BagFactory.createStringBag(5);
        BagFactory.initializeBag(bag1, "A");
        assertEquals(1, bag1.getCurrentSize());
    }
}
