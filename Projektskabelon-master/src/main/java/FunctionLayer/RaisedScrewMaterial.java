package FunctionLayer;

public class RaisedScrewMaterial {

    private String materialName;
    private String materialDescription;
    private int pcs;
    private int materialId;

    public RaisedScrewMaterial(String materialName, String materialDescription, int pcs, int materialId) {
        this.materialName = materialName;
        this.materialDescription = materialDescription;
        this.pcs = pcs;
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

    public int getPcs() {
        return pcs;
    }

    public void setPcs(int pcs) {
        this.pcs = pcs;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }
}






