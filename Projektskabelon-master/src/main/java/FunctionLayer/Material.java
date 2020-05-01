package FunctionLayer;

public class Material {

    private int materialID;
    private String name;
    private String dimension;
    private String unit;

    public Material(int materialID, String name, String dimension, String unit) {
        this.materialID = materialID;
        this.name = name;
        this.dimension = dimension;
        this.unit = unit;
    }

    public int getMaterialID() {
        return materialID;
    }

    public void setMaterialID(int materialID) {
        this.materialID = materialID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
