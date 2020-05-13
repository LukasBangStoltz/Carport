package FunctionLayer;

public class Part {

    private int quantity;
    private String description;
    private int materialId;
    private int mvId;
    private int length;
    private int price;

    public Part(int quantity, String description, int materialId, int mvId, int length, int price) {
        this.quantity = quantity;
        this.description = description;
        this.materialId = materialId;
        this.mvId = mvId;
        this.length = length;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getMvId() {
        return mvId;
    }

    public void setMvId(int mvId) {
        this.mvId = mvId;
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
