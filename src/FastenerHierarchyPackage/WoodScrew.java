package FastenerHierarchyPackage;

/*
 * This class extends the Screw class.
 * This class is called on by the fastener order system class and is used when ordering a wood screw.
 */
public class WoodScrew extends Screw {

    // This calls on the screw design class to retrieve the screw point.
    ScrewDesigns.WoodScrewPoints screwPoint;

    WoodScrew(double length, Threads threads, Materials.ThreadedMaterials materials, Finishes.ScrewFinish finish, ScrewDesigns.ScrewHeads head, ScrewDesigns.ScrewDrive drive, ScrewDesigns.WoodScrewPoints point, double unitPrice, double numberPerUnit) throws IllegalFastener {
        super(length, threads, materials, finish, head, drive, point, unitPrice, numberPerUnit);
        this.screwPoint = point;
    }
} //end of WoodScrew