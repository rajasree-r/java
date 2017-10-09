package jithu.abstractjava.arrays;

import common.IBag;

/**
 * Created by aj on 10/2/17.
 */
public class Main {
    public static void main(String[] args) {
        //Object instantiation
        IBag<String> bagOfStrings = new Bag<>(new String[2]);
        bagOfStrings.add("A");
        bagOfStrings.add("B");
        System.out.println(bagOfStrings.toString());

        IBag<Integer> bagOfIntegers = new Bag<>(new Integer[2]);
        bagOfIntegers.add(2);
        System.out.println(bagOfIntegers.toString());
    }
}
