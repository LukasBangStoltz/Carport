package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import MyUtils.InitializeLists;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * The purpose of Login is to...
 *
 * @author kasper
 */
public class Login extends Command {

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


        if (request.getSession().getAttribute("requestListCustomer") == null) {
            request.getSession().setAttribute("requestListCustomer", InitializeLists.initRequestListCustomer(userId));
        }


        if (user.getRole().equals("employee")) {
            destination = "employeepage";
        } else {
            destination = "index";
        }

        return destination;
    }

}
