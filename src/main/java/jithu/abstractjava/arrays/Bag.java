package jithu.abstractjava.arrays;

import jithu.abstractjava.common.IBag;

import java.util.Arrays;

public class Bag<T> implements IBag<T> {
    private T[] mElements;
    private int mCurrentElementIndex;

    public Bag(T[] elements) {
        mElements = elements;
    }

    @Override
    public int getCurrentSize() {
        return mCurrentElementIndex;
    }

    @Override
    public boolean isEmpty() {
        return mElements.length == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (mCurrentElementIndex < mElements.length) {
            mElements[mCurrentElementIndex] = newEntry;
            mCurrentElementIndex++;
            return true;
        }
        return false;
    }

    @Override
    public T remove() {
        T currentElement = mElements[mCurrentElementIndex];
        mCurrentElementIndex--;
        return currentElement;
    }

    @Override
    public boolean remove(T anEntry) {
        for (int i = 0; i < mElements.length; i++) {
            if (mElements[i].equals(anEntry)) {
                mElements[i] = mElements[mCurrentElementIndex];
                mCurrentElementIndex--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < mElements.length; i++) {
            mElements[i] = null;
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (int i = 0; i < mElements.length; i++) {
            if (mElements[i].equals(anEntry)) {
                frequency++;
            }
        }
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < mElements.length; i++) {
            if (mElements[i].equals(anEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] newElements = (T[]) new Object[mCurrentElementIndex];
        for (int i = 0; i < mCurrentElementIndex; i++) {
            newElements[i] = mElements[i];
        }
        return newElements;
    }

    @Override
    public String toString() {
        return Arrays.toString(mElements);
    }
}
