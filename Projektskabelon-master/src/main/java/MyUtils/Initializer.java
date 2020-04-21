package MyUtils;

import FunctionLayer.*;
import FunctionLayer.CarportWidth;

import java.util.List;

public class Initializer {

    private static List<CarportWidth> widthList = null;
    private static List<CarportLength> lengthList = null;
    private static List<FlatRoofType> flatrooftypelist = null;


    public static List<CarportWidth> getCarportWidthList() {

        if (widthList == null) {

            try {
                widthList = LogicFacade.getAllWidths();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return widthList;

    }
    public static List<CarportLength> getCarportLengthList() {

        if (lengthList == null) {

            try {
                lengthList = LogicFacade.getAllLengths();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return lengthList;

    }
    public static List<FlatRoofType> getFlatRoofTypes() {

        if (flatrooftypelist == null) {

            try {
                flatrooftypelist = LogicFacade.getAllFlatRootTypes();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return flatrooftypelist;

    }

}
