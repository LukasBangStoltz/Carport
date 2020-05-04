package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Redirect extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        String destination = request.getParameter("destination");

        switch (destination){
            case "index": break;
            case "carportchoice": break;
            case "carporttilt": break;
            case "carportflat": break;
            case "basket": break;
            case "loginpage" : break;
        }

        return destination;

    }

}
