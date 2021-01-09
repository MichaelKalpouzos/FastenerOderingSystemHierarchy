package FastenerHierarchyPackage;

import java.io.Serializable;

// This is the class used to create the new nails and store them.
public final class NailDesigns implements Serializable {

    private static final long serialVersionUID = -67532443524515L;

    public static class CommonNailLengths implements Serializable {
        private static final long serialVersionUID = -7890887872273330422L;
        private float nailLength;
        private CommonNailLengths(float length) { this.nailLength = length; }
        public static final CommonNailLengths L2 = new CommonNailLengths(2.0f);
        public static final CommonNailLengths L2_5 = new CommonNailLengths(2.5f);
        public static final CommonNailLengths L3 = new CommonNailLengths(3.0f);
        public static final CommonNailLengths L3_25 = new CommonNailLengths(3.25f);
        public static final CommonNailLengths L3_5 = new CommonNailLengths(3.5f);
        public static final CommonNailLengths L6 = new CommonNailLengths(6.0f);
        public String toString() { return "" + nailLength; }
    }

    public static class CommonNailSizes implements Serializable {
        private static final long serialVersionUID = -991082273923923562L;
        private String nailSize;
        private CommonNailSizes(String size) { this.nailSize = size; }
        public static final CommonNailSizes S6D = new CommonNailSizes("6D");
        public static final CommonNailSizes S8D = new CommonNailSizes("8D");
        public static final CommonNailSizes S10D = new CommonNailSizes("10D");
        public static final CommonNailSizes S12D = new CommonNailSizes("12D");
        public static final CommonNailSizes S16D = new CommonNailSizes("16D");
        public static final CommonNailSizes S60D = new CommonNailSizes("60D");
        public String toString() { return "" + nailSize; }
    }

    public static class CommonNailGauges implements Serializable {
        private static final long serialVersionUID = -94827688978088109L;
        private float nailGauge;
        private CommonNailGauges(float gauge) { this.nailGauge = gauge; }
        public static final CommonNailGauges G2 = new CommonNailGauges(2.0f);
        public static final CommonNailGauges G8 = new CommonNailGauges(8.0f);
        public static final CommonNailGauges G9 = new CommonNailGauges(9.0f);
        public static final CommonNailGauges G10_25 = new CommonNailGauges(10.25f);
        public static final CommonNailGauges G11_5 = new CommonNailGauges(11.5f);
        public String toString() { return "" + nailGauge; }
    }

} // end NailDesigns