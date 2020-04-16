package kavitha.stack;

public class Stack<T> implements IStack<T> {

    private static final int MAX_SIZE = 20;
    private T[] mElements;
    private int mIndex;

    public Stack() {
        mElements = (T[]) new Object[MAX_SIZE];
    }

    @Override
    public void push(T newEntry) {
        if (mIndex < MAX_SIZE - 1) {
            mElements[mIndex] = newEntry;
            mIndex++;
        }
    }

    @Override
    public T pop() {
        if(mIndex > 0) {
            T temp = mElements[mIndex - 1];
            mElements[mIndex--] = null;
            return temp;
        }
        return null;
    }

    @Override
    public T peek() {
        if(mIndex > 0) {
            return mElements[mIndex - 1];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return mIndex == 0;
    }

    @Override
    public void clear() {
        mElements = null;
        mElements = (T[])new Object[MAX_SIZE];
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<mIndex;i++) {
            stringBuilder.append(mElements[i]+"-");
        }
        return stringBuilder.toString();
    }
}
