package PresentationLayer;

import FunctionLayer.BomLine;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import MyUtils.HelperFunctions;
import MyUtils.HelperFunctionsDrawing;
import MyUtils.InitializeLists;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class ManageRequestCustomer extends Command {


    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        String orderNumber = request.getParameter("seeorder");
        String buyOrderNumber = request.getParameter("buy");
        String seeDrawing = request.getParameter("seedrawing");
        String bomLineNumber = request.getParameter("seebomline");
        String email = String.valueOf(request.getSession().getAttribute("email"));
        int userId = LogicFacade.getUserId(email);

        String action = HelperFunctions.CheckActionRequestCustomer(orderNumber, buyOrderNumber, seeDrawing, bomLineNumber);

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
                int toolShedLengthId = order.getToolshedLengthId();
                int toolShedWidthId = order.getToolshedWidthId();


                // Nu vil vi hente de forskellige værdier ud fra id's
                int carportLength = LogicFacade.getCarportLengthFromId(carportLengthId);
                int carportWidth = LogicFacade.getCarportWidthFromId(carportWidthId);
                String carportRoofType = LogicFacade.getCarportRoofTypeFromId(carportRoofTypeId);
                int carportTilt = LogicFacade.getCarportTiltFromId(carportTiltId);
                int toolshedLength = LogicFacade.getToolShedLengthsFromId(toolShedLengthId);
                int toolshedWidth = LogicFacade.getToolShedWidthsFromId(toolShedWidthId);

                //finde total prisen for carporten
                ArrayList<BomLine> bomLineList = (ArrayList<BomLine>) LogicFacade.getBomLineFromCarport(orderNumberInt);
                int totalPrice = HelperFunctions.getTotalPrice(bomLineList);


                //Sætte attributterne til JSP siden
                request.getSession().setAttribute("carportlength", carportLength);
                request.getSession().setAttribute("carportwidth", carportWidth);
                request.getSession().setAttribute("carportrooftype", carportRoofType);
                request.getSession().setAttribute("carporttilt", carportTilt);
                request.getSession().setAttribute("toolshedlength", toolshedLength);
                request.getSession().setAttribute("toolshedwidth", toolshedWidth);
                request.getSession().setAttribute("ordernumber", orderNumber);
                request.getSession().setAttribute("totalprice", totalPrice);

                return "orderinfocustomer";


            case "seedrawing":

                carportLength = (int) request.getSession().getAttribute("carportlength");
                carportWidth = (int) request.getSession().getAttribute("carportwidth");
                toolshedLength = (int) request.getSession().getAttribute("toolshedlength");
                toolshedWidth = (int) request.getSession().getAttribute("toolshedwidth");
                Boolean hasToolshed = HelperFunctions.hasToolShed(toolshedLength, toolshedWidth);


                String svgdrawingtop = HelperFunctionsDrawing.drawFlatCarportTop(carportLength, carportWidth, hasToolshed, toolshedLength, toolshedWidth);
                String svgdrawingside = HelperFunctionsDrawing.drawFlatCarportSide(carportLength, hasToolshed, toolshedLength);

                request.getSession().setAttribute("svgdrawingtop", svgdrawingtop);
                request.getSession().setAttribute("svgdrawingside", svgdrawingside);

                return "drawing";

            case "buyorder":

                int buyOrderNumberInt = Integer.parseInt(buyOrderNumber);
                LogicFacade.buyRequest(buyOrderNumberInt);
                request.getSession().setAttribute("requestListCustomer", InitializeLists.initRequestListCustomer(userId));

                return "allorderscustomer";

            case "seebomline":

                int bomLineNumberInt = Integer.parseInt(bomLineNumber);
                boolean isBought = LogicFacade.checkIfBought(bomLineNumberInt);
                if (isBought) {
                    request.getSession().setAttribute("bomlist", LogicFacade.getBomLineFromCarport(bomLineNumberInt));
                    return "bomline";

                } else {

                    request.setAttribute("error", "Køb venligst carporten for at tilgå styklisten");
                    return "orderinfocustomer";
                }

        }
        return "allorderscustomer";

    }
}
