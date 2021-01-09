package FastenerHierarchyPackage;

/*
 * This class extends the Fastener class, returns the order cost.
 * This class has the nail method that extends to the CommonNail class.
 */
public class Nail extends Fastener {

    // This calls the nail size, length and gauge from the NailDesigns class.
    NailDesigns.CommonNailSizes NailSize;
    NailDesigns.CommonNailLengths NailLength;
    NailDesigns.CommonNailGauges NailGauge;

    /*
     * This method shows what attributes a nail carries and throws an exception when the attributes are incorrect.
     */
    Nail(Finishes.CommonNailFinish finish, NailDesigns.CommonNailSizes size, NailDesigns.CommonNailLengths length, NailDesigns.CommonNailGauges gauge, double unitPrice, int numberPerUnit) throws IllegalFastener {
        super(Materials.NailMaterials.Steel, finish, unitPrice, numberPerUnit);
        this.NailSize = size;
        this.NailLength = length;
        this.NailGauge = gauge;
    }

    // This calculates and returns the order's cost.
    public double getOrderCost(int orderSize) {

        return orderSize*fastenerUnitPrice;

    } //end of getOrderCost.

} //end of Nail.