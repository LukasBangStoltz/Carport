package FunctionLayer;

public class CarportLength {

    private int length_id;
    private int length_cm;

    public CarportLength(int length_id, int length_cm) {
        this.length_id = length_id;
        this.length_cm = length_cm;
    }


    public int getLength_id() {
        return length_id;
    }

    public void setLength_id(int length_id) {
        this.length_id = length_id;
    }

    public int getLength_cm() {
        return length_cm;
    }

    public void setLength_cm(int length_cm) {
        this.length_cm = length_cm;
    }

}
