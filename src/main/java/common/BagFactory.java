package common;

import jithu.abstractjava.arrays.Bag;
import org.jetbrains.annotations.NotNull;

/**
 * A Factory class used to create {@link IBag} of type {@link String}
 */
public class BagFactory {

    /**
     * Create {@link IBag} of type {@link String}
     *
     * @param size size of the bag to be created
     * @return String array of bags
     */
    public static IBag<String> createStringBag(int size) {
        if (size < 0 || size > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("size value should be > 0 and < Integer.MAX_VALUE");
        }
        return new Bag(new String[size]);
    }

    /**
     * Initialize {@link IBag}
     *
     * @param bag   of type {@link IBag}
     * @param value values with which the bag is initialized
     */
    public static <T> void initializeBag(@NotNull IBag<T> bag, @NotNull T... value) {
        for (T element : value) {
            bag.add(element);
        }
    }
}
