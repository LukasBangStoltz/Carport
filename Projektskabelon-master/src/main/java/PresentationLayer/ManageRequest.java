package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import MyUtils.HelperFunctions;
import MyUtils.HelperFunctionsDrawing;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManageRequest extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {


        // trækker ordre nummeret ud admin vil have
        String orderNumber = request.getParameter("seeorder");
        String seeDrawing = request.getParameter("seedrawing");
        String seeBomLine = request.getParameter("seebomline");
        String authorize = request.getParameter("authorize");


        String action = HelperFunctions.CheckActionRequest(orderNumber, seeDrawing, seeBomLine);


        switch (action) {

            case "seeorder":

                // for ordren ud fra det ordre nummer

                int orderNumberInt = Integer.parseInt(orderNumber);

                Order order = LogicFacade.getOrder(orderNumberInt);


                // Trækker vores forskellige id ud fra order objektet
                int carportLengthId = order.getCarportLengthId();
                int carportWidthId = order.getCarportWidthId();
                int carportRoofTypeId = order.getCarportRoofTypeId();
                int carportTiltId = order.getCarportRoofTiltId();
                int toolShedLength = order.getToolshedLengthId();
                int toolShedWidthId = order.getToolshedWidthId();


                // Nu vil vi hente de forskellige værdier ud fra id's
                int carportLength = LogicFacade.getCarportLengthFromId(carportLengthId);
                int carportWidth = LogicFacade.getCarportWidthFromId(carportWidthId);
                String carportRoofType = LogicFacade.getCarportRoofTypeFromId(carportRoofTypeId);
                int carportTilt = LogicFacade.getCarportTiltFromId(carportTiltId);
                int toolshedLength = LogicFacade.getToolShedLengthsFromId(toolShedLength);
                int toolshedWidth = LogicFacade.getToolShedWidthsFromId(toolShedWidthId);



                //Sætte attributterne til JSP siden
                request.setAttribute("carportlength", carportLength);
                request.setAttribute("carportwidth", carportWidth);
                request.setAttribute("carportrooftype", carportRoofType);
                request.setAttribute("carporttilt", carportTilt);
                request.setAttribute("toolshedlength", toolshedLength);
                request.setAttribute("toolshedwidth", toolshedWidth);
                request.setAttribute("ordernumber", orderNumber);


                return "orderinfo";

            case "seedrawing":





                return "drawing";


        }


        return "orderinfo";
    }
}
