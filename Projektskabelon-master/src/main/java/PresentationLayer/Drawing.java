package PresentationLayer;

import FunctionLayer.LoginSampleException;
import MyUtils.HelperFunctions;
import MyUtils.HelperFunctionsDrawing;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Drawing extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        int carportWidth = (int) request.getSession().getAttribute("carportWidth");
        int carportLength = (int) request.getSession().getAttribute("carportLength");
        int toolshedLength = (int) request.getSession().getAttribute("toolshedLength");
        int toolshedWidth = (int) request.getSession().getAttribute("toolshedWidth");
        String flatRoof = (String) request.getSession().getAttribute("flatRoof");
        String raisedroof = request.getParameter("raisedRoof");
        boolean hasToolShed = (boolean) request.getSession().getAttribute("hasToolShed");


        String action = HelperFunctions.checkActionDrawing(flatRoof, raisedroof);

        String generatedSvgTop = "";

        String generatedSvgSide = "";

        switch (action) {

            case "flatcarport":

                generatedSvgTop = HelperFunctionsDrawing.drawFlatCarportTop(carportLength, carportWidth, hasToolShed, toolshedLength, toolshedWidth);

                generatedSvgSide = HelperFunctionsDrawing.drawFlatCarportSide(carportLength, hasToolShed, toolshedLength);

                break;


            case "raisedroof":


                break;


        }


        request.setAttribute("svgdrawingtop", generatedSvgTop);
        request.setAttribute("svgdrawingside", generatedSvgSide);

        return "drawing";


    }
}
