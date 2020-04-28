package FunctionLayer;

public class GenerateFlatBom {
    private int length;
    private int width;
    private int toolshedLength;
    private int toolshedWidth;

    public GenerateFlatBom(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public GenerateFlatBom(int length, int width, int toolshedLength, int toolshedWidth) {
        this.length = length;
        this.width = width;
        this.toolshedLength = toolshedLength;
        this.toolshedWidth = toolshedWidth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getToolshedLength() {
        return toolshedLength;
    }

    public void setToolshedLength(int toolshedLength) {
        this.toolshedLength = toolshedLength;
    }

    public int getToolshedWidth() {
        return toolshedWidth;
    }

    public void setToolshedWidth(int toolshedWidth) {
        this.toolshedWidth = toolshedWidth;
    }
}
