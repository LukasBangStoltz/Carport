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
            case "carportvalgpage": break;
            case "carportmedrejsning": break;
            case "carportmedfladttag": break;
            case "kurvpage": break;
        }

        return destination;

    }

}
