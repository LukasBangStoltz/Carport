package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import MyUtils.FlatRoofMatCalcFunctions;

public class main {

    public static void main(String[] args) throws LoginSampleException {
        System.out.println(FlatRoofMatCalcFunctions.calcOverSternSider(1000));
    }

}
