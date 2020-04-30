package FunctionLayer;

public class  PlankMaterial {

    private String materialName;
    private String materialDescription;
    private int materialLength;
    private int materialId;

    public PlankMaterial(String materialName, String materialDescription, int materialLength, int materialId) {
        this.materialName = materialName;
        this.materialDescription = materialDescription;
        this.materialLength = materialLength;
        this.materialId = materialId;
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

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }
}
