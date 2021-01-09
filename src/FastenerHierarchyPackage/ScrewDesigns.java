package FastenerHierarchyPackage;

import java.io.Serializable;

// This class is used to make sure the input for the screw design is valid.
public final class ScrewDesigns implements Serializable {

    private static final long serialVersionUID = 3317801339281796211L;

    public enum ScrewDrive {Six_Lobe, Philips, Slotted, Square};

    public enum ScrewHeads {Bugle, Flat, Oval, Pan, Round};

    public enum WoodScrewPoints {Double_Cut, Sharp, Type_17};

}