package kavitha.StackComparison;
public class Main {
    public static void main(String[] args) {


        StackArray<String> sStack1 = new StackArray<>();
        StackArray<String> sStack2 = new StackArray<>();
        StackArray<String> sStack3 = new StackArray<>();
        StackArray<String> sStack4 = new StackArray<>();
        sStack1.push("Apple");
        sStack1.push("Orange");
        sStack1.push("Banana");
        sStack1.push("Kiwi");
        sStack2.push("Apple");
        sStack2.push("Mango");
        sStack2.push("Papaya");
        sStack2.push("Grapes");


        String a, b;
        a = sStack1.pop();
        b = sStack2.pop();
        out:   for (int i = 0; i < 5; i++) {
            if (a == b) {
                System.out.println("Stacks are same");
                sStack3.push(a);
                sStack4.push(a);
                a = sStack1.pop();
                b = sStack2.pop();
                sStack3.push(a);
                sStack4.push(b);
                break out;
            }
            else{
                System.out.println("Stacks are not same");
            }
            sStack1.push(sStack3.pop());
            sStack1.push(sStack3.pop());
            sStack1.push(sStack3.pop());
            sStack1.push(sStack3.pop());
            sStack2.push(sStack4.pop());
            sStack2.push(sStack4.pop());
            sStack2.push(sStack4.pop());
            sStack2.push(sStack4.pop());
            sStack1.peek();
            sStack2.peek();
        }
    }
}
