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
 *
 * @author Kernen
 */

public class ManageRequestAdmin extends Command {

    /**
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

                return "orderinfoadmin";


            case "seedrawing":

                return "drawing";


            case "seebomline":


                return "bomline";


            case "authorize":

                return "allordersadmin";
        }


        return "orderinfoadmin";
    }
}
