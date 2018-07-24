package jithu.bagcomparison;

import common.BagFactory;
import common.BagUtil;
import common.IBag;

public class Main {
    private static final int BAG_SIZE = 5;

    public static void main(String[] args) {

        // Step 1 - Create 3 bags of size 5
        IBag<String> bag1 = BagFactory.createStringBag(BAG_SIZE);
        IBag<String> bag2 = BagFactory.createStringBag(BAG_SIZE);
        IBag<String> bag3 = BagFactory.createStringBag(BAG_SIZE);

        // Step 2 - Initialize 5
        BagFactory.initializeBag(bag1, "A", "B", "C", "D", "E");
        BagFactory.initializeBag(bag2, "D", "E","F","G","H");

        // Step 3 - Check and drop operation
        BagUtil.CheckAndDrop(bag1, bag2, bag3);
        System.out.println(bag3.toString());
    }
}
