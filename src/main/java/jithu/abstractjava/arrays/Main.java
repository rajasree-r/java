package jithu.abstractjava.arrays;

import jithu.abstractjava.common.IBag;

/**
 * Created by aj on 10/2/17.
 */
public class Main {
    public static void main(String[] args) {
        //Object instantiation
        IBag<String> bagOfStrings = new Bag<>(new String[20]);

        bagOfStrings.add("A");
        bagOfStrings.add("B");
        System.out.println(bagOfStrings.toString());

    }
}
