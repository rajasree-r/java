package jithu.abstractjava.arrays;

import common.IBag;

import java.util.Arrays;

public class Bag<T> implements IBag<T> {
    private T[] mElements;
    private int mCurrentIndex = -1;

    public Bag(T[] elements) {
        mElements = elements;
    }

    @Override
    public int getCurrentSize() {
        return mCurrentIndex + 1;
    }

    @Override
    public boolean isEmpty() {
        return getCurrentSize() == 0;
    }

    @Override
    public boolean add(T newEntry) {

        if ( mElements != null && (mCurrentIndex + 1) < mElements.length ) {
            mElements[++mCurrentIndex] = newEntry;
            return true;
        }
        return false;
    }

    @Override
    public T remove() {
        if(getCurrentSize() > 0) {
            T currentElement = mElements[mCurrentIndex--];
            return currentElement;
        }
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        for (int i = 0; i < getCurrentSize(); i++) {
            if (mElements[i].equals(anEntry)) {
                if(i == mCurrentIndex){
                    mElements[i] = null;
                }else{
                    mElements[i] = mElements[mCurrentIndex];
                }
                mCurrentIndex--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < getCurrentSize(); i++) {
            mElements[i] = null;
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (int i = 0; i < getCurrentSize(); i++) {
            if (mElements[i].equals(anEntry)) {
                frequency++;
            }
        }
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < getCurrentSize(); i++) {
            if (mElements[i].equals(anEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] newElements = (T[]) new Object[getCurrentSize()];
        for (int i = 0; i < getCurrentSize(); i++) {
            newElements[i] = mElements[i];
        }
        return newElements;
    }

    @Override
    public String toString() {
        return Arrays.toString(mElements);
    }
}
