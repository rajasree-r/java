package jithu.abstractjava.arrays;

import jithu.abstractjava.common.IBag;

/**
 * Created by aj on 10/1/17.
 */
public class Bag<T> implements IBag<T> {

    private static final int MAX_SIZE = 10;
    private String i;
    private T[] mBag;
    private int mCurrentElementIndex;

    public Bag() {
        mBag = (T[]) new Object[MAX_SIZE];
    }

    @Override
    public int getCurrentSize() {
        return mBag.length;
    }

    @Override
    public boolean isEmpty() {
        return mBag.length == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (mCurrentElementIndex < mBag.length) {
            mBag[mCurrentElementIndex] = newEntry;
            mCurrentElementIndex++;
            return true;
        }
        return false;
    }

    @Override
    public T remove() {
        T currentElement = mBag[mCurrentElementIndex];
        mCurrentElementIndex--;
        return currentElement;
    }

    @Override
    public boolean remove(T anEntry) {
        for (int i = 0; i < mBag.length; i++) {
            if (mBag[i].equals(anEntry)) {
                mBag[i] = mBag[mCurrentElementIndex];
                mCurrentElementIndex--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < mBag.length; i++) {
            mBag[i] = null;
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (int i = 0; i < mBag.length; i++) {
            if (mBag[i].equals(anEntry)) {
                frequency++;
            }
        }
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < mBag.length; i++) {
            if (mBag[i].equals(anEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] newElements = (T[]) new Object[mCurrentElementIndex];
        for (int i = 0; i < mCurrentElementIndex; i++) {
            newElements[i] = mBag[i];
        }
        return newElements;
    }
}
