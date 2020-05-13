package FunctionLayer;

public class Material {

    private int materialId;
    private String name;
    private String dimension;
    private String unit;

    public Material(int materialId, String name, String dimension, String unit) {
        this.materialId = materialId;
        this.name = name;
        this.dimension = dimension;
        this.unit = unit;


    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
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

