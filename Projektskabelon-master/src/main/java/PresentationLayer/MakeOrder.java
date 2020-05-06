package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import MyUtils.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrder extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int carport_tilt_id = Integer.parseInt(request.getParameter("roofdegree"));
        int carport_length_id = Integer.parseInt(request.getParameter("carportlength"));
        int carport_width_id = Integer.parseInt(request.getParameter("carportwidth"));
        int carport_rooftype_id = Integer.parseInt(request.getParameter("rooftype"));
        int toolshed_length_id = Integer.parseInt(request.getParameter("toolshedlength"));
        int toolshed_width_id = Integer.parseInt(request.getParameter("toolshedwidth"));
        String carportType = request.getParameter("carporttype");
        String email = String.valueOf(request.getSession().getAttribute("email"));
        System.out.println("roodtypeid" +  carport_rooftype_id);
        int carport_length = LogicFacade.getCarportLengthFromId(carport_length_id);
        int carport_width = LogicFacade.getCarportWidthFromId(carport_width_id);
        int toolshed_length = LogicFacade.getToolShedLengthsFromId(toolshed_length_id);
        int toolshed_width = LogicFacade.getToolShedWidthsFromId(toolshed_width_id);


        String flatroof = request.getParameter("flatroof");
        String raisedroof = request.getParameter("raisedroof");

        boolean hasToolShed = HelperFunctions.hasToolShed(toolshed_length_id, toolshed_width_id);

        String action = HelperFunctions.checkAction(flatroof, raisedroof, hasToolShed);


        boolean isValid = HelperFunctions.checkSkurSize(toolshed_length, toolshed_width, carport_length, carport_width);


        if (isValid) {

            int user_id = LogicFacade.getUserId(email);
            int[] IDs = LogicFacade.insertCarport(carportType, hasToolShed, user_id, carport_length_id, carport_width_id, carport_rooftype_id, carport_tilt_id, toolshed_length_id, toolshed_width_id);
            int carport_id = IDs[0];
            int order_id = IDs[1];

            switch (action) {

                case "flatcarport":

                    break;
                case "flatcarporttoolshed":
                    break;
                case "raisedroof":
                    break;
                case "raisedrooftoolshed":
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
