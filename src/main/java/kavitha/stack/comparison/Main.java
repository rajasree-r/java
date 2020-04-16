package kavitha.stack.comparison;

import kavitha.stack.IStack;
import kavitha.stack.Stack;

public class Main {
    public static void main(String[] args) {
        IStack<String> stack1 = new Stack<>();
        stack1.push("Apple");
        stack1.push("Orange");

        IStack<String> stack2 = new Stack<>();
        stack2.push("Apple");
        stack2.push("Orange");

        System.out.println("Are stacks equivalent :"+StackComparator.areIdenticalStacks(stack1, stack2));
        System.out.println("stack1="+stack1.toString()+"; stack2="+stack2.toString());

        IStack<String> stack3 = new Stack<>();
        stack3.push("Apple");
        stack3.push("Orange");

        IStack<String> stack4 = new Stack<>();
        stack4.push("Orange");
        stack4.push("Apple");

        System.out.println("Are stacks equivalent :"+StackComparator.areIdenticalStacks(stack3, stack4));
        System.out.println("stack3="+stack3.toString()+"; stack4="+stack4.toString());

    }
}
