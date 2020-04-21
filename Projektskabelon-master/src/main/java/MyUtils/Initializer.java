package MyUtils;

import FunctionLayer.*;
import FunctionLayer.CarportWidth;

import java.util.List;

public class Initializer {

    private static List<CarportWidth> widthList = null;
    private static List<CarportLength> lengthList = null;
    private static List<FlatRoofType> flatrooftypelist = null;
    private static List<RaisedRoofType> raisedRoofTypeList = null;
    private static List<RoofTilt> raisedRoofDegreeList = null;


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
    public static List<FlatRoofType> getFlatRoofTypeList() {

        if (flatrooftypelist == null) {

            try {
                flatrooftypelist = LogicFacade.getAllFlatRootTypes();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return flatrooftypelist;

    }

    public static List<RaisedRoofType> getRaisedRoofTypeList(){

        if(raisedRoofTypeList == null){

            try {
                raisedRoofTypeList = LogicFacade.GetAllRaisedRoofType();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return raisedRoofTypeList;
    }

public static List<RoofTilt> getAllRaisedRoofDegrees(){

        if(raisedRoofDegreeList == null){

            try {
                raisedRoofDegreeList = LogicFacade.GetAllRaisedRoofDegress();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return raisedRoofDegreeList;

}







}
