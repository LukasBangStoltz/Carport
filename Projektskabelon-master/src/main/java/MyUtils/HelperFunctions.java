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

    public static String checkAction(String flatCarPort, String raisedCarPort, boolean hasToolShed){
        String action = "";

        if(flatCarPort != null && !hasToolShed){
            action = "flatcarport";

        }
        if(flatCarPort != null && hasToolShed){
            action = "flatcarporttoolshed";
        }
        if(raisedCarPort !=null && !hasToolShed){
            action = "raisedcarport";
        }
        if(raisedCarPort !=null && hasToolShed){
            action = "raisedrooftoolshed";
        }

        return action;

    }

    public static void makeFlatCarport(int carport_length, int carport_width){


    }

    public static void makeFlatCarportToolShed(int carport_length, int carport_width){

    }
    public static void makeRaisedCarport(int carport_length, int carport_width){


    }
    public static void makeRaisedCarportToolShed(int carport_length, int carport_width){




    }

}