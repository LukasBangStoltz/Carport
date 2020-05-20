package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import MyUtils.InitializeLists;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Denne klasse afgør ud fra hvilket login om man dirigeres over til admin eller customer page
 * @author Kernen
 */
public class Login extends Command {


    /**
     * @param request
     * @param response
     * @return destination
     * @throws LoginSampleException
     */
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = LogicFacade.login(email, password);
        String destination = "";

        HttpSession session = request.getSession();

        session.setAttribute("user", user);
        session.setAttribute("role", user.getRole());
        session.setAttribute("email", email);  // ellers skal man skrive  user.email på jsp siderne og det er sgu lidt mærkeligt at man har adgang til private felter. Men måske er det meget fedt , jeg ved det ikke
        int userId = LogicFacade.getUserId(email);
        session.setAttribute("userId", userId);


        if (user.getRole().equals("employee")) {

            destination = "allordersadmin";

        } else {

            destination = "index";
        }

        return destination;
    }

}
