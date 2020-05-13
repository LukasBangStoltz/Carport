package FunctionLayer;

public class ToolShedLength {

    private int toolShedLengthId;
    private int toolShedLengthCm;

    public ToolShedLength(int toolShedLengthId, int toolShedLengthCm) {
        this.toolShedLengthId = toolShedLengthId;
        this.toolShedLengthCm = toolShedLengthCm;
    }

    public int getToolShed_id() {
        return toolShedLengthId;
    }

    public void setToolShed_id(int toolShedLength_id) {
        this.toolShedLengthId = toolShedLength_id;
    }

    public int getToolShed_cm() {
        return toolShedLengthCm;
    }

    public void setToolShed_cm(int toolShedLength_cm) {
        this.toolShedLengthCm = toolShedLength_cm;
    }
}
