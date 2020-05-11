package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Svg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Drawing extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int width = (int) request.getSession().getAttribute("carportWidth");
        int length = (int) request.getSession().getAttribute("carportLength");
        String viewbox = "0,0,%d,%d";
        String.format(viewbox, length, width);


        Svg svg = new Svg(length, width, viewbox,0,0);
        svg.addRect(0,0,width,length);
        svg.addRect(0,35,4,length);
        svg.addRect(0,width-35,4,length);

        //  Svg svgInnerDrawing = new Svg(900,800,"0,0,900,800",0,0);


        //spær
        int spær = 0;


        while (spær <= length  ) {


            svg.addRect(2+spær, 0, width, 4);
            spær = spær + 55;

        }

        request.setAttribute("svgdrawing", svg.toString());




        return "drawing";


    }
}
