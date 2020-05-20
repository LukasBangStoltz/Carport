package FunctionLayer;

/**
 *
 * @author Kernen
 * LoginSampleExeption kan kaste custom error beskeder
 */
public class LoginSampleException extends Exception {
    /**
     *
     * @param msg
     */
    public LoginSampleException(String msg) {
        super(msg);
    }
    

}
