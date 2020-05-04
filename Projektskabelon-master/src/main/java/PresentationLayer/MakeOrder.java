package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import MyUtils.Calc;
import MyUtils.HelperFunctions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrder extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int carport_length_id = Integer.parseInt(request.getParameter("carportlength"));
        int carport_width_id = Integer.parseInt(request.getParameter("carportwidth"));
       //int carport_tilt_id = Integer.parseInt(request.getParameter("roofdegree"));
        int carport_rooftype_id = Integer.parseInt(request.getParameter("rooftype"));
        int toolshed_length_id = Integer.parseInt(request.getParameter("toolshedlength"));
        int toolshed_width_id = Integer.parseInt(request.getParameter("toolshedwidth"));
        String carportType = request.getParameter("carporttype");
        String email = String.valueOf(request.getSession().getAttribute("email"));


        boolean isValid = HelperFunctions.checkSkurSize(toolshed_length_id, toolshed_width_id, carport_length_id, carport_width_id);

        if (isValid) {

            boolean hasToolShed = HelperFunctions.hasToolShed(toolshed_length_id, toolshed_width_id);
            int user_id = LogicFacade.getUserId(email);
            int[] IDs = LogicFacade.insertCarport(carportType, hasToolShed, user_id, carport_length_id, carport_width_id, carport_rooftype_id, toolshed_length_id, toolshed_width_id);
            int carport_id = IDs[0];
            int order_id = IDs[1];


            Calc.understernForOgBag(carport_width_id);
            Calc.understernSider(carport_width_id);
            Calc.oversternFor(carport_length_id);
            Calc.oversternSider(carport_length_id);
            //Calc.lægteTilZDørSkur();
            Calc.remmeSider(carport_length_id);
            Calc.spærTilRem(carport_width_id, carport_length_id);
            Calc.vandbrædtSider(carport_width_id);

            LogicFacade.insertCarportPart(order_id, Calc.carportPartList, carport_id);

            return "index";
        } else {

            request.setAttribute("error", "Dit skurs mål må ikke overskride dine carports mål");
        }

        return "carportchoice";
    }
}
