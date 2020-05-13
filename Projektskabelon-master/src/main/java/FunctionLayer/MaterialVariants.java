package FunctionLayer;

public class MaterialVariants {

    private int materialVariantsId;
    private int materialId;
    private int length;
    private int price;

    public MaterialVariants(int materialVariantsId, int materialId, int length, int price) {
        this.materialVariantsId = materialVariantsId;
        this.materialId = materialId;
        this.length = length;
        this.price = price;
    }

    public int getMaterialVariantsId() {
        return materialVariantsId;
    }

    public void setMaterialVariantsId(int materialVariantsId) {
        this.materialVariantsId = materialVariantsId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
