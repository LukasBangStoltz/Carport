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
        int carport_tilt_id = Integer.parseInt(request.getParameter("roofdegree"));
        int carport_length_id = Integer.parseInt(request.getParameter("carportlength"));
        int carport_width_id = Integer.parseInt(request.getParameter("carportwidth"));
        int carport_rooftype_id = Integer.parseInt(request.getParameter("rooftype"));
        int toolshed_length_id = Integer.parseInt(request.getParameter("toolshedlength"));
        int toolshed_width_id = Integer.parseInt(request.getParameter("toolshedwidth"));
        String carportType = request.getParameter("carporttype");
        String flatroof = request.getParameter("flatroof");
        String raisedroof = request.getParameter("raisedroof");



        // få email ud fra sessionen, altså den der er logget ind
        String email = String.valueOf(request.getSession().getAttribute("email"));

        //regne de aktuelle længder, bredde etc ud fra det id vi henter fra JSP-siden
        int carport_length = LogicFacade.getCarportLengthFromId(carport_length_id);
        int carport_width = LogicFacade.getCarportWidthFromId(carport_width_id);
        int toolshed_length = LogicFacade.getToolShedLengthsFromId(toolshed_length_id);
        int toolshed_width = LogicFacade.getToolShedWidthsFromId(toolshed_width_id);


        // kalde på vores helperfunctions til at afgøre hvilken carport ordren består af
        boolean hasToolShed = HelperFunctions.hasToolShed(toolshed_length_id, toolshed_width_id);
        boolean isValid = HelperFunctions.checkSkurSize(toolshed_length, toolshed_width, carport_length, carport_width);
        String action = HelperFunctions.checkAction(flatroof, raisedroof, hasToolShed);




        // gemme attributer på sessionscopet
        request.getSession().setAttribute("carportLength", carport_length);
        request.getSession().setAttribute("carportWidth", carport_width);
        request.getSession().setAttribute("toolshedLength", toolshed_length);
        request.getSession().setAttribute("toolshedWidth", toolshed_width);
        request.getSession().setAttribute("hasToolShed", hasToolShed);
        request.getSession().setAttribute("carportType", carportType);
        request.getSession().setAttribute("flatRoof", flatroof);
        request.getSession().setAttribute("raisedRoof", raisedroof);











        if (isValid) {

            int user_id = LogicFacade.getUserId(email);


            int carport_id = 0;
            int order_id;
            int[] IDs;

            switch (action) {

                case "flatcarport":

                    IDs = LogicFacade.insertCarport(carportType, hasToolShed, user_id, carport_length_id, carport_width_id, carport_rooftype_id, carport_tilt_id, toolshed_length_id, toolshed_width_id);
                    carport_id = IDs[0];
                    order_id = IDs[1];

                    HelperFunctions.makeFlatCarport(carport_length, carport_width, toolshed_length, hasToolShed);
                    LogicFacade.insertCarportPart(order_id, Calc.carportPartList, carport_id);
                    HelperFunctions.resetBom();

                    break;

                case "flatcarporttoolshed":

                    IDs = LogicFacade.insertCarportWithToolShed(carportType, hasToolShed, user_id, carport_length_id, carport_width_id, carport_tilt_id, carport_rooftype_id, toolshed_length_id, toolshed_width_id);
                    carport_id = IDs[0];
                    order_id = IDs[1];

                    HelperFunctions.makeFlatCarportToolShed(carport_length, carport_width, toolshed_length, toolshed_width, hasToolShed);
                    LogicFacade.insertCarportPart(order_id, Calc.carportPartList, carport_id);
                    HelperFunctions.resetBom();

                    break;

                case "raisedroof":

                    IDs = LogicFacade.insertCarport(carportType, hasToolShed, user_id, carport_length_id, carport_width_id, carport_rooftype_id, carport_tilt_id, toolshed_length_id, toolshed_width_id);
                    carport_id = IDs[0];
                    order_id = IDs[1];
                    HelperFunctions.makeRaisedCarport(carport_length, carport_width, toolshed_length, toolshed_width, hasToolShed);
                    LogicFacade.insertCarportPart(order_id, Calc.carportPartList, carport_id);
                    HelperFunctions.resetBom();


                    break;

                case "raisedrooftoolshed":
                    IDs = LogicFacade.insertCarportWithToolShed(carportType, hasToolShed, user_id, carport_length_id, carport_width_id, carport_rooftype_id, carport_tilt_id, toolshed_length_id, toolshed_width_id);
                    carport_id = IDs[0];
                    order_id = IDs[1];
                    HelperFunctions.makeRaisedCarportToolShed(carport_length, carport_width, toolshed_length, toolshed_width, hasToolShed);
                    LogicFacade.insertCarportPart(order_id, Calc.carportPartList, carport_id);
                    HelperFunctions.resetBom();


                    break;

            }

            request.getSession().setAttribute("bomlist", InitializeLists.getBomList(carport_id));

            return "bomLine";

        } else {

            request.setAttribute("error", "Dit skurs mål må ikke overskride dine carports mål");
        }

        return "carportchoice";
    }
}
