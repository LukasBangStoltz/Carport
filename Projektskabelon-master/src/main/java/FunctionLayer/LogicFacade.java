package FunctionLayer;

import DBAccess.*;

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

    public static List<RoofType> getAllFlatRootTypes() throws LoginSampleException {
        return CarportMapper.GetAllFlatRoofTypes();
    }

    public static List<RoofType> GetAllRaisedRoofType() throws LoginSampleException {
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

    public static void insertCarportPart(int orderID, List<BomPart> listOfBomParts, int carportID) throws LoginSampleException {
        CarportPartMapper.insertCarportPart(orderID,listOfBomParts,carportID);
    }

    public static int insertCarportNoToolShed(String carport_type, int user_id, int carport_length_id, int carport_width_id, int carport_tilt_id, int carport_rooftype_id) throws LoginSampleException {
        return OrderMapper.insertCarportNoToolShed(carport_type,user_id,carport_length_id,carport_width_id,carport_tilt_id,carport_rooftype_id);
    }


    public static List<MaterialVariants> GetMaterialVariants() throws LoginSampleException {
        return MaterialMapper.GetMaterialVariants();
    }

    public static List<Material> GetMaterials() throws LoginSampleException {

        return MaterialMapper.GetMaterials();
    }

    public static List<BomLine> getBomLineFromCarport(int carport_id) throws LoginSampleException {
        return BomMapper.getBomLineFromCarport(carport_id);
    }

}