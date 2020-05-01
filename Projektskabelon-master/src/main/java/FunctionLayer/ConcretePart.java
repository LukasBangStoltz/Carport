package FunctionLayer;

public class ConcretePart {

    private int carportPart_id;
    private int material_id;

    public ConcretePart(int carportPart_id, int material_id) {
        this.carportPart_id = carportPart_id;
        this.material_id = material_id;
    }

    public int getCarportPart_id() {
        return carportPart_id;
    }

    public void setCarportPart_id(int carportPart_id) {
        this.carportPart_id = carportPart_id;
    }

    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }
}
