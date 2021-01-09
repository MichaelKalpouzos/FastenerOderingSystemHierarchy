package Assignment4;


/*
 * This class extends the Nail class.
 * This class is called on by the fastener order system class and is used when ordering a common nail.
 */

public class CommonNail extends Nail {

    CommonNail(NailDesigns.CommonNailSizes size, NailDesigns.CommonNailLengths length, NailDesigns.CommonNailGauges gauge, Finishes.CommonNailFinish finish, double UnitPrice, double NumberPerUnit) throws IllegalFastener {

        super(finish, size, length, gauge, UnitPrice, (int) NumberPerUnit);

    }
} //end of CommonNail.