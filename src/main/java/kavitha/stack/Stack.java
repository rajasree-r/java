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
        if (mIndex < MAX_SIZE) {
            mElements[mIndex] = newEntry;
            mIndex++;
            System.out.println(toString());
        }
    }

    @Override
    public T pop() {
        T temp = mElements[mIndex-1];
        mElements[mIndex--] = null;
        System.out.println(toString());
        return temp;
    }

    @Override
    public T peek() {
        return mElements[mIndex - 1];
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
