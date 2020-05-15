package FunctionLayer;

public class Request {

    private int orderId;
    private int customerId;
    private boolean isAuthorized;
    private boolean isBought;



    public Request(int orderId, int customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
    }

    public Request(int orderId, int customerId, boolean isAuthorized, boolean isBought) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.isAuthorized = isAuthorized;
        this.isBought = isBought;
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

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }
}
