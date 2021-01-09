package Assignment4;

import java.io.Serializable;

/*
 * This class is the main called on class and is the structure for all the fasteners that are available.
 * All different types of fasteners extend from this class and add-on different attributes,
 * but the attributes in the Fastener method are in all types of fasteners. This class also checks to
 * see if the money amount and amount of units being sold are in the boundaries set.
 */
public abstract class Fastener implements Serializable {

    // These are the attributes called on by the Fastener method to be used in the hierarchy.
    Enum<?> fastenerMaterials;
    Enum<?> fastenerFinish;
    double fastenerUnitPrice;
    double fastenerNumberPerUnit;


    //This method is the base case and implemented by all the other types of fasteners.
    Fastener(Enum<?> materials, Enum<?> finish, double unitPrice, double numberPerUnit) throws IllegalFastener {

        this.fastenerMaterials = materials;
        this.fastenerFinish = finish;
        setUnitPrice(unitPrice);
        setNumberPerUnit(numberPerUnit);

    } // end of Fastener.

    //This method makes sure the price is not an illegal amount.
    private void setUnitPrice(double unitPrice) throws IllegalFastener {

        if (unitPrice > 0) {

            this.fastenerUnitPrice = unitPrice;

        }
        else{

            throw new IllegalFastener("Illegal price of unit.");

        }
    } //end of setUnitPrice.

    // This method makes sure the amount of units is not an illegal amount.
    public void setNumberPerUnit(double numberPerUnit) throws IllegalFastener {

        if (numberPerUnit < 1 || numberPerUnit > 10000) {

            throw new IllegalFastener("Illegal number of units.");

        }
        else {

            this.fastenerNumberPerUnit = numberPerUnit;

        }
    } //end of setNumberPerUnit


    // This creates an abstract method that returns the cost of the order.
    public abstract double getOrderCost(int orderSize);

} //end of Fastener.
