package FunctionLayer;

public class RaisedRoofType {

    private int raisedRoof_id;
    private String raisedRoof_type;

    public RaisedRoofType(int raisedRoof_id, String raisedRoof_type) {
        this.raisedRoof_id = raisedRoof_id;
        this.raisedRoof_type = raisedRoof_type;
    }

    public int getRaisedRoof_id() {
        return raisedRoof_id;
    }

    public void setRaisedRoof_id(int raisedRoof_id) {
        this.raisedRoof_id = raisedRoof_id;
    }

    public String getRaisedRoof_type() {
        return raisedRoof_type;
    }

    public void setRaisedRoof_type(String raisedRoof_type) {
        this.raisedRoof_type = raisedRoof_type;
    }
}
