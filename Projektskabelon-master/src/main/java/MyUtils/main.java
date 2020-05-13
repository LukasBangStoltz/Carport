package MyUtils;


import DBAccess.OrderMapper;
import FunctionLayer.LoginSampleException;

public class main {
    public static void main(String[] args) throws LoginSampleException {

        System.out.println(OrderMapper.getOrder(4).getToolshedLengthId());

    }
}

