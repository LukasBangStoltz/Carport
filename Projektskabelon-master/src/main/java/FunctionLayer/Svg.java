package FunctionLayer;

public class Svg {

    private int width;
    private int height;
    private String viewbox;
    private int x;
    private int y;
    private StringBuilder svg = new StringBuilder();

    private final String headerTemplate = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" height=\"%d\" width=\"%d\" x=\"%d\" y=\"%d\" viewBox=\"%s\" preserveAspectRatio=\"xMinYMin\">";
    private final String rectTemplate = "<rect x=\"%d\" y=\"%d\" height=\"%d\" width=\"%d\" style=\"stroke:#000000; fill: #ffffff\" />";
    private final String dashLineTemplate = "<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" style=\"stroke:#000000; stroke-dasharray: 5 5;\"/>";
    private final String lineTemplate = "<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" style=\"stroke:#000000;\"/>";
    private final String arrowTemplate = "<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" style=\"stroke:#000000;\n" + "marker-start: url(#beginArrow);\n" + "marker-end: url(#endArrow);\"/>\n";
    private final String textWidthTemplate = "<text style=\"text-anchor: middle\" transform=\"translate(%d,%d) rotate(-90)\">%d cm</text>\n";
    private final String textLengthTemplate = "<text style=\"text-anchor: middle\" x=\"%d\" y=\"%d\"> %d cm</text>\n";

    public Svg(int width, int height, String viewbox, int x, int y) {
        this.width = width;
        this.height = height;
        this.viewbox = viewbox;
        this.x = x;
        this.y = y;
        svg.append(String.format(headerTemplate, height, width, x ,y ,viewbox));
    }

    //public void addRectAngle(int x, int y, int height, int width, int translate1, int translate2){
      //  svg.append(String.format(rectAngleTemplate, translate1, translate2, x, y, height, width));
    //}

    public void addRect(int x, int y, int height, int width){
        svg.append(String.format(rectTemplate, x, y, height, width));
    }

    public void addDashLine(int x1, int y1, int x2, int y2){
        svg.append(String.format(dashLineTemplate,x1,y1,x2,y2));
    }

    public void addLine(int x1, int y1, int x2, int y2){
        svg.append(String.format(lineTemplate,x1,y1,x2,y2));
    }

    public void addSvgDrawing (Svg drawing){
        svg.append(drawing.toString());
    }

    public void addArrowsDefs(){
        String defs = " <defs>\n" +
                "        <marker id=\"beginArrow\" markerWidth=\"12\" markerHeight=\"12\" refX=\"0\" refY=\"6\" orient=\"auto\">\n" +
                "            <path d=\"M0,6 L12,0 L12,12 L0,6\" style=\"fill: #000000;\"/>\n" +
                "        </marker>\n" +

                "        <marker id=\"endArrow\" markerWidth=\"12\" markerHeight=\"12\" refX=\"12\" refY=\"6\" orient=\"auto\">\n" +
                "            <path d=\"M0,0 L12,6 L0,12 L0,0 \" style=\"fill: #000000;\"/>\n" +
                "        </marker>\n" +
                "    </defs>";

        svg.append(String.format(defs));
    }

    public void addArrows(int x1, int y1, int x2, int y2){

        svg.append(String.format(arrowTemplate, x1, y1, x2, y2));

    }

    public void addWidthText(int x1, int y1, int width){

        svg.append(String.format(textWidthTemplate, x1, y1, width));

    }

    public void addLengthText(int x1, int y1, int height){

        svg.append(String.format(textLengthTemplate, x1, y1, height));
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getViewbox() {
        return viewbox;
    }

    public void setViewbox(String viewbox) {
        this.viewbox = viewbox;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return svg.toString() + "</svg>" ;
    }
}