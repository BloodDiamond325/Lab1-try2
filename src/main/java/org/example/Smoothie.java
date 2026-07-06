import java.util.ArrayList;

public class Smoothie {

    // TO DO M4: static counter that drives auto-assigned order numbers
    private static int nextOrderNumber = 1;

    // TO DO M1: private instance fields
    //   name (String)
    //   size (String, "S" / "M" / "L")
    //   basePrice (double)
    //   isStudent (boolean)

    private String name;
    private String size;
    private double basePrice;
    private boolean isStudent;


    // TO DO M3: private ArrayList<String> addOns

    private ArrayList<String> addOns;

    // TO DO M4: private int orderNumber
    private int orderNumber;

    // TO DO M1: three-argument constructor.
    //   Set isStudent to false by default.
    //   Chain to the four-arg constructor with this(name, size, basePrice, false).
    public Smoothie(String name, String size, double basePrice) {
        //isStudent = false;
        this(name, size, basePrice, false);

    }

    // TO DO M1 + M3 + M4: four-argument constructor.
    //   - assign all four fields
    //   - initialise addOns to a new empty ArrayList<String>
    //   - assign orderNumber from nextOrderNumber, then increment nextOrderNumber
    public Smoothie(String name, String size, double basePrice, boolean isStudent) {

        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
        this.isStudent = isStudent;
        this.orderNumber = nextOrderNumber++;
        addOns = new ArrayList<String>();
    }

    // TO DO M1: getters
    public String getName()      { return name; }
    public String getSize()      { return size; }
    public double getBasePrice() { return basePrice;  }
    public boolean isStudent()   { return isStudent; }

    // TO DO M4: getter for orderNumber
    public int getOrderNumber()  { return orderNumber; }

    // TO DO M3: append the given add-on to the addOns list
    public void addAddOn(String addOn) {
        addOns.add(addOn);

    }

    // TO DO M2 + M3: pricing logic
    //   1. start with basePrice
    //   2. multiply by size factor (S=1.00, M=1.25, L=1.50)
    //   3. if isStudent, multiply by 0.90 (10% discount)
    //   4. add 2.00 per add-on
    //   5. round to 2 decimal places: Math.round(x * 100.0) / 100.0
    public double getPrice() {
        double price = basePrice;

        if(size.equals("S")){
            price = price + 1.00;
        }
        else if(size.equals("M")){
            price = price + 1.25;
        }
        else if(size.equals("L")){
            price = price + 1.50;
        }

        if(isStudent == true){
            price = price * 0.90;
        }

        price = price + 2.00 * addOns.size();

        price = Math.round((price * 100.0) / 100.0);

        return price;
    }

    // TO DO M5: one-line receipt.
    //   Exact format: "#003 [L] Mango Tango ........... $37.75 (student) +ginger +honey"
    //   - order number padded to 3 digits with leading zeros: "%03d"
    //   - size in brackets
    //   - " ........... " between name and price (one space, 11 dots, one space)
    //   - price formatted as $%.2f
    //   - drop "(student)" when not a student
    //   - append " +<addon>" for each add-on; nothing if there are no add-ons
    @Override
    public String toString() {

        StringBuilder receipt = new StringBuilder();

        receipt.append(String.format("#%03d", orderNumber));
        receipt.append(" [").append(size).append("] ").append(name);
        receipt.append(" ........... ");
        receipt.append(String.format("$%.2f", getPrice()));

        if (isStudent == true) {
           receipt.append(" (Student)");
        }

       for  (String addOn : addOns) {
           receipt.append(" +").append(addOn);
       }
       return receipt.toString();
    }
}
