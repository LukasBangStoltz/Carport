package FunctionLayer;

public class BomPart {

    private int order_id;
    private int carportPart_id;
    private String name;
    private String dimension;
    private int materialLength;
    private int quantity;
    private String unit;
    private int price;

    public BomPart(int order_id, int carportPart_id, String name, String dimension, int materialLength, int quantity, String unit, int price) {
        this.order_id = order_id;
        this.carportPart_id = carportPart_id;
        this.name = name;
        this.dimension = dimension;
        this.materialLength = materialLength;
        this.quantity = quantity;
        this.unit = unit;
        this.price = price;

    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCarportPart_id() {
        return carportPart_id;
    }

    public void setCarportPart_id(int carportPart_id) {
        this.carportPart_id = carportPart_id;
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

    public int getMaterialLength() {
        return materialLength;
    }

    public void setMaterialLength(int materialLength) {
        this.materialLength = materialLength;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
