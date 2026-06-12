public class Smoothie {

    // TODO M4: static counter that drives auto-assigned order numbers
    private static int nextOrderNumber = 1;

    // TODO M1: private instance fields
    //   name (String)
    //   size (String, "S" / "M" / "L")
    //   basePrice (double)
    //   isStudent (boolean)


    // TODO M3: private ArrayList<String> addOns


    // TODO M4: private int orderNumber


    // TODO M1: three-argument constructor.
    //   Set isStudent to false by default.
    //   Chain to the four-arg constructor with this(name, size, basePrice, false).
    public Smoothie(String name, String size, double basePrice) {

    }

    // TODO M1 + M3 + M4: four-argument constructor.
    //   - assign all four fields
    //   - initialise addOns to a new empty ArrayList<String>
    //   - assign orderNumber from nextOrderNumber, then increment nextOrderNumber
    public Smoothie(String name, String size, double basePrice, boolean isStudent) {

    }

    // TODO M1: getters
    public String getName()      { return null; }
    public String getSize()      { return null; }
    public double getBasePrice() { return 0.0;  }
    public boolean isStudent()   { return false; }

    // TODO M4: getter for orderNumber
    public int getOrderNumber()  { return 0; }

    // TODO M3: append the given add-on to the addOns list
    public void addAddOn(String addOn) {

    }

    // TODO M2 + M3: pricing logic
    //   1. start with basePrice
    //   2. multiply by size factor (S=1.00, M=1.25, L=1.50)
    //   3. if isStudent, multiply by 0.90 (10% discount)
    //   4. add 2.00 per add-on
    //   5. round to 2 decimal places: Math.round(x * 100.0) / 100.0
    public double getPrice() {
        return 0.0;
    }

    // TODO M5: one-line receipt.
    //   Exact format: "#003 [L] Mango Tango ........... $37.75 (student) +ginger +honey"
    //   - order number padded to 3 digits with leading zeros: "%03d"
    //   - size in brackets
    //   - " ........... " between name and price (one space, 11 dots, one space)
    //   - price formatted as $%.2f
    //   - drop "(student)" when not a student
    //   - append " +<addon>" for each add-on; nothing if there are no add-ons
    @Override
    public String toString() {
        return "";
    }
}
