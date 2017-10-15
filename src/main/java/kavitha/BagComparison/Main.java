package kavitha.BagComparison;
public class Main {
    public static void main(String[] args) {
        ArrayBag<String> str1 = new ArrayBag<>(10);
        ArrayBag<String> str2 = new ArrayBag<>(10);
        ArrayBag<String> str3 = new ArrayBag<>(10);
        str1.add("A");
        str1.add("B");
        str1.add("C");
        str1.add("E");
        str1.add("D");
        str2.add("A");
        str2.add("F");
        str2.add("G");
        str2.add("H");
        str2.add("I");
        System.out.println("Items of bag1");
        str1.display();
        System.out.println(" ");
        System.out.println("Items of bag2");
        str2.display();
        // str3.add(str1.getCurrentValue());
        // str3.add(str1.getCurrentValue());
        // str3.add(str1.getCurrentValue());
        // str3.display();
        out1:   for (int i = 0; i <= str1.getCurrentSize(); i++) {
            String s = str1.getCurrentValue();
            out:
            for (int j = 0; j <= str2.getCurrentSize(); j++) {
                String s1;
                //s1 = str1.getCurrentValue();
                s1 = str2.getCurrentValue();
                if (s == s1) {
                    str1.remove();
                    // s = null;
                    // break out;
                } else {
                    break out;
                    // str3.add(str1.getCurrentValue());
                }
                break out1;

            }

            str3.add(str1.getCurrentValue());
        }
        //str3.add(str1.getCurrentValue());
        System.out.println("The bag3");
        str3.display();
    }


}


