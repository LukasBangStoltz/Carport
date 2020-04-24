package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import MyUtils.HelperFunctions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrder extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int carportLength = Integer.parseInt(request.getParameter("carportlength"));
        int carportWidth = Integer.parseInt(request.getParameter("carportwidth"));
        int flatRoofType = Integer.parseInt(request.getParameter("flatrooftype"));
        int skurLength = Integer.parseInt(request.getParameter("toolshedlength"));
        int skurWidth = Integer.parseInt(request.getParameter("toolshedwidth"));

        boolean isValid = HelperFunctions.checkSkurSize(skurLength, skurWidth, carportLength, carportWidth);

        if (isValid) {
            // lav om i dataMapper
          //  LogicFacade.insertFlatCarport(carportLength, carportWidth, flatRoofType);
            return "index";
        } else{

            request.setAttribute("error", "Dit skurs mål må ikke overskride dine carports mål");
        }



        return "carportvalgpage";
    }
}
