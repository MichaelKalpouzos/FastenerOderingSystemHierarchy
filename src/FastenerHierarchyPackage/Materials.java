package FastenerHierarchyPackage;

import java.io.Serializable;

// This class is used to make sure the materials inputted is a valid input.
public final class Materials implements Serializable {

    private static final long serialVersionUID = -329018422790000050L;

    public enum ThreadedMaterials {Brass, Stainless_Steel, Steel};

    public enum NailMaterials {Steel};

} // end Materials