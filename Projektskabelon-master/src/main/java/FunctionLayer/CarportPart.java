package FunctionLayer;

public class CarportPart {

    private int carportPart_id;
    private String description;
    private int carport_id;

    public CarportPart(int carportPart_id, String description, int carport_id) {
        this.carportPart_id = carportPart_id;
        this.description = description;
        this.carport_id = carport_id;
    }

    public int getCarportPart_id() {
        return carportPart_id;
    }

    public void setCarportPart_id(int carportPart_id) {
        this.carportPart_id = carportPart_id;
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
