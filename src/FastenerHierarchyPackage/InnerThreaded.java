package FastenerHierarchyPackage;


/*
 * This class extends the Fastener class, returns the order cost.
 * This class has the Inner Threaded method that extends to the WingNut class.
 */
public class InnerThreaded extends Fastener {


    //This creates the price variable, amount of units variable and calls the thread from the Threads class.
    Threads wingNutDiameter;
    double unitPrice;
    double numPerUnit;


    /*
     * This method shows what attributes a InnerThreaded carries and throws an exception when the attributes are off
     * or an incorrect match-up of materials and finishes.
     */
    InnerThreaded(Threads diameter, Materials.ThreadedMaterials materials, Finishes.WingNutFinish finish, double unitPrice, int numberPerUnit) throws IllegalFastener {

        super(materials, finish, unitPrice, numberPerUnit);
        this.wingNutDiameter = diameter;

        if (finish == Finishes.WingNutFinish.Zinc){
            if (materials == Materials.ThreadedMaterials.Stainless_Steel){
                throw new IllegalFastener("Illegal material and finish");
            }
        }

        else if (finish == Finishes.WingNutFinish.Yellow_Zinc){
            if (materials == Materials.ThreadedMaterials.Brass){
                throw new IllegalFastener("Illegal material and finish");
            }
        }
    }

    // This calculates and returns the order's cost.
    public double getOrderCost(int orderSize) {

        return orderSize * unitPrice;

    } //end of getOrderCost.

} // end of InnerThreaded.
