package FunctionLayer;

/**
 * @author Kernen
 * Indeholder vores constructor til RoofTilt
 */

public class RoofTilt {

    private int roofTilt_id;
    private int roofTilt_degree;

    /**
     *
     * @param roofTilt_id
     * @param roofTilt_degree
     */
    public RoofTilt(int roofTilt_id, int roofTilt_degree) {
        this.roofTilt_id = roofTilt_id;
        this.roofTilt_degree = roofTilt_degree;
    }

    public int getRoofTilt_id() {
        return roofTilt_id;
    }

    public void setRoofTilt_id(int roofTilt_id) {
        this.roofTilt_id = roofTilt_id;
    }

    public int getRoofTilt_degree() {
        return roofTilt_degree;
    }

    public void setRoofTilt_degree(int roofTilt_degree) {
        this.roofTilt_degree = roofTilt_degree;
    }
}
