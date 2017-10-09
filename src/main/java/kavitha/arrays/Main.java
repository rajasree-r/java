package kavitha.arrays;

public class Main {
    public static void main(String[] args) {
        Bag<String> strBag=new Bag(10);
        Bag<Car> carBag=new Bag(10);
        carBag.add("Red");
        carBag.add("Black");
        carBag.add("Brown");
        carBag.add("Blue");
        carBag.add("Silver");
        strBag.add("A");
        strBag.add("B");
        strBag.add("C");
        strBag.add("C");
        System.out.println(strBag);
        System.out.println(carBag);
        strBag.replace("B");
        carBag.replace("Red");
        System.out.println(strBag);
        System.out.println(carBag);
        System.out.println("Current size of Car bag is: "+carBag.getCurrentSize());
        System.out.println("Current size of String bag is: "+strBag.getCurrentSize());
        System.out.println("The Car bag is empty: "+carBag.isEmpty());
        System.out.println("The String bag is empty: "+strBag.isEmpty());
        System.out.println("The frequency of car bag is: "+carBag.getFrequencyOf("Blue"));
        System.out.println("The frequency of string bag is: "+strBag.getFrequencyOf("C"));
        strBag.remove("C");
        carBag.remove("Red");
        //carBag.remove();
        //strBag.remove();
        strBag.contains("A");
        carBag.contains("Purple");
        System.out.println("The smallest in array is: "+carBag.getMin());
        System.out.println("The largest in array is: "+carBag.getMax());
        System.out.println("Removed smallest and the remaining array: "+carBag.removeMin());
        System.out.println("Removed largest value and the remaining array :"+ carBag.removeMax());
       // strBag.clear();
       // carBag.clear();
        String Arr[];
        Arr=carBag.toArray();
        System.out.println("New copied Array: ");
        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }
}
