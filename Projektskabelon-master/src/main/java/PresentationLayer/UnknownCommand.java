package PresentationLayer;

import FunctionLayer.LoginSampleException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Denne klasse kaster en error hvis noget går galt
 * @author Kernen
 */
public class UnknownCommand extends Command {

    /**
     *
     * @param request
     * @param response
     * @return
     * @throws LoginSampleException
     */

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
        String msg = "Unknown command. Contact IT";
        throw new LoginSampleException( msg );
    }

}
