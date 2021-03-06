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

/**
 * I denne klasse kan admin se ordren, styklisten, og tegningen for den valgte carport
 * @author Kernen
 *
 */

public class ManageRequestAdmin extends Command {

    /**
     *
     * @param request
     * @param response
     * @return orderinfoadmin
     * @throws LoginSampleException
     */
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {


        // trækker ordre nummeret ud admin vil have
        String orderNumber = request.getParameter("seeorder");
        String seeDrawing = request.getParameter("seedrawing");
        String seeBomLine = request.getParameter("seebomline");
        String authorize = request.getParameter("authorize");


        String action = HelperFunctions.CheckActionRequestAdmin(orderNumber, seeDrawing, seeBomLine, authorize);


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
                request.getSession().setAttribute("totalprice", totalPrice);





                //Sætte attributterne til JSP siden
                request.getSession().setAttribute("carportlength", carportLength);
                request.getSession().setAttribute("carportwidth", carportWidth);
                request.getSession().setAttribute("carportrooftype", carportRoofType);
                request.getSession().setAttribute("carporttilt", carportTilt);
                request.getSession().setAttribute("toolshedlength", toolshedLength);
                request.getSession().setAttribute("toolshedwidth", toolshedWidth);
                request.getSession().setAttribute("ordernumber", orderNumber);



                return "orderinfoadmin";

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

            case "seebomline":

                int bomOrderId = Integer.parseInt(seeBomLine);
                request.getSession().setAttribute("bomlist", LogicFacade.getBomLineFromCarport(bomOrderId));

                return "bomline";

            case "authorize":

                int authorizeOrderId = Integer.parseInt(authorize);

                LogicFacade.authorizeRequest(authorizeOrderId);

                request.getSession().setAttribute("requestListAdmin", InitializeLists.initRequestList());

                return "allordersadmin";
        }


        return "orderinfoadmin";
    }
}
