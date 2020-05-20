package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Denne klasse logger brugeren ud af sessionen
 *@author Kernen
 */
public class LogOut extends Command {

    /**
     *
     * @param request
     * @param response
     * @return index
     * @throws LoginSampleException
     */

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        request.getSession().invalidate();
        return "index";
    }
}
