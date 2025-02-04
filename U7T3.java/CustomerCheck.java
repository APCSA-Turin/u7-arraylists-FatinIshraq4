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
        double price = 0;
        for (MenuItem item : check) {
            price+=item.getPrice();
        }
        return price;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        if (totalPrices()<40) {return false;}
        for (MenuItem item : check) {
            if (item.isDailySpecial()==true) {return false;}
        }
        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        double totalPrice = totalPrices();
        int customer = 0;
        if (couponApplies()==true) {totalPrice=totalPrice*0.75;}
        for (MenuItem item : check) {
        if (item.isEntree()==true) {customer++;}
        }
        if (customer>=6) {
            totalPrice+=totalPrices()*0.2;
        }
        return totalPrice;
    }
}
