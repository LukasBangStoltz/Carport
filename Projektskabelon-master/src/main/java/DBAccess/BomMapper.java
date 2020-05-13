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
            String SQL = "SELECT * FROM orders o\n" +
                    "INNER JOIN bom b on o.order_id = b.order_id\n" +
                    "INNER JOIN carport c on c.carport_id = o.carport_id\n" +
                    "INNER JOIN material_variants mv on b.mv_id = mv.mv_id\n" +
                    "INNER JOIN materials m on mv.material_id = m.material_id where c.carport_id = ?;";

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
                String description = rs.getString("description");
                int quantity = rs.getInt("quantity");

                BomLine bL = new BomLine(material_id, name, dimension, unit, length,
                        price, description, carport_id,quantity);

                listOfBomLine.add(bL);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        return listOfBomLine;
    }

}
