package FunctionLayer;

public class BomLine {

    private int materialId;
    private String name;
    private String dimension;
    private String unit;
    private int length;
    private int price;
    private String description;
    private int carportId;
    private int quantity;

    public BomLine(int materialId, String name, String dimension, String unit, int length, int price, String description, int carportId, int quantity) {
        this.materialId = materialId;
        this.name = name;
        this.dimension = dimension;
        this.unit = unit;
        this.length = length;
        this.price = price;
        this.description = description;
        this.carportId = carportId;
        this.quantity = quantity;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCarportId() {
        return carportId;
    }

    public void setCarportId(int carportId) {
        this.carportId = carportId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
