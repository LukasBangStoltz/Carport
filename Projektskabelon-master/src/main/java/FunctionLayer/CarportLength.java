package FunctionLayer;

public class CarportLength {

    private int lengthId;
    private int lengthCm;

    public CarportLength(int lengthId, int lengthCm) {
        this.lengthId = lengthId;
        this.lengthCm = lengthCm;
    }


    public int getLengthId() {
        return lengthId;
    }

    public void setLengthId(int lengthId) {
        this.lengthId = lengthId;
    }

    public int getLengthCm() {
        return lengthCm;
    }

    public void setLengthCm(int lengthCm) {
        this.lengthCm = lengthCm;
    }

}
