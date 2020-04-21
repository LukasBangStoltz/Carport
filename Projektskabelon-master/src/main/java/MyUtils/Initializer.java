package MyUtils;

import FunctionLayer.CarportBredde;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;

import java.util.List;

public class Initializer {

    private static List<CarportBredde> widthList = null;


    public static List<CarportBredde> getCarportWidthList() {

        if (widthList == null) {

            try {
                widthList = LogicFacade.getAllWidths();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return widthList;

    }


}
