public class SmoothieKiosk {

    // TO DO M6: private ArrayList<Smoothie> orders


    public SmoothieKiosk() {
        // TO DO M6: initialise the orders list to a new empty ArrayList<>()
    }

    // TO DO M6: takeOrder — append s to the orders list
    public void takeOrder(Smoothie s) {

    }

    // TO DO M6: orderCount — number of orders taken so far
    public int orderCount() {
        return 0;
    }

    // TO DO M6: totalRevenue — sum of every order's getPrice()
    public double totalRevenue() {
        return 0.0;
    }

    // TO DO M6: averagePrice — totalRevenue() / orderCount(), or 0.0 if no orders
    public double averagePrice() {
        return 0.0;
    }

    // TO DO M6: print every order's toString() on its own line, in order
    public void printAllReceipts() {

    }

    // TO DO M6: print three lines exactly
    //   "Orders taken: <n>"
    //   "Total revenue: $<total with 2 dp>"
    //   "Average price: $<avg with 2 dp>"
    public void printSummary() {

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


        // TO DO M7: print receipts, then a blank line, then the summary

    }
}
