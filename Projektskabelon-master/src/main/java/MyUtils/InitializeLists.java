package MyUtils;

import FunctionLayer.*;
import FunctionLayer.CarportWidth;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InitializeLists {

    private static List<CarportWidth> widthList = null;
    private static List<CarportLength> lengthList = null;
    private static List<RoofType> flatrooftypelist = null;
    private static List<RoofType> raisedRoofTypeList = null;
    private static List<RoofTilt> raisedRoofDegreeList = null;
    private static List<ToolShedLength> toolShedLengthList = null;
    private static List<ToolShedWidth> toolShedWidthList = null;
    private static List<Material> materialList = null;
    private static List<MaterialVariants> matVariantsList = null;
    private static List<BomLine> bomLineList = null;
    private static List<Request> requestLists = null;
    private static List<Request> requestListCustomer = null;

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

    public static List<RoofType> getFlatRoofTypeList() {

        if (flatrooftypelist == null) {

            try {
                flatrooftypelist = LogicFacade.getAllFlatRootTypes();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return flatrooftypelist;

    }

    public static List<RoofType> getRaisedRoofTypeList() {

        if (raisedRoofTypeList == null) {

            try {
                raisedRoofTypeList = LogicFacade.GetAllRaisedRoofType();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return raisedRoofTypeList;
    }

    public static List<RoofTilt> getAllRaisedRoofDegrees() {

        if (raisedRoofDegreeList == null) {

            try {
                raisedRoofDegreeList = LogicFacade.GetAllRaisedRoofDegress();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return raisedRoofDegreeList;

    }

    public static List<ToolShedLength> getAllToolShedLengths() {

        if (toolShedLengthList == null) {

            try {
                toolShedLengthList = LogicFacade.GetAllToolShedLengths();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return toolShedLengthList;

    }

    public static List<ToolShedWidth> getAllToolShedWidths() {

        if (toolShedWidthList == null) {

            try {
                toolShedWidthList = LogicFacade.GetAllToolShedWidhts();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return toolShedWidthList;

    }

    public static List<Material> getMaterialList() {

        if (materialList == null) {

            try {
                materialList = LogicFacade.GetMaterials();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return materialList;

    }

    public static List<MaterialVariants> getMatVariantsList() {

        if (matVariantsList == null) {

            try {
                matVariantsList = LogicFacade.GetMaterialVariants();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            }

        }

        return matVariantsList;

    }

    public static List<BomLine> getBomList(int orderId) {

        try {
            bomLineList = LogicFacade.getBomLineFromCarport(orderId);
        } catch (LoginSampleException e) {
            e.printStackTrace();
        }

        return bomLineList;

    }

    public static List<Request> getRequestList() {

        if(requestLists == null) {
            try {
                requestLists = LogicFacade.getAllRequests();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return requestLists;

    }

    public static List<Request> initRequestList() {


            try {
                requestLists = LogicFacade.getAllRequests();
            } catch (LoginSampleException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        return requestLists;

    }

    public static List<Request> initRequestListCustomer(int userId) {


        try {
            requestListCustomer = LogicFacade.getAllRequestsCustomer(userId);
        } catch (LoginSampleException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return requestListCustomer;

    }

}