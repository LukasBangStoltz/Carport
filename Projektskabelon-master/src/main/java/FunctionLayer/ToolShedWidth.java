package FunctionLayer;

/**
 * @author Kernen
 * Indeholder constructoren til bredden af et skur
 */

public class ToolShedWidth {

    private int toolShedWidth_id;
    private int toolShedWidth_cm;

    /**
     *
     * @param toolShedWidth_id
     * @param toolShedWidth_cm
     */
    public ToolShedWidth(int toolShedWidth_id, int toolShedWidth_cm) {
        this.toolShedWidth_id = toolShedWidth_id;
        this.toolShedWidth_cm = toolShedWidth_cm;
    }

    public int getToolShedWidth_id() {
        return toolShedWidth_id;
    }

    public void setToolShedWidth_id(int toolShedWidth_id) {
        this.toolShedWidth_id = toolShedWidth_id;
    }

    public int getToolShedWidth_cm() {
        return toolShedWidth_cm;
    }

    public void setToolShedWidth_cm(int toolShedWidth_cm) {
        this.toolShedWidth_cm = toolShedWidth_cm;
    }
}
