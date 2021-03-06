package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Registerklassen gør at man kan oprette til en bruger til at købe carporte
 * @author Kernen
 */

public class Register extends Command {

    /**
     *
     * @param request
     * @param response
     * @return index
     * @throws LoginSampleException
     */

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        String email = request.getParameter("email");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        String name = request.getParameter("name");
        String adress = request.getParameter("adress");
        String phoneNumber = request.getParameter("phoneNumber");
        String city = request.getParameter("city");


        if (password1.equals(password2)) {
            User user = LogicFacade.createUser(name, adress, phoneNumber, email, password1, city);
            HttpSession session = request.getSession();

            session.setAttribute("email", email);
            session.setAttribute("user", user);
            session.setAttribute("role", user.getRole());


            int userId = LogicFacade.getUserId(email);
            session.setAttribute("userId", userId);


            return "index";
        } else {
            request.setAttribute("error","Passwords skal være ens");
        }
        return "index";
    }

}
