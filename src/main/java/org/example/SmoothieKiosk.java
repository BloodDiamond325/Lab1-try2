import java.util.ArrayList;

public class SmoothieKiosk {

    // TO DO M6: private ArrayList<Smoothie> orders
    private ArrayList<Smoothie> orders;

    public SmoothieKiosk() {
        // TO DO M6: initialise the orders list to a new empty ArrayList<>()
       orders = new ArrayList<Smoothie>();
    }

   // orders = new ArrayList<Smoothie>;

    // TO DO M6: takeOrder — append s to the orders list
    public void takeOrder(Smoothie s) {
        orders.add(s);
    }

    // TO DO M6: orderCount — number of orders taken so far
    public int orderCount() {
        return orders.size();
    }

    // TO DO M6: totalRevenue — sum of every order's getPrice()
    public double totalRevenue() {
        double total = 0.0;
        for(Smoothie s: orders) {
            total += s.getPrice();
        }
        return total;
    }

    // TO DO M6: averagePrice — totalRevenue() / orderCount(), or 0.0 if no orders
    public double averagePrice() {
        if(orderCount() == 0) {return 0;}
        return totalRevenue() / orderCount();
    }

    // TO DO M6: print every order's toString() on its own line, in order
    public void printAllReceipts() {
        for (Smoothie s: orders) {
            System.out.println(s.toString());
        }
    }

    // TO DO M6: print three lines exactly
    //   "Orders taken: <n>"
    //   "Total revenue: $<total with 2 dp>"
    //   "Average price: $<avg with 2 dp>"
    public void printSummary() {
        System.out.println("Orders taken: " + orderCount());
        System.out.printf("Total revenue: $%.2f%n", totalRevenue());
        System.out.printf("Average price: $%.2f%n", averagePrice());
    }

    public static void main(String[] args) {

        SmoothieKiosk kiosk = new SmoothieKiosk();

        // TO DO M7: build the five orders from the table in the README:
        //   1. Mango Tango,     L, 25.00, student=true,  add-ons: ginger, honey
        //   2. Sorrel Punch,    M, 18.00, student=false, no add-ons
        //   3. Pineapple Bliss, S, 15.00, student=true,  no add-ons
        //   4. Coconut Cooler,  L, 22.00, student=false, add-ons: protein
        //   5. Soursop Storm,   M, 20.00, student=true,  add-ons: ginger
        // For orders with add-ons, call addAddOn(...) on the Smoothie BEFORE passing
        // it to kiosk.takeOrder(...).
        Smoothie s1 = new Smoothie("Mango Tango", "L", 25.00, true);
        s1.addAddOn("ginger");
        s1.addAddOn("honey");
        kiosk.takeOrder(s1);

        Smoothie s2 = new Smoothie("Sorrel Punch", "M", 18.00, false);
        kiosk.takeOrder(s2);

        Smoothie s3 = new Smoothie("Pineapple Bliss", "S", 15.00, true);
        kiosk.takeOrder(s3);

        Smoothie s4 = new Smoothie("Coconut Cooler", "L", 22.00, false);
        s4.addAddOn("protein");
        kiosk.takeOrder(s4);

        Smoothie s5 = new Smoothie("Soursop Storm", "M", 20.00, true);
        s5.addAddOn("ginger");
        kiosk.takeOrder(s5);

        // TO DO M7: print receipts, then a blank line, then the summary

        kiosk.printAllReceipts();
        System.out.println();
        kiosk.printSummary();

    }
}
