package FunctionLayer;

public class ConcretePart {

    private int carportPartId;
    private int materialId;

    public ConcretePart(int carportPartId, int materialId) {
        this.carportPartId = carportPartId;
        this.materialId = materialId;
    }

    public int getCarportPartId() {
        return carportPartId;
    }

    public void setCarportPartId(int carportPartId) {
        this.carportPartId = carportPartId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }
}
