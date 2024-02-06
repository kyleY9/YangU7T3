import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        double total = 0.0;
        for (MenuItem item : check) {
            total += item.getPrice();
        }
        return total;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        if (totalPrices() >= 40) {
            for (MenuItem item : check) {
                if (item.isDailySpecial()) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        double price = totalPrices();
        double discount = 0.0;
        double tip = 0.0;
        int customers = 0;

        for (MenuItem item : check) {
            if (item.isEntree()) {
                customers++;
            }
        }
        if (couponApplies()) {
            discount += (price*0.25)*-1;
        }
        if (customers >= 6) {
            tip += price*0.20;
        }


        price += discount + tip;
        return price;
    }
}