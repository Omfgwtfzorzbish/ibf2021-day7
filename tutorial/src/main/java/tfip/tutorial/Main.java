package tfip.tutorial;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LineItem> lineItems = new LinkedList<>();
        lineItems.add(new LineItem("Apple"));
        lineItems.add(new LineItem("Orange"));
        lineItems.add(new LineItem("Pear"));
        
        
        //lineItems.foreach (li ->li.print());
        //lineItems.forEach(LineItem::print);
        MyInterface2 mif = (s) -> (s).length();
        MyInterface2 mif2 = String::length;

    }
}
