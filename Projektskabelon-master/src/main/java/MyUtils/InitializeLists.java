package MyUtils;

import FunctionLayer.*;
import FunctionLayer.CarportWidth;

import java.util.List;

public class InitializeLists {

    private static List<CarportWidth> widthList = null;
    private static List<CarportLength> lengthList = null;
    private static List<FlatRoofType> flatrooftypelist = null;
    private static List<RaisedRoofType> raisedRoofTypeList = null;
    private static List<RoofTilt> raisedRoofDegreeList = null;
    private static List<ToolShedLength> toolShedLengthList = null;
    private static List<ToolShedWidth> toolShedWidthList = null;


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
    public static List<ToolShedLength> getAllToolShedLengths(){

        if(toolShedLengthList == null){

            try {
                toolShedLengthList = LogicFacade.GetAllToolShedLengths();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return toolShedLengthList;

    }
    public static List<ToolShedWidth> getAllToolShedWidths(){

        if(toolShedWidthList == null){

            try {
                toolShedWidthList = LogicFacade.GetAllToolShedWidhts();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return toolShedWidthList;

    }




}
