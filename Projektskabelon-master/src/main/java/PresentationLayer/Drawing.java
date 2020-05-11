package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Svg;
import MyUtils.Calc;
import MyUtils.HelperFunctions;
import MyUtils.HelperFunctionsDrawing;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Drawing extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        int carportWidth = (int) request.getSession().getAttribute("carportWidth");
        int carportLength = (int) request.getSession().getAttribute("carportLength");
        int toolshed_length = (int) request.getSession().getAttribute("toolshedLength");
        int toolshed_width = (int) request.getSession().getAttribute("toolshedWidth");
        String flatRoof = (String) request.getSession().getAttribute("flatRoof");
        String raisedroof = request.getParameter("raisedRoof");
        boolean hasToolShed = (boolean) request.getSession().getAttribute("hasToolShed");


        String action = HelperFunctions.checkAction(flatRoof, raisedroof, hasToolShed);

        String generatedSvg = "";

        switch (action) {

            case "flatcarport":

                generatedSvg = HelperFunctionsDrawing.drawFlatCarport(carportLength, carportWidth);


                break;

            case "flatcarporttoolshed":


                break;

            case "raisedroof":


                break;

            case "raisedrooftoolshed":


                break;

        }


        request.setAttribute("svgdrawing", generatedSvg);

        return "drawing";


    }
}
