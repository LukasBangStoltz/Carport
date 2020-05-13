package FunctionLayer;

public class RoofType {

    private int roof_id;
    private String name;

    public RoofType(int roof_id, String name) {
        this.roof_id = roof_id;
        this.name = name;
    }

    public int getRoof_id() {
        return roof_id;
    }

    public void setRoof_id(int roof_id) {
        this.roof_id = roof_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
