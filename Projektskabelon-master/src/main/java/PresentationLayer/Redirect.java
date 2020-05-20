package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Denne klasse navigerer til de forskellige JSP- sider
 * @author Kernen
 */
public class Redirect extends Command {

    /**
     *
     * @param request
     * @param response
     * @return destination
     * @throws LoginSampleException
     */

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
            case "requestpage" : break;
            case "employeepage" : break;

        }

        return destination;

    }

}
