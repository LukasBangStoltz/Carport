package DBAccess;

import FunctionLayer.BomLine;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Material;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BomMapper {


    public static List<BomLine> getBomLineFromCarport(int carport_id) throws LoginSampleException {
        List<BomLine> listOfBomLine = null;

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT M.material_id, name, dimension, unit, length, price, conp.carport_part_id, conp.description, cp.carport_id FROM materials as M\n" +
                    "INNER JOIN material_variants as MV ON M.material_id=MV.material_id\n" +
                    "JOIN concrete_part as conp ON MV.material_id=conp.material_id\n" +
                    "JOIN carport_part as cp ON conp.carport_part_id=cp.carport_part_id WHERE carport_id = ?";

            PreparedStatement ps = con.prepareStatement(SQL);

            ps.setInt(1, carport_id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (listOfBomLine == null) {
                    listOfBomLine = new ArrayList<>();
                }

                int material_id = rs.getInt("material_id");
                String name = rs.getString("name");
                String dimension = rs.getString("dimension");
                String unit = rs.getString("unit");
                int length = rs.getInt("length");
                int price = rs.getInt("price");
                int carport_part_id = rs.getInt("carport_part_id");
                String description = rs.getString("description");
                int carport_id = rs.getInt("carport_id");




            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return listOfBomLine;
    }

}
