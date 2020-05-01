package FunctionLayer;

public class MaterialVariants {

    private int materialVariants_id;
    private int material_id;
    private int length;
    private int price;

    public MaterialVariants(int materialVariants_id, int material_id, int length, int price) {
        this.materialVariants_id = materialVariants_id;
        this.material_id = material_id;
        this.length = length;
        this.price = price;
    }

    public int getMaterialVariants_id() {
        return materialVariants_id;
    }

    public void setMaterialVariants_id(int materialVariants_id) {
        this.materialVariants_id = materialVariants_id;
    }

    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
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
