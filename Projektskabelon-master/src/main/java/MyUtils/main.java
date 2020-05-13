package MyUtils;


import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;

public class main {
    public static void main(String[] args) throws LoginSampleException {

        System.out.println(InitializeLists.getRequestList().get(0).getOrderId());

    }
}

