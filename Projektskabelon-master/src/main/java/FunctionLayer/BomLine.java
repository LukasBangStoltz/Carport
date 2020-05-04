package FunctionLayer;

public class BomLine {

    private int material_id;
    private String name;
    private String dimension;
    private String unit;
    private int length;
    private int price;
    private int carport_part_id;
    private String description;
    private int carport_id;

    public BomLine(int material_id, String name, String dimension, String unit, int length, int price, int carport_part_id, String description, int carport_id) {
        this.material_id = material_id;
        this.name = name;
        this.dimension = dimension;
        this.unit = unit;
        this.length = length;
        this.price = price;
        this.carport_part_id = carport_part_id;
        this.description = description;
        this.carport_id = carport_id;
    }

    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
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

    public int getCarport_part_id() {
        return carport_part_id;
    }

    public void setCarport_part_id(int carport_part_id) {
        this.carport_part_id = carport_part_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCarport_id() {
        return carport_id;
    }

    public void setCarport_id(int carport_id) {
        this.carport_id = carport_id;
    }
}