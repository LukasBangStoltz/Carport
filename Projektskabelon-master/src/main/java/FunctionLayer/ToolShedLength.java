package FunctionLayer;

public class ToolShedLength {

    private int toolShedLength_id;
    private int toolShedLength_cm;

    public ToolShedLength(int toolShedLength_id, int toolShedLength_cm) {
        this.toolShedLength_id = toolShedLength_id;
        this.toolShedLength_cm = toolShedLength_cm;
    }

    public int getToolShed_id() {
        return toolShedLength_id;
    }

    public void setToolShed_id(int toolShedLength_id) {
        this.toolShedLength_id = toolShedLength_id;
    }

    public int getToolShed_cm() {
        return toolShedLength_cm;
    }

    public void setToolShed_cm(int toolShedLength_cm) {
        this.toolShedLength_cm = toolShedLength_cm;
    }
}
