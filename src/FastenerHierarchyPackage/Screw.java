package FastenerHierarchyPackage;

/*
 * This class extends the Fastener class, returns the order cost.
 * This class has the screw method that extends to the WoodenScrew class.
 */
public class Screw extends Fastener {


    /*
     * This creates a variable for the screw's length, calls the Threads class for the
     * thread's diameter and calls the screw's for the head and drive from the ScrewDesigns class.
     */
    double ScrewLength;
    Threads diameterThread;
    ScrewDesigns.ScrewHeads screwHead;
    ScrewDesigns.ScrewDrive screwDrive;

    /*
     * This method shows what attributes a screw carries and throws an exception when the attributes are incorrect.
     */
    Screw(double length, Threads threads, Materials.ThreadedMaterials materials, Finishes.ScrewFinish finish, ScrewDesigns.ScrewHeads head, ScrewDesigns.ScrewDrive drive, ScrewDesigns.WoodScrewPoints point, double unitPrice, double numberPerUnit) throws IllegalFastener {
        super(materials, finish, unitPrice, numberPerUnit);
        this.ScrewLength = length;
        this.diameterThread = threads;
        this.screwHead = head;
        this.screwDrive = drive;

        if (finish == Finishes.ScrewFinish.Zinc){
            if (materials == Materials.ThreadedMaterials.Brass){
                throw new IllegalFastener("Illegal material and finish");
            }
        }

        else if (finish == Finishes.ScrewFinish.Chrome){
            if (materials == Materials.ThreadedMaterials.Stainless_Steel){
                throw new IllegalFastener("Illegal material and finish");
            }
        }

    }

    // This calculates and returns the order's cost.
    public double getOrderCost(int orderSize) {

        return orderSize*fastenerUnitPrice;

    } //end of getOrderCost.

} //end of Screw.


