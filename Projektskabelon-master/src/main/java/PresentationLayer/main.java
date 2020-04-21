package PresentationLayer;

import FunctionLayer.ToolShedLength;
import MyUtils.Initializer;

import java.util.List;

public class main {

    public static void main(String[] args) {
        List<ToolShedLength> liste = Initializer.getAllToolShedLengths();
        System.out.println(liste.get(0).getToolShed_cm());
    }

}
