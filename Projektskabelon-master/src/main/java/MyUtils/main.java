package MyUtils;


import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;

public class main {
    public static void main(String[] args) throws LoginSampleException {

        //System.out.println(LogicFacade.getCarportLengthFromId(1));
        //System.out.println(LogicFacade.getCarportWidthFromId(1));
        System.out.println(LogicFacade.getBomLineFromCarport(67).get(0).getName());

    }
}

