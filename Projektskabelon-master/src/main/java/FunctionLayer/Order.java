package FunctionLayer;

public class Order {

    private int carportLengthId;
    private int carportWidthId;
    private int carportRoofTypeId;
    private int carportRoofTiltId;
    private int toolshedLengthId;
    private int toolshedWidthId;


    //Flad carport uden skur
    public Order(int carportLengthId, int carportWidthId, int carportRoofTypeId) {
        this.carportLengthId = carportLengthId;
        this.carportWidthId = carportWidthId;
        this.carportRoofTypeId = carportRoofTypeId;
    }

    //Flad carport med skur
    public Order(int carportLengthId, int carportWidthId, int carportRoofTypeId, int toolshedLengthId, int toolshedWidthId) {
        this.carportLengthId = carportLengthId;
        this.carportWidthId = carportWidthId;
        this.carportRoofTypeId = carportRoofTypeId;
        this.toolshedLengthId = toolshedLengthId;
        this.toolshedWidthId = toolshedWidthId;
    }

    //Hældning carport uden skur
    public Order(int carportLengthId, int carportWidthId, int carportRoofTypeId, int carportRoofTiltId) {
        this.carportLengthId = carportLengthId;
        this.carportWidthId = carportWidthId;
        this.carportRoofTypeId = carportRoofTypeId;
        this.carportRoofTiltId = carportRoofTiltId;
    }

    //Hældning carport med skur
    public Order(int carportLengthId, int carportWidthId, int carportRoofTypeId, int carportRoofTiltId, int toolshedLengthId, int toolshedWidthId) {
        this.carportLengthId = carportLengthId;
        this.carportWidthId = carportWidthId;
        this.carportRoofTypeId = carportRoofTypeId;
        this.carportRoofTiltId = carportRoofTiltId;
        this.toolshedLengthId = toolshedLengthId;
        this.toolshedWidthId = toolshedWidthId;
    }

    public int getCarportLengthId() {
        return carportLengthId;
    }

    public void setCarportLengthId(int carportLengthId) {
        this.carportLengthId = carportLengthId;
    }

    public int getCarportWidthId() {
        return carportWidthId;
    }

    public void setCarportWidthId(int carportWidthId) {
        this.carportWidthId = carportWidthId;
    }

    public int getCarportRoofTypeId() {
        return carportRoofTypeId;
    }

    public void setCarportRoofTypeId(int carportRoofTypeId) {
        this.carportRoofTypeId = carportRoofTypeId;
    }

    public int getCarportRoofTiltId() {
        return carportRoofTiltId;
    }

    public void setCarportRoofTiltId(int carportRoofTiltId) {
        this.carportRoofTiltId = carportRoofTiltId;
    }

    public int getToolshedLengthId() {
        return toolshedLengthId;
    }

    public void setToolshedLengthId(int toolshedLengthId) {
        this.toolshedLengthId = toolshedLengthId;
    }

    public int getToolshedWidthId() {
        return toolshedWidthId;
    }

    public void setToolshedWidthId(int toolshedWidthId) {
        this.toolshedWidthId = toolshedWidthId;
    }
}
