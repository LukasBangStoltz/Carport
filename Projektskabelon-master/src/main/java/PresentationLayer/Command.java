package PresentationLayer;

import FunctionLayer.LoginSampleException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {
    /**
     * Denne klasse modtager værdien fra frontcontroller og navigerer over
     * til den javaklasse som den har fået som værdi
     * @author Kernen
     */

    private static HashMap<String, Command> commands;


    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put("redirect", new Redirect());
        commands.put("makerequest", new MakeRequest());
        commands.put("logout", new LogOut());
        commands.put("drawing", new Drawing());
        commands.put("managerequestadmin", new ManageRequestAdmin());
        commands.put("managerequestcustomer", new ManageRequestCustomer());
    }

    /**
     * @param request
     * @return unknowncommand hvis det går galt
     */

    static Command from( HttpServletRequest request ) {
        String targetName = request.getParameter( "target" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(targetName, new UnknownCommand() );   // unknowncommand er default.
    }

    /**
     *
     * @param request
     * @param response
     * @return
     * @throws LoginSampleException
     */

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws LoginSampleException;

}
