package FunctionLayer;

public class Part {

    private int quantity;
    private String description;
    private int material_id;
    private int mv_id;
    private int length;
    private int price;

    public Part(int quantity, String description, int material_id, int mv_id, int length, int price) {
        this.quantity = quantity;
        this.description = description;
        this.material_id = material_id;
        this.mv_id = mv_id;
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

    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }

    public int getMv_id() {
        return mv_id;
    }

    public void setMv_id(int mv_id) {
        this.mv_id = mv_id;
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
