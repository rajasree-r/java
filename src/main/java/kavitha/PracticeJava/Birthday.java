package kavitha.PracticeJava;

import javax.print.DocFlavor;

public class Birthday {
    public static void main(String[] args) {
        String bDay="04/29/2016";
        String sMonth= bDay.substring(0,2);
        String sDay= bDay.substring(3,5);
        String sYear= bDay.substring(6,10);
        System.out.println("The month is "+sMonth);
        System.out.println("The day is "+sDay);
        System.out.println("The year is "+sYear);
    }
}
