package FunctionLayer;

import DBAccess.CarportMapper;
import DBAccess.MaterialMapper;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;

import java.util.ArrayList;
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

    public static User createUser(String name, String adress, String phoneNumber, String email, String password, String city) throws LoginSampleException {
        User user = new User(name, adress, phoneNumber, email, password, city, "customer");
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

    public static void insertFlatCarport(int length, int width, int roofMat) throws LoginSampleException {
        OrderMapper.insertFlatCarport(length, width, roofMat);
    }

    public static ArrayList<PlankMaterial> GetAllFlatPlanksMat() throws LoginSampleException {
        return MaterialMapper.GetAllFlatPlanksMat();
    }

    public static ArrayList<FlatScrewMaterial> GetAllFlatScrewMaterial() throws LoginSampleException {
        return MaterialMapper.GetAllFlatScrewMaterial();
    }

}
