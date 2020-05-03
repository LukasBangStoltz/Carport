package DBAccess;

import FunctionLayer.BomPart;
import FunctionLayer.LoginSampleException;

import java.sql.*;
import java.util.List;

public class CarportPartMapper {



    public static void insertCarportPart(int orderID, List<BomPart> listOfBomParts, int carportID) throws LoginSampleException {

        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO carport_part (carport_id) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, carportID);
            ps.executeUpdate();

            ResultSet ids = ps.getGeneratedKeys();

            int carport_part_id = ids.getInt(1);

            SQL = "INSERT INTO concrete_part (carport_part_id, material_id, description, mv_id, quantity) VALUES (?,?,?,?,?)";

            ps = con.prepareStatement(SQL);

            for (BomPart part : listOfBomParts) {
                ps.setInt(1,carport_part_id);
                ps.setInt(2, part.getMaterial_id());
                ps.setString(3, part.getDescription());
                ps.setInt(4, part.getMv_id());
                ps.setInt(5, part.getQuantity());

                ps.executeUpdate();
            }

            SQL = "INSERT INTO bom (order_id, carport_part_id) VALUES (?,?)";
            ps = con.prepareStatement(SQL);

            ps.setInt(1, orderID);
            ps.setInt(1, carport_part_id);

            ps.executeUpdate();


        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }


    }








}
