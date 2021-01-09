package FastenerHierarchyPackage;


/*
* This class extends the Fastener class, returns the order cost.
* This class has the bolt method that extends to the CarriageBolt class.
*/
class Bolt extends Fastener {

    private static final long serialVersionUID = -329018262790329050L;

    //This creates the length variable and calls the thread from the Threads class.
    Threads diameterThread;
    double boltLength;


    /*
    * This method shows what attributes a bolt carries and throws an exception when the attributes are off or lengths are incorrect.
     */
    Bolt(double length, Threads DThread, Materials.ThreadedMaterials materials, Finishes.BoltFinish finish, double unitPrice, int numberPerUnit) throws IllegalFastener {

        super(materials, finish, unitPrice, numberPerUnit);

        this.boltLength = length;
        this.diameterThread = DThread;

        if ((length != 12.0) && (length != 1.0) && (length != 0.75)){
            throw new IllegalFastener("Length is illegal");
        }
    }

    /*
    * This method returns the cost of the order.
     */
    public double getOrderCost(int orderSize) {

        return orderSize*fastenerUnitPrice;

    } //end of getOrderCost.

}//end of Bolt.
