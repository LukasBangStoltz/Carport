package FunctionLayer;

public class RaisedPlankMaterial {

    private String materialName;
    private String materialDescription;
    private int materialLength;

    public RaisedPlankMaterial(String materialName, String materialDescription, int materialLength) {
        this.materialName = materialName;
        this.materialDescription = materialDescription;
        this.materialLength = materialLength;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialDescription() {
        return materialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        this.materialDescription = materialDescription;
    }

    public int getMaterialLength() {
        return materialLength;
    }

    public void setMaterialLength(int materialLength) {
        this.materialLength = materialLength;
    }
}
