package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import MyUtils.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrder extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {


        // hente vores værdier vha. getparameter metoden
        int carportTiltId = Integer.parseInt(request.getParameter("roofdegree"));
        int carportLengthId = Integer.parseInt(request.getParameter("carportlength"));
        int carportWidthId = Integer.parseInt(request.getParameter("carportwidth"));
        int carportRooftypeId = Integer.parseInt(request.getParameter("rooftype"));
        int toolshedLengthId = Integer.parseInt(request.getParameter("toolshedlength"));
        int toolshedWidthId = Integer.parseInt(request.getParameter("toolshedwidth"));
        String carportType = request.getParameter("carporttype");
        String flatroof = request.getParameter("flatroof");
        String raisedroof = request.getParameter("raisedroof");



        // få email ud fra sessionen, altså den der er logget ind
        String email = String.valueOf(request.getSession().getAttribute("email"));

        //regne de aktuelle længder, bredde etc ud fra det id vi henter fra JSP-siden
        int carportLength = LogicFacade.getCarportLengthFromId(carportLengthId);
        int carportWidth = LogicFacade.getCarportWidthFromId(carportWidthId);
        int toolshedLength = LogicFacade.getToolShedLengthsFromId(toolshedLengthId);
        int toolshedWidth = LogicFacade.getToolShedWidthsFromId(toolshedWidthId);


        // kalde på vores helperfunctions til at afgøre hvilken carport ordren består af
        boolean hasToolShed = HelperFunctions.hasToolShed(toolshedLengthId, toolshedWidthId);
        boolean isValid = HelperFunctions.checkSkurSize(toolshedLength, toolshedWidth, carportLength, carportWidth);
        String action = HelperFunctions.checkAction(flatroof, raisedroof, hasToolShed);




        // gemme attributer på sessionscopet
        request.getSession().setAttribute("carportLength", carportLength);
        request.getSession().setAttribute("carportWidth", carportWidth);
        request.getSession().setAttribute("toolshedLength", toolshedLength);
        request.getSession().setAttribute("toolshedWidth", toolshedWidth);
        request.getSession().setAttribute("hasToolShed", hasToolShed);
        request.getSession().setAttribute("carportType", carportType);
        request.getSession().setAttribute("flatRoof", flatroof);
        request.getSession().setAttribute("raisedRoof", raisedroof);











        if (isValid) {

            int userId = LogicFacade.getUserId(email);


            int carportId = 0;
            int orderId;
            int[] IDs;

            switch (action) {

                case "flatcarport":

                    IDs = LogicFacade.insertCarport(carportType, hasToolShed, userId, carportLengthId, carportWidthId, carportRooftypeId, carportTiltId, toolshedLengthId, toolshedWidthId);
                    carportId = IDs[0];
                    orderId = IDs[1];

                    HelperFunctions.makeFlatCarport(carportLength, carportWidth, toolshedLength, hasToolShed);
                    LogicFacade.insertCarportPart(orderId, Calc.carportPartList, carportId);
                    HelperFunctions.resetBom();

                    break;

                case "flatcarporttoolshed":

                    IDs = LogicFacade.insertCarportWithToolShed(carportType, hasToolShed, userId, carportLengthId, carportWidthId, carportTiltId, carportRooftypeId, toolshedLengthId, toolshedWidthId);
                    carportId = IDs[0];
                    orderId = IDs[1];

                    HelperFunctions.makeFlatCarportToolShed(carportLength, carportWidth, toolshedLength, toolshedWidth, hasToolShed);
                    LogicFacade.insertCarportPart(orderId, Calc.carportPartList, carportId);
                    HelperFunctions.resetBom();

                    break;

                case "raisedroof":

                    IDs = LogicFacade.insertCarport(carportType, hasToolShed, userId, carportLengthId, carportWidthId, carportRooftypeId, carportTiltId, toolshedLengthId, toolshedWidthId);
                    carportId = IDs[0];
                    orderId = IDs[1];
                    HelperFunctions.makeRaisedCarport(carportLength, carportWidth, toolshedLength, toolshedWidth, hasToolShed);
                    LogicFacade.insertCarportPart(orderId, Calc.carportPartList, carportId);
                    HelperFunctions.resetBom();


                    break;

                case "raisedrooftoolshed":
                    IDs = LogicFacade.insertCarportWithToolShed(carportType, hasToolShed, userId, carportLengthId, carportWidthId, carportRooftypeId, carportTiltId, toolshedLengthId, toolshedWidthId);
                    carportId = IDs[0];
                    orderId = IDs[1];
                    HelperFunctions.makeRaisedCarportToolShed(carportLength, carportWidth, toolshedLength, toolshedWidth, hasToolShed);
                    LogicFacade.insertCarportPart(orderId, Calc.carportPartList, carportId);
                    HelperFunctions.resetBom();


                    break;

            }

            request.getSession().setAttribute("bomlist", InitializeLists.getBomList(carportId));

            return "bomLine";

        } else {

            request.setAttribute("error", "Dit skurs mål må ikke overskride dine carports mål");
        }

        return "carportchoice";
    }
}
