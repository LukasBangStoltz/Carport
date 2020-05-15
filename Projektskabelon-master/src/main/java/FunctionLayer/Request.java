package FunctionLayer;

public class Request {

    private int orderId;
    private int customerId;
    private boolean status;

    public Request(int orderId, int customerId, boolean status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.status = status;
    }

    public Request(int orderId, int customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
