package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KurvPage extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        String carportlength = request.getParameter("carportlength");
        String carportwidth = request.getParameter("carportwidth");
        String carportroof = request.getParameter("carportroof");
        String rooftype = request.getParameter("rooftype");
        String rooftilt = request.getParameter("rooftilt");
        String toolshedlength = request.getParameter("toolshedlength");
        String toolshedwidth = request.getParameter("toolshedwidth");
        String comments = request.getParameter("comments");

        request.setAttribute("carportlength", carportlength);
        request.setAttribute("carportwidth", carportwidth);
        request.setAttribute("carportroof", carportroof);
        request.setAttribute("rooftype", rooftype);
        request.setAttribute("rooftilt", rooftilt);
        request.setAttribute("toolshedlength", toolshedlength);
        request.setAttribute("toolshedwidth", toolshedwidth);
        request.setAttribute("comments", comments);

        return "basket";
    }
}
