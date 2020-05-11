package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Svg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Drawing extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int carportWidth = (int) request.getSession().getAttribute("carportWidth");
        int carportLength = (int) request.getSession().getAttribute("carportLength");
        String viewbox = "0,0,%d,%d";
        String viewbox2 = "0, 0, %d, %d";
        String.format(viewbox2, carportLength + 200, carportWidth + 200);
        String.format(viewbox, carportLength, carportWidth);

        Svg svgOuterDrawing = new Svg(carportWidth + 100,carportLength + 100,viewbox2,0,0);
        svgOuterDrawing.addLine(0, 0, 0, 800);
        Svg svg = new Svg(carportLength, carportWidth, viewbox,0,0);
        svg.addRect(0,0,carportWidth,carportLength);
        svg.addRect(0,35,4,carportLength);
        svg.addRect(0,carportWidth-35,4,carportLength);


        //spær
        int spær = 0;
        while (spær <= carportLength  ) {
            svg.addRect(spær, 0, carportWidth, 4);
            spær = spær + 55;

        }

        //stolper
        int stolpe = 108;
        while(stolpe <= carportLength){
            svg.addRect(stolpe,33,8,8);
            svg.addRect(stolpe,carportWidth-37,8,8);
            stolpe += 300;
        }



        //kryds
        svg.addLine(55,35, carportLength - 55,carportWidth - 35);
        svg.addLine(55,carportWidth - 35, carportLength - 55,35);






        request.setAttribute("svgdrawing", svg.toString());
        return "drawing";


    }
}
