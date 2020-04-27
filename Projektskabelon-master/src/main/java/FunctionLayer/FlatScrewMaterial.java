package FunctionLayer;

public class FlatScrewMaterial {


    private String materialName;
    private String materialDescription;
    private int pcs;

    public FlatScrewMaterial(String materialName, String materialDescription, int pcs) {
        this.materialName = materialName;
        this.materialDescription = materialDescription;
        this.pcs = pcs;
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
}
