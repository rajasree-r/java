package jithu.abstraction.arrays;

import common.IBag;
import jithu.abstractjava.arrays.Bag;

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
        assertEquals(1, bag.getCurrentSize());
        assertEquals(true, bag.add("B"));
        assertEquals(2, bag.getCurrentSize());
        assertEquals(false, bag.add("C"));
        assertEquals(2, bag.getCurrentSize());
        assertEquals(false, bag.add("D"));
        assertEquals(2, bag.getCurrentSize());

        IBag<String> bag2 = new Bag(null);
        assertEquals(false, bag2.add("A"));
    }


    @Test
    public void getCurrentSize(){
        IBag<String> bag = new Bag(new String[2]);
        assertEquals(0, bag.getCurrentSize());
        bag.add("A");
        assertEquals(1, bag.getCurrentSize());
        bag.add("B");
        assertEquals(2, bag.getCurrentSize());
        bag.remove();
        assertEquals(1, bag.getCurrentSize());
    }

    @Test
    public void remove(){
        IBag<String> bag = new Bag(new String[0]);
        assertEquals(null, bag.remove());

        IBag<String> bag2 = new Bag(new String[1]);
        assertEquals(null, bag2.remove());
        assertEquals(true, bag2.add("A"));
        assertEquals("A", bag2.remove());

    }
}
