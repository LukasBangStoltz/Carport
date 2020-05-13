package MyUtils;

import java.util.ArrayList;

public class HelperFunctions {

    public static boolean checkSkurSize(int toolshedLength, int toolshedWidth, int carportLength, int carportWidth) {

        boolean isValid = false;


        if (toolshedLength <= carportLength - 30 && toolshedWidth <= carportWidth - 30) {
            isValid = true;
        }

        if (toolshedLength == 0 || toolshedWidth == 0) {
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
            action = "raisedroof";
        }
        if (raisedCarPort != null && hasToolShed) {
            action = "raisedrooftoolshed";
        }

        return action;

    }
    public static String checkActionDrawing(String flatCarPort, String raisedCarPort) {
        String action = "";

        if (flatCarPort != null){
            action = "flatcarport";

        }

        if (raisedCarPort != null) {
            action = "raisedroof";
        }


        return action;

    }
    public static void makeFlatCarport(int carportLength, int carportWidth, int toolShedLength, boolean hasToolShed) {

        Calc.understernForOgBag(carportWidth);
        Calc.understernSider(carportLength);
        Calc.oversternFor(carportWidth);
        Calc.oversternSider(carportLength);
        Calc.remmeSider(carportLength);
        Calc.spærTilRem(carportWidth, carportLength);
        Calc.calcStolper(carportLength, toolShedLength, hasToolShed);
        Calc.vandbrædtSider(carportLength);
        Calc.vandbrædtFor(carportWidth);
        Calc.tagpladerLang(carportLength);
        Calc.tagpladerKort(carportLength);
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

    public static void makeFlatCarportToolShed(int carportLength, int carportWidth, int toolShedLength, int toolShedWidth, boolean hasToolShed) {

        Calc.understernForOgBag(carportWidth);
        Calc.understernSider(carportLength);
        Calc.oversternFor(carportWidth);
        Calc.oversternSider(carportLength);
        Calc.lægteTilZDørSkur();
        Calc.løsholterSkurGavle(toolShedWidth);
        Calc.løsholterSkurSider(toolShedLength);
        Calc.remmeSider(carportLength);
        Calc.spærTilRem(carportWidth, carportLength);
        Calc.calcStolper(carportLength, toolShedLength, hasToolShed);
        Calc.vandbrædtSider(carportLength);
        Calc.vandbrædtFor(carportWidth);
        Calc.tagpladerLang(carportLength);
        Calc.tagpladerKort(carportLength);
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

    public static void makeRaisedCarport(int carportLength, int carportWidth, int toolShedLength, int toolShedWidth, boolean hasToolShed) {

        Calc.vindskeder(carportWidth);
        Calc.sternbrædderTilSiderCarp(carportLength);
        Calc.calcStolper(carportLength, toolShedLength, hasToolShed);
        Calc.spærTilRem(carportWidth, carportLength);
        Calc.remmeSider(carportLength);
        Calc.vandBrædtPåVindskeder(carportWidth);
        Calc.taglægterTilSpær(carportWidth);
        Calc.toplægterTilRygsten(carportWidth);


        Calc.universalVenstre();
        Calc.universalHøjre();
        Calc.vinkelbeslag();
        Calc.skruer200stk();
        Calc.beslagskruer();
        Calc.skruer100Raised();
        Calc.bræddebolt();
        Calc.firkantskriver();
        Calc.skruer200stk();
        Calc.skruer300stk();

        Calc.dobbeltSSort(carportWidth, carportLength);
        Calc.rygstenSort(carportLength, carportWidth);
        // todo: Calc.toplægteHolder();
        //todo: Calc.rygstenBeslag();
        Calc.tagstenBindereOgNakkekrog();


    }

    public static void makeRaisedCarportToolShed(int carportLength, int carportWidth, int toolShedLength, int toolShedWidth, boolean hasToolShed) {
        Calc.vindskeder(carportWidth);
        Calc.sternbrædderTilSiderCarp(carportLength);
        Calc.sternbrædderTilSiderSkur(toolShedLength);
        Calc.calcStolper(carportLength, toolShedLength, hasToolShed);
        Calc.spærTilRem(carportWidth, carportLength);
        Calc.remmeSider(carportLength);
        Calc.løsholterSkurSider(toolShedLength);
        Calc.løsholterSkurGavle(toolShedWidth);
        Calc.vandBrædtPåVindskeder(carportWidth);
        Calc.ovenPåTagfodslægte(carportLength);
        Calc.lægteTilZDørSkur();
        Calc.taglægterTilSpær(carportWidth);
        Calc.toplægterTilRygsten(carportWidth);
        // mangler tagpakken


        Calc.universalHøjre();
        Calc.universalVenstre();
        Calc.stalddørsgreb();
        Calc.tHængsel();
        Calc.vinkelbeslag();
        Calc.skruer200stk();
        Calc.beslagskruer();
        Calc.skruer100Raised();
        Calc.bræddebolt();
        Calc.firkantskriver();
        Calc.skruer200stk();
        Calc.skruer300stk();


        Calc.dobbeltSSort(carportWidth, carportLength);
        Calc.rygstenSort(carportLength, carportWidth);
        // todo: Calc.toplægteHolder();
        //todo: Calc.rygstenBeslag();
        Calc.tagstenBindereOgNakkekrog();
    }

    public static void resetBom() {
        if (Calc.carportPartList != null) {
            Calc.carportPartList = new ArrayList<>();
        }

    }
}
