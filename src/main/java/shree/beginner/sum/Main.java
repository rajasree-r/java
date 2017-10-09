package shree.beginner.sum;

public class Main {
    public static void main(String[] args) {
        //Object instantiation - An instance variable is required to access Class memember methods
        Sum r = new Sum(); //like int rajashree = 10;

        //Accessing the method sum for adding 2 numbers in Sum class through its object (instance)
        System.out.println("Sum of 2 numbers : " + r.sum(10, 20)); //First part is for adding a text

        //Accessing the method sum for adding 3 numbers in Sum class through its object (instance)
        System.out.println("Sum of 3 numbers = " + r.sum(10, 20, 30));
    }
}
