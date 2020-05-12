package MyUtils;

import FunctionLayer.Svg;

public class HelperFunctionsDrawing {

    public static String drawFlatCarportSide(int carportLength, boolean hasToolShed, int toolShedLenght){
        String generatedSvg = "";

        String innerViewbox = String.format("0,0,%d,%d", carportLength, 220);
        String outerViewbox = String.format("0,0,%d,%d", carportLength + 100, 220 + 100);

        Svg svgOuterDrawing = new Svg(carportLength + 100, 220 + 100, outerViewbox, 0,0);
        Svg svgInnerDrawing = new Svg(carportLength, 220, innerViewbox, 75, 10);

        //inner
        //linje på bund
        svgInnerDrawing.addLine(0,220,carportLength,220);

        //stolper
        int stolpe = 108;
        if (carportLength < 410) {
            svgInnerDrawing.addRect(carportLength - 8, 33, 200, 15);

        } else {
            while (stolpe <= carportLength) {
                svgInnerDrawing.addRect(stolpe, 33, 200, 15);
                stolpe += 300;

            }
            if(carportLength-stolpe >=-150){
                svgInnerDrawing.addRect(carportLength-15, 33, 200, 15);
            }
        }

        //tag
        svgInnerDrawing.addRect(0,25,10,carportLength);
        svgInnerDrawing.addRect(0,15,10,carportLength);

        //skur
        /*if(hasToolShed){
            int længde = carportLength - toolShedLenght;
            while(længde <= carportLength)
            svgInnerDrawing.addRect(længde, 0, 195, 10);
            længde += 10;
        }*/

        //outer
        //Arrow

        generatedSvg = svgInnerDrawing.toString();

        return generatedSvg;
    }

    public static String drawFlatCarportTop(int carportLength, int carportWidth, boolean hasToolShed, int toolShedLength, int toolShedWidth) {

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
        //Arrow
        svgOuterDrawing.addArrows(30, 10, 30, carportWidth + 7);
        svgOuterDrawing.addWidthText(20, carportWidth / 2, carportWidth);

        //Arrow
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
            if(carportLength-stolpe >=-150){
                svgInnerDrawing.addRect(carportLength-15, carportWidth - 37, 8, 8);
                svgInnerDrawing.addRect(carportLength-15, 35, 8, 8);
            }
        }





        if (hasToolShed){
            //svgInnerDrawing.addRect(carportLength-toolShedLength, 35, toolShedLength, toolShedWidth);

            //SkurStreger
            svgInnerDrawing.addDashLine(carportLength-toolShedLength, carportWidth-35, carportLength-toolShedLength,carportWidth-toolShedWidth);
            svgInnerDrawing.addDashLine(carportLength-toolShedLength,carportWidth-toolShedWidth, carportLength-20, carportWidth-toolShedWidth);
            svgInnerDrawing.addDashLine(carportLength-20, carportWidth-toolShedWidth, carportLength-20, carportWidth-35);
            svgInnerDrawing.addDashLine(carportLength-20, carportWidth-35,carportLength-toolShedLength, carportWidth-35);

            //skurstolpe
            svgInnerDrawing.addRect(carportLength-toolShedLength-4, carportWidth-35-4, 8, 8);
            svgInnerDrawing.addRect(carportLength-toolShedLength-4,carportWidth-toolShedWidth-4, 8, 8);
            svgInnerDrawing.addRect(carportLength-20-4, carportWidth-toolShedWidth-4, 8, 8);
            svgInnerDrawing.addRect(carportLength-20-4, carportWidth-35-4, 8, 8);

            //SkurPile
            svgOuterDrawing.addArrows(65, carportWidth-15, 65, carportWidth-toolShedWidth);
            svgOuterDrawing.addWidthText(55, carportWidth-(toolShedWidth / 2), toolShedWidth);
            //kryds
            svgInnerDrawing.addDashLine(55, 35, carportLength -toolShedLength, carportWidth - 35);
            svgInnerDrawing.addDashLine(55, carportWidth - 35, carportLength-toolShedLength, 35);
        }else{
            //kryds
            svgInnerDrawing.addDashLine(55, 35, carportLength - 55, carportWidth - 35);
            svgInnerDrawing.addDashLine(55, carportWidth - 35, carportLength - 55, 35);

        }


        svgOuterDrawing.addSvgDrawing(svgInnerDrawing);


        generatedSvg = svgOuterDrawing.toString();

        return generatedSvg;


    }



}
