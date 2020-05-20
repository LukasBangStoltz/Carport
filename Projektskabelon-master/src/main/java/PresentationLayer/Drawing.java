package PresentationLayer;

import FunctionLayer.LoginSampleException;
import MyUtils.HelperFunctions;
import MyUtils.HelperFunctionsDrawing;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Denne klasse laver svg tegninger ud fra de mål kundens vælger
 * @author Kernen
 */

public class Drawing extends Command {

    /**
     *
     * @param request
     * @param response
     * @return drawingpage
     * @throws LoginSampleException
     */
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {


        int carportWidth = (int) request.getSession().getAttribute("carportWidth");
        int carportLength = (int) request.getSession().getAttribute("carportLength");
        int toolshed_length = (int) request.getSession().getAttribute("toolshedLength");
        int toolshed_width = (int) request.getSession().getAttribute("toolshedWidth");
        String flatRoof = (String) request.getSession().getAttribute("flatRoof");
        String raisedroof = request.getParameter("raisedRoof");
        boolean hasToolShed = (boolean) request.getSession().getAttribute("hasToolShed");


        String action = HelperFunctions.checkActionDrawing(flatRoof, raisedroof);

        String generatedSvgTop = "";

        String generatedSvgSide = "";

        switch (action) {

            case "flatcarport":

                generatedSvgTop = HelperFunctionsDrawing.drawFlatCarportTop(carportLength, carportWidth, hasToolShed, toolshed_length, toolshed_width);

                generatedSvgSide = HelperFunctionsDrawing.drawFlatCarportSide(carportLength, hasToolShed, toolshed_length);

                break;


            case "raisedroof":


                break;



        }


        request.setAttribute("svgdrawingtop", generatedSvgTop);
        request.setAttribute("svgdrawingside", generatedSvgSide);

        return "drawing";


    }
}
