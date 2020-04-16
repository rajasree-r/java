package kavitha.stack.comparison;

import kavitha.stack.IStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Class for comparing Stacks
 */
public class StackComparator {
    Stack<String> s = new Stack<>();

    public static <T> boolean areIdenticalStacks(IStack<T> stack1, IStack<T> stack2){ Object ob = new Object();
        List<T> stack1List = getListOfElementsFromStack(stack1);
        List<T> stack2List = getListOfElementsFromStack(stack2);
        if(stack1List.size() != stack2List.size()) {
            return false;
        }

        final int listSize = stack1List.size();
        for(int i=0; i < listSize; i++){
            if(!stack1List.get(i).equals(stack2List.get(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * Get stack content as a {@link List}
     * @param stack to be processed
     * @param <T> object type of stack content
     * @return {@link List} of elements
     */
    private static<T> List<T> getListOfElementsFromStack(final IStack<T> stack){
        List<T> stackContentList = new ArrayList<>();
        while(!stack.isEmpty()){
            stackContentList.add(stack.pop());
        }

        //Restoring Stack elements
        for(T element: stackContentList){
            stack.push(element);
        }

        return stackContentList;
    }

}
