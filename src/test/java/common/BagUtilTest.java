package common;

import org.junit.Assert;
import org.junit.Test;

public class BagUtilTest {

    @Test
    public void checkAndDrop() {
        IBag<String> bag1 = BagFactory.createStringBag(5);
        IBag<String> bag2 = BagFactory.createStringBag(5);
        IBag<String> bag3 = BagFactory.createStringBag(5);

        BagFactory.initializeBag(bag1, "A", "B", "C");
        BagFactory.initializeBag(bag2, "A", "B");
        BagUtil.CheckAndDrop(bag1, bag2, bag3);

        Assert.assertEquals("C", bag3.remove());

    }
}
