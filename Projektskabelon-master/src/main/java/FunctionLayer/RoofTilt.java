package FunctionLayer;

public class RoofTilt {

    private int roofTiltId;
    private int roofTiltDegree;

    public RoofTilt(int roofTiltId, int roofTiltDegree) {
        this.roofTiltId = roofTiltId;
        this.roofTiltDegree = roofTiltDegree;
    }

    public int getRoofTiltId() {
        return roofTiltId;
    }

    public void setRoofTiltId(int roofTiltId) {
        this.roofTiltId = roofTiltId;
    }

    public int getRoofTiltDegree() {
        return roofTiltDegree;
    }

    public void setRoofTiltDegree(int roofTiltDegree) {
        this.roofTiltDegree = roofTiltDegree;
    }
}
