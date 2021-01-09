package FastenerHierarchyPackage;

/*
 * This class extends the InnerThread class.
 * This class is called on by the fastener order system class and is used when ordering a WingNut.
 */
public class WingNut extends InnerThreaded {

    WingNut(Threads diameter, Materials.ThreadedMaterials materials, Finishes.WingNutFinish finish, double unitPrice, int numberPerUnit) throws IllegalFastener {
        super(diameter, materials, finish, unitPrice, numberPerUnit);

    }

} //end of WingNut.