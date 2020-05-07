package MyUtils;

import FunctionLayer.LogicFacade;

public class HelperFunctions {

    public static boolean checkSkurSize(int toolshed_length, int toolshed_width, int carport_length, int carport_width) {

        boolean isValid = false;


        if (toolshed_length <= carport_length - 30 && toolshed_width <= carport_width - 30) {
            isValid = true;
        }

        if (toolshed_length == 0 || toolshed_width == 0) {
            isValid = true;
        }

        return isValid;


    }

    public static boolean hasToolShed(int skurLength, int skurWidth) {

        boolean hasToolShed = true;

        if (skurLength == 0 || skurWidth == 0) {

            hasToolShed = false;

        }

        return hasToolShed;


    }

    public static String checkAction(String flatCarPort, String raisedCarPort, boolean hasToolShed) {
        String action = "";

        if (flatCarPort != null && !hasToolShed) {
            action = "flatcarport";

        }
        if (flatCarPort != null && hasToolShed) {
            action = "flatcarporttoolshed";
        }
        if (raisedCarPort != null && !hasToolShed) {
            action = "raisedcarport";
        }
        if (raisedCarPort != null && hasToolShed) {
            action = "raisedrooftoolshed";
        }

        return action;

    }

    public static void makeFlatCarport(int carport_length, int carport_width, int toolShedLength, boolean hasToolShed) {

        Calc.understernForOgBag(carport_width);
        Calc.understernSider(carport_length);
        Calc.oversternFor(carport_width);
        Calc.oversternSider(carport_length);
        Calc.remmeSider(carport_length);
        Calc.spærTilRem(carport_width, carport_length);
        Calc.calcStolper(carport_length, toolShedLength, hasToolShed);
        Calc.vandbrædtSider(carport_length);
        Calc.vandbrædtFor(carport_width);
        Calc.tagpladerLang(carport_length);
        Calc.tagpladerKort(carport_length);
        Calc.plastmoBundskruer();
        Calc.hulbånd();
        Calc.universalHøjre();
        Calc.universalVenstre();
        Calc.skruer200stk();
        Calc.beslagskruer();
        Calc.bræddebolt();
        Calc.firkantskriver();
        Calc.skruer400stk();
        Calc.skruer300stk();


    }

    public static void makeFlatCarportToolShed(int carport_length, int carport_width, int toolShedLength, int toolShedWidth, boolean hasToolShed) {

        Calc.understernForOgBag(carport_width);
        Calc.understernSider(carport_length);
        Calc.oversternFor(carport_width);
        Calc.oversternSider(carport_length);
        Calc.lægteTilZDørSkur();
        Calc.løsholterSkurGavle(toolShedWidth);
        Calc.løsholterSkurSider(toolShedLength);
        Calc.remmeSider(carport_length);
        Calc.spærTilRem(carport_width, carport_length);
        Calc.calcStolper(carport_length, toolShedLength, hasToolShed);
        Calc.vandbrædtSider(carport_length);
        Calc.vandbrædtFor(carport_width);
        Calc.tagpladerLang(carport_length);
        Calc.tagpladerKort(carport_length);
        Calc.plastmoBundskruer();
        Calc.hulbånd();
        Calc.universalHøjre();
        Calc.universalVenstre();
        Calc.skruer200stk();
        Calc.beslagskruer();
        Calc.bræddebolt();
        Calc.firkantskriver();
        Calc.skruer400stk();
        Calc.skruer300stk();
        Calc.stalddørsgreb();
        Calc.tHængsel();
        Calc.vinkelbeslag();

    }

    public static void makeRaisedCarport(int carport_length, int carport_width, int toolShedLength, int toolShedWidth, boolean hasToolShed) {

        Calc.vindskeder(carport_width);
        Calc.sternbrædderTilSiderCarp(carport_length);
        Calc.calcStolper(carport_length, toolShedLength, hasToolShed);
        Calc.spærTilRem(carport_width,carport_length);
        Calc.remmeSider(carport_length);
        Calc.vandBrædtPåVindskeder(carport_width);
        Calc.taglægterTilSpær(carport_width);
        Calc.toplægterTilRygsten(carport_width);
        Calc.universalVenstre();
        Calc.universalHøjre();
        Calc.vinkelbeslag();
        Calc.skruer200stk();
        Calc.beslagskruer();
        // mangler 100 stk skruer til taglægter
        Calc.bræddebolt();
        Calc.firkantskriver();
        Calc.skruer200stk();
        // mangler skruer 300 stk til montering af inderste bræt ved beklædning
    }

    public static void makeRaisedCarportToolShed(int carport_length, int carport_width, int toolShedLength, int toolShedWidth, boolean hasToolShed) {
        Calc.vindskeder(carport_width);
        Calc.sternbrædderTilSiderCarp(carport_length);
        Calc.sternbrædderTilSiderSkur(toolShedLength);
        Calc.calcStolper(carport_length, toolShedLength, hasToolShed);
        Calc.spærTilRem(carport_width,carport_length);
        Calc.remmeSider(carport_length);
        Calc.løsholterSkurSider(toolShedLength);
        Calc.løsholterSkurGavle(toolShedWidth);
        Calc.vandBrædtPåVindskeder(carport_width);
        // mangler beklædning af gavle og skur
        // mangler tagfodslægte..
        // mangler taglægte til z på bagside af dør
        Calc.taglægterTilSpær(carport_width);
        Calc.toplægterTilRygsten(carport_width);
        // mangler tagpakken

        Calc.universalHøjre();
        Calc.universalVenstre();
        Calc.stalddørsgreb();
        Calc.tHængsel();
        Calc.vinkelbeslag();
        Calc.skruer200stk();
        Calc.beslagskruer();
        // mangler 100 stk skruer til taglægter

        Calc.bræddebolt();
        Calc.firkantskriver();
        Calc.skruer200stk();
        // mangler skruer 300 stk til montering af inderste bræt ved beklædning
    }

}