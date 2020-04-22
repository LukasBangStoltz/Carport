package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrder extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int carportLength = Integer.parseInt(request.getParameter("carportlength"));
        int carportWidth = Integer.parseInt(request.getParameter("carportwidth"));
        int flatRoofType = Integer.parseInt(request.getParameter("flatrooftype"));

        LogicFacade.insertFlatCarport(carportLength,carportWidth,flatRoofType);
        return "index";
    }
}
