package MyUtils;

import FunctionLayer.Svg;

public class HelperFunctionsDrawing {

    public static String drawFlatCarport(int carportLength, int carportWidth) {

        String generatedSvg = "";

        String innerViewbox = String.format("0,0,%d,%d", carportLength, carportWidth);
        String outerViewbox = String.format("0,0,%d,%d", carportLength + 100, carportWidth + 100);

        Svg svgOuterDrawing = new Svg(carportLength + 100, carportWidth + 100, outerViewbox, 0, 0);
        svgOuterDrawing.addArrowsDefs();
        Svg svgInnerDrawing = new Svg(carportLength, carportWidth, innerViewbox, 75, 10);


        //inner
        svgInnerDrawing.addRect(0, 0, carportWidth, carportLength);
        svgInnerDrawing.addRect(0, 35, 4, carportLength);
        svgInnerDrawing.addRect(0, carportWidth - 35, 4, carportLength);


        //outer
        //carport width
        svgOuterDrawing.addArrows(40, 10, 40, carportWidth + 7);
        svgOuterDrawing.addWidthText(20, carportWidth / 2, carportWidth);

        //carportlength
        svgOuterDrawing.addArrows(75, carportWidth + 50, carportLength + 75, carportWidth + 50);
        svgOuterDrawing.addLengthText((carportLength + 150) / 2, carportWidth + 70, carportLength);


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
            svgInnerDrawing.addRect(carportLength - 8, carportWidth - 37, 8, 8);
            svgInnerDrawing.addRect(carportLength - 8, 33, 8, 8);
        } else {
            while (stolpe <= carportLength) {
                svgInnerDrawing.addRect(stolpe, 33, 8, 8);
                svgInnerDrawing.addRect(stolpe, carportWidth - 37, 8, 8);
                stolpe += 300;
            }
        }


        //kryds
        svgInnerDrawing.addDashLine(55, 35, carportLength - 55, carportWidth - 35);
        svgInnerDrawing.addDashLine(55, carportWidth - 35, carportLength - 55, 35);

        svgOuterDrawing.addSvgDrawing(svgInnerDrawing);


        generatedSvg = svgOuterDrawing.toString();

        return generatedSvg;


    }


}
