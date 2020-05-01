package FunctionLayer;

public class Bom {

    private int order_id;
    private int quantity;
    private int carportPart_id;

    public Bom(int order_id, int quantity, int carportPart_id) {
        this.order_id = order_id;
        this.quantity = quantity;
        this.carportPart_id = carportPart_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCarportPart_id() {
        return carportPart_id;
    }

    public void setCarportPart_id(int carportPart_id) {
        this.carportPart_id = carportPart_id;
    }
}
