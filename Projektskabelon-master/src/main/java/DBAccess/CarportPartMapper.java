package DBAccess;

import FunctionLayer.BomPart;
import FunctionLayer.LoginSampleException;

import java.sql.*;
import java.util.List;

public class CarportPartMapper {



    public static void insertCarportPart(int orderID, List<BomPart> listOfBomParts, int carportID, String description) throws LoginSampleException {

        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO carport_part (carport_id, description, material_id) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            for (BomPart bp: listOfBomParts) {
                ps.setInt(1, carportID);
                ps.setString(2, bp.getDescription());
                ps.setInt(2, bp.getMaterial_id());

                ps.executeUpdate();
            }

            SQL = "INSERT INTO bom (order_id, mv_id, quantity) VALUES (?,?,?)";

            ps = con.prepareStatement(SQL);

            for (BomPart part : listOfBomParts) {
                ps.setInt(1, orderID);
                ps.setInt(2, part.getMv_id());
                ps.setInt(3, part.getQuantity());

                ps.executeUpdate();
            }

        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }


    }








}
