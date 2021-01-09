package Assignment4;

import java.io.Serializable;

// Supplied for your use in Assignment 4.

public final class Finishes implements Serializable {

    private static final long serialVersionUID = 427384875663480L;

    public enum BoltFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};

    public enum WingNutFinish {Chrome, Hot_Dipped_Galvanized, Plain, Yellow_Zinc, Zinc};

    public enum CommonNailFinish {Bright, Hot_Dipped_Galvanized};

    public enum ScrewFinish {ACQ_1000_Hour, Zinc, Chrome, Black_Phosphate, Lubricated}

}