package DBAccess;

import FunctionLayer.Part;
import FunctionLayer.LoginSampleException;

import java.sql.*;
import java.util.List;

/**
 * Klasse vi bruger til at oprerer med databasen, herunder tabels: carport_part og bom
 */

public class CarportPartMapper {

    /**
     * Metode vi bruger til at de materiale der skal bruges til en bestemt ordre, herunder i carport_part og bom.
     * @param orderID
     * @param listOfParts
     * @param carportID
     * @throws LoginSampleException
     */

    public static void insertCarportPart(int orderID, List<Part> listOfParts, int carportID ) throws LoginSampleException {

        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO carport_part (carport_id, material_id) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            for (Part bp: listOfParts) {
                ps.setInt(1, carportID);
                ps.setInt(2, bp.getMaterial_id());

                ps.executeUpdate();
            }

            SQL = "INSERT INTO bom (order_id, mv_id, quantity, description) VALUES (?,?,?,?)";

            ps = con.prepareStatement(SQL);

            for (Part part : listOfParts) {
                ps.setInt(1, orderID);
                ps.setInt(2, part.getMv_id());
                ps.setDouble(3, part.getQuantity());
                ps.setString(4, part.getDescription());

                System.out.println(1);
                ps.executeUpdate();
            }

        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }


    }








}
