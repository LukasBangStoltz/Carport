package FunctionLayer;

public class RoofType {

    private int roofId;
    private String name;

    public RoofType(int roofId, String name) {
        this.roofId = roofId;
        this.name = name;
    }

    public int getRoofId() {
        return roofId;
    }

    public void setRoofId(int roofId) {
        this.roofId = roofId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
