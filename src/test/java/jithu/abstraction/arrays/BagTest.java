package jithu.abstraction.arrays;

import jithu.abstractjava.arrays.Bag;
import jithu.abstractjava.common.IBag;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by aj on 10/3/17.
 */
public class BagTest {

    @Test
    public void add() {
        IBag<String> bag = new Bag(new String[2]);
        assertEquals(true, bag.add("A"));
        assertEquals(true, bag.add("B"));
        assertEquals(false, bag.add("C"));
    }

//    @Test
//    public void getCurrentSize(){
//        IBag<String> bag = new Bag(new String[2]);
//        assertEquals(0, bag.getCurrentSize());
//        bag.add("A");
//        assertEquals(1, bag.getCurrentSize());
//        bag.add("B");
//        assertEquals(2, bag.getCurrentSize());
//        bag.remove();
//        assertEquals(1, bag.getCurrentSize());
//    }
}
