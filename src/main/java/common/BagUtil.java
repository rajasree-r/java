package common;

/**
 * A utility class for all Bag operations
 */
public class BagUtil {

    /**
     * This method accepts 3 bags instances as parameters; say, firstBag, secondBag, thirdBag; And perform the operation
     * Pick each item from the first bag, put it in the third bag if it is not present in the second bag
     *
     * @param firstBag  the first bag from which pick operation has to be performed
     * @param secondBag the bag to which the first bag has to be compared
     * @param thirdBag  the bag to which first bag items are dropped if second bag does not contain the item
     */
    public static <T> void CheckAndDrop(IBag<T> firstBag, IBag<T> secondBag, IBag<T> thirdBag) {
        for (T item : firstBag.toArray()) {
            T firstBagItem = firstBag.remove();
            if (!secondBag.contains(firstBagItem)) {
                thirdBag.add(firstBagItem);
            }
        }
    }
}
