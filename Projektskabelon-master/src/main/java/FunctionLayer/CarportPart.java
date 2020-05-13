package FunctionLayer;

public class CarportPart {

    private int carportPartId;
    private String description;
    private int carportId;

    public CarportPart(int carportPartId, String description, int carportId) {
        this.carportPartId = carportPartId;
        this.description = description;
        this.carportId = carportId;
    }

    public int getCarportPartId() {
        return carportPartId;
    }

    public void setCarportPartId(int carportPartId) {
        this.carportPartId = carportPartId;
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
}
