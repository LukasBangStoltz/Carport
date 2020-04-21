package FunctionLayer;

import DBAccess.CarportMapper;
import DBAccess.UserMapper;

import java.util.List;

/**
 * The purpose of LogicFacade is to...
 *
 * @author kasper
 */
public class LogicFacade {

    public static User login(String email, String password) throws LoginSampleException {
        return UserMapper.login(email, password);
    }

    public static User createUser(String email, String password) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
        return user;
    }

    public static List<CarportWidth> getAllWidths() throws LoginSampleException {
        return CarportMapper.GetAllWidths();
    }

    public static List<CarportLength> getAllLengths() throws LoginSampleException {
        return CarportMapper.GetAllLengths();
    }

    public static List<FlatRoofType> getAllFlatRootTypes() throws LoginSampleException {
        return CarportMapper.GetAllFlatRoofTypes();
    }

    public static List<RaisedRoofType> GetAllRaisedRoofType() throws LoginSampleException {
        return CarportMapper.GetAllRaisedRoofTypes();
    }

    public static List<RoofTilt> GetAllRaisedRoofDegress() throws LoginSampleException {
        return CarportMapper.GetAllRaisedRoofDegress();
    }
    public static List<ToolShedLength> GetAllToolShedLengths() throws LoginSampleException {
        return CarportMapper.GetAllToolShedLengths();
    }
    public static List<ToolShedWidth> GetAllToolShedWidhts() throws LoginSampleException {
        return CarportMapper.GetAllToolShedWidths();
    }

}
