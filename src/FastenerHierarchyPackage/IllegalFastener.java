package FastenerHierarchyPackage;

/*
 * This class is an exception and uses super to explain to the user the reason for the exception.
 */
public class IllegalFastener extends Exception {

    private static final long serialVersionUID = -3290182699990000050L;

    public IllegalFastener(String message) {

        super(message);

    }

} //end of IllegalFastener.
