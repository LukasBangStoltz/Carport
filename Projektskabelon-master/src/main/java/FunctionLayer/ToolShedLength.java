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

    public void setToolShed_id(int toolShedLengthId) {
        this.toolShedLengthId = toolShedLengthId;
    }

    public int getToolShed_cm() {
        return toolShedLengthCm;
    }

    public void setToolShed_cm(int toolShedLengthCm) {
        this.toolShedLengthCm = toolShedLengthCm;
    }
}
