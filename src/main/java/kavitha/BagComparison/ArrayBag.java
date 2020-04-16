package kavitha.BagComparison;

public class ArrayBag<T> {
    private String[] mElements;
    private static final int MAX_SIZE=100;
    private int mIndex;
    private int mSize;
    public ArrayBag(int size) {
        mSize = size;
        mElements =new String[size];
    }
    public boolean add(String newEntry){
        if(mIndex<MAX_SIZE) {
            mElements[mIndex++] = newEntry;
            return true;
        }return  false;
    }
    public int getCurrentSize()
    {
        return mIndex;
    }
    public void display(){
        for(int i=0;i<mIndex;i++){
            System.out.println(mElements[i]);
        }
    }
    public String getCurrentValue(){
        String temp=mElements[--mIndex];
        return temp;
    }
    public String remove(){
        String temp=mElements[mIndex];
        mElements[mIndex]=null;
        --mIndex;
        return temp;
    }
}

