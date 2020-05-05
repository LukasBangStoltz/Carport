package MyUtils;

import FunctionLayer.LogicFacade;

public class HelperFunctions {

    public static boolean checkSkurSize(int toolshed_length_id, int toolshed_width_id, int carport_length_id, int carport_width_id) {

        boolean isValid = false;

        int carport_length = LogicFacade.getCarportLengthFromId(carport_length_id);
        int carport_width = LogicFacade.getCarportWidthFromId(carport_width_id);
        int toolshed_length = LogicFacade.getToolShedLengthsFromId(toolshed_length_id);
        int toolshed_width = LogicFacade.getToolShedWidthsFromId(toolshed_width_id);


        if (toolshed_length < carport_length-30 && toolshed_width < carport_width-30) {
            isValid = true;
        }

        if (toolshed_length_id == 0 || toolshed_width_id == 0) {
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
}
