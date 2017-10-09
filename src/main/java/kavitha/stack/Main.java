package kavitha.stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> strStack=new Stack();
        strStack.push("A");
        strStack.push("B");
        strStack.push("C");
        strStack.pop();
       // System.out.println(strStack.pop());
        strStack.pop();
        System.out.println("Peeked value = "+strStack.peek());
        strStack.push("D");
        strStack.push("E");
        strStack.pop();
        Stack<Integer> intStack=new Stack();
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        System.out.println("Peeked value="+intStack.peek());
        intStack.pop();
        System.out.println("The stack is empty: "+intStack.isEmpty());
        intStack.clear();
        System.out.println(intStack.pop());
    }
}
