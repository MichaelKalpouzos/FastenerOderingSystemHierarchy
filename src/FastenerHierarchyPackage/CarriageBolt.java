package FastenerHierarchyPackage;

/*
 * This class extends the Bolt class.
 * This class is called on by the fastener order system class and is used when ordering a carriage bolt.
 */
public class CarriageBolt extends Bolt{

    CarriageBolt(double length, Threads DThread, Materials.ThreadedMaterials materials, Finishes.BoltFinish finish, double unitPrice, int numberPerUnit) throws IllegalFastener {

        super(length, DThread, materials, finish, unitPrice, numberPerUnit);

    }
} // end of CarriageBolt.
