package kavitha.arrays;

import common.IBag;

public class Bag<T> implements IBag<String> {

    // private static final int MAX_SIZE = 50;
    private String[] mElements;
    private int mIndex;
    private int mSize;

    public Bag(int size) {
        mSize = size;
        mElements = new String[size];
    }

    @Override
    public int getCurrentSize() {
        return mIndex;
    }

    @Override
    public boolean isEmpty() {
        //ToDo statement use ternary operator
        // if (mIndex == 0){
        //     return true;
        //  }
        // return false;
       return mIndex==0?true:false;
    }


    @Override
    public boolean add(String newEntry) {
        if (mIndex < mSize) {
            mElements[mIndex++] = newEntry;
            return true;
        }
       return false;
    }

    @Override
    public String remove() {
        String temp = mElements[mIndex];
        mElements[mIndex] = null;
        return temp;
    }

    @Override
    public boolean remove(String anEntry) {
        for (int i = 0; i < mIndex; i++) {
            if (mElements[i] == anEntry) {
                mElements[i] = mElements[--mIndex];
                mElements[mIndex + 1] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        mElements[mIndex] = null;
        mElements =  new String [mSize];
    }

    @Override
    public int getFrequencyOf(String anEntry) {
        int count = 0;
        for (int i = 0; i < mIndex; i++) {
            if (mElements[i] == anEntry) {
                count++;
            }
        }
        return count;
    }


    @Override
    public boolean contains(String anEntry) {
        for (int i = 0; i < mIndex; i++) {
            if (mElements[i] == anEntry) {
                return true;
            }
        }
        return false;
    }

    public String replace(String anEntry) {
       mElements[mIndex-1]=anEntry;
        return mElements[mIndex];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < mIndex; i++) {
            stringBuilder.append(mElements[i] + "-");
        }
        return stringBuilder.toString();
    }

    public String getMin() {
        for (int i = 0; i < mIndex; i++) {
            for (int j=i+1;j < mIndex; j++) {
                if ((mElements[i].compareTo(mElements[j]))>0) {
                    String temp = mElements[i];
                    mElements[i] = mElements[j];
                    mElements[j] = temp;
                }
            }
        }
        return mElements[0];
    }
    public String getMax() {
        for (int i = 0; i < mIndex; i++) {
            for (int j=i+1;j < mIndex; j++) {
                if ((mElements[i].compareTo(mElements[j]))<0) {
                    String temp = mElements[i];
                    mElements[i] = mElements[j];
                    mElements[j] = temp;
                }
            }
        }
        return mElements[0];
    }
    public String removeMin(){
       String temp= getMin();
       mElements[0]=mElements[--mIndex];
       System.out.println(toString());
       return temp;
    }
    public String removeMax(){
        String temp= getMax();
        mElements[0]=mElements[--mIndex];
        System.out.println(toString());
        return temp;
    }
    @Override
    public String[] toArray() {
        String Temp[]=new String [mSize];
        for(int i=0;i<mIndex;i++){
            Temp[i]=mElements[i];
        }
        return Temp;
    }
}

