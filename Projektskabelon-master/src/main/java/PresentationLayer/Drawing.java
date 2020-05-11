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

        String innerViewbox = String.format("0,0,%d,%d",carportLength, carportWidth);

        String outerViewbox = String.format("0,0,%d,%d",carportLength + 100, carportWidth + 100);



        Svg svgOuterDrawing = new Svg(carportLength + 100, carportWidth + 100, outerViewbox, 0, 0);
        Svg svgInnerDrawing = new Svg(carportLength, carportWidth, innerViewbox, 75, 10);


        //inner
        svgInnerDrawing.addRect(0, 0, carportWidth, carportLength);
        svgInnerDrawing.addRect(0, 35, 4, carportLength);
        svgInnerDrawing.addRect(0, carportWidth - 35, 4, carportLength);
        //outer
        svgOuterDrawing.addLine(50 , 50, 50, 100);


        //spær
        int spær = 0;
        while (spær <= carportLength) {
            svgInnerDrawing.addRect(spær, 0, carportWidth, 4);
            spær = spær + 55;

        }

        //stolper
        int stolpe = 108;
        if (carportLength < 410) {
            svgInnerDrawing.addRect(stolpe, 33, 8, 8);
            svgInnerDrawing.addRect(stolpe, carportWidth - 37, 8, 8);
            svgInnerDrawing.addRect(carportLength-8, carportWidth - 37, 8, 8);
            svgInnerDrawing.addRect(carportLength-8, 33, 8, 8);
        } else{
            while (stolpe <= carportLength) {
                svgInnerDrawing.addRect(stolpe, 33, 8, 8);
                svgInnerDrawing.addRect(stolpe, carportWidth - 37, 8, 8);
                stolpe += 300;
            }
    }


    //kryds
        svgInnerDrawing.addDashLine(55,35,carportLength -55,carportWidth -35);
        svgInnerDrawing.addDashLine(55,carportWidth -35,carportLength -55,35);




        svgOuterDrawing.addSvgDrawing(svgInnerDrawing);

        request.setAttribute("svgdrawing",svgOuterDrawing.toString());

        return"drawing";


}
}
