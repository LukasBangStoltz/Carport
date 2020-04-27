package FunctionLayer;

public class MaterialFlat {

    private String materialName;
    private String materialDescribtion;
    private int materialLength;


    public MaterialFlat(String materialDescribtion, String materialName, int materialLength) {
        this.materialDescribtion = materialDescribtion;
        this.materialName = materialName;
        this.materialLength = materialLength;

    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialDescribtion() {
        return materialDescribtion;
    }

    public void setMaterialDescribtion(String materialDescribtion) {
        this.materialDescribtion = materialDescribtion;
    }

    public int getMaterialLength() {
        return materialLength;
    }

    public void setMaterialLength(int materialLength) {
        this.materialLength = materialLength;
    }



}